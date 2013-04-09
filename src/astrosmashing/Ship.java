package astrosmashing;

import processing.core.PApplet;
import processing.core.PImage;

public class Ship {
	PApplet parent; // The parent PApplet that we will render ourselves onto

	int x = 512;
	int y = 700;
	
	static int SPEED = 8;

	PImage img;

	public Ship(PApplet p) {
		parent = p;
		img = parent.loadImage("spacecraft.png");
	}
	
	void display() {
		parent.image(img, x, y);
	}
	
	void moveRight() {
		x = PApplet.constrain(x + SPEED, 0, 960);
	}
	
	void moveLeft() {
		x = PApplet.constrain(x - SPEED, 0, 960);
	}

	public int getX() {
		return x;
	}
}
