package sidComponent;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Shoe extends Component {

	private String brand;
	private String name;
	private String colorway;
	private double size;
	private boolean ds;
	
	public Shoe(String brand, String name, String colorway, double size, boolean ds) {
		super(0, 0, 0, 0);
		this.brand = brand;
		this.name = name;
		this.colorway = colorway;
		this.size = size;
		this.ds = ds;
		/* FROM BEFORE
		super(40, 40, 35, 67);
		addSequence("resources/sora.png", 150, 7, 5, 34, 67, 5);
		Thread animation = new Thread(this);
		animation.start();
		*/
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.white);
		//super.update(g);

	}
	
	public String toString() {
		return brand+","+name+","+colorway+","+size+","+ds;
	}

}
