package astrosmashing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import processing.core.PApplet;
import processing.core.PImage;

@SuppressWarnings("serial")
public class Astrosmashing extends PApplet {
	PImage img;
	Ship ship;
	
	List<Missile> missiles = new ArrayList<Missile>();
	List<Asteroid> asteroids = new ArrayList<Asteroid>();

	public static void main(String _args[]) {
		PApplet.main(new String[] { astrosmashing.Astrosmashing.class.getName() });
	}
	
	public void setup() {
		size(1024,768);
		background(0, 0, 0);
		ship = new Ship(this);
		asteroids.add(new Asteroid(this));
	}

	public void draw() {		
		if (keyPressed) {
			if (key == CODED) {
				if (keyCode == LEFT) {
					ship.moveLeft();
				}
				if (keyCode == RIGHT) {
					ship.moveRight();
				}
			} else {
				if (key == ' ') {
					missiles.add(new Missile(this, ship.getX()));
				}
			}
		}
		
		background(0);

		ship.display();
		
		for (Iterator<Missile> i = missiles.iterator(); i.hasNext(); ) {
			Missile m = i.next();
			m.update();
			m.display();
        }
		
		for (Iterator<Asteroid> i = asteroids.iterator(); i.hasNext(); ) {
			Asteroid a = i.next();
			a.update();
			a.display();
        }
		
		if (random(0,1000) < 12) {
			asteroids.add(new Asteroid(this));
		}
	}
	
}
