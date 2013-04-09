package astrosmashing;

import processing.core.PApplet;
import processing.core.PImage;

public class Asteroid {
	PApplet parent;

	float x = 512;
	float y = -64;

	PImage img;

	public Asteroid(PApplet p) {
		parent = p;
		img = parent.loadImage("asteroid.png");
		x = parent.random(64, 960);
	}
	
	void display() {
		parent.image(img, x, y);
	}
	
	void update() {
		y+= 2;
	}
}
