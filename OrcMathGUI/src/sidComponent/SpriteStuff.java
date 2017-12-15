package sidComponent;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class SpriteStuff extends AnimatedComponent {

	public SpriteStuff() {
		super(40, 40, 35, 67);
		addSequence("resources/sora.png", 150, 7, 5, 34, 67, 5);
		Thread animation = new Thread(this);
		animation.start();
		update();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.white);
		super.update(g);

	}

}
