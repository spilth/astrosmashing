package astrosmashing;

import processing.core.PApplet;
import processing.core.PImage;

public class Missile {
	PApplet parent; // The parent PApplet that we will render ourselves onto

	float x = 512;
	float y = 383;

	PImage img;

	public Missile(PApplet p) {
		parent = p;
		x = 0;
		img = parent.loadImage("missile.png");
	}
	
	public Missile(PApplet p, int x) {
		this(p);
		this.x = x;
		this.y = 680;
	}

	void display() {
		parent.image(img, x, y);
	}
	
	void update() {
		y-= 4;
	}
}
