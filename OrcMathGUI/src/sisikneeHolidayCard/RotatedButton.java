package sisikneeHolidayCard;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class RotatedButton extends Button {

	private double rotation;
	private double scaleX;
	private double scaleY;
	
	public RotatedButton(int x, int y, int w, int h, String text, Color color, Action action, double rotation, double scaleX, double scaleY) {
		
		super(x, y, w, h, text, color, action);
		this.rotation = rotation;
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		update();
		
	}

	public RotatedButton(int x, int y, int w, int h, String text, Action action, double rotation, double scaleX, double scaleY) {
		
		super(x, y, w, h, text, action);
		this.rotation = rotation;
		this.scaleX = scaleX;
		this.scaleY = scaleY;
		update();
		
	}
	

	@Override
	public void update() {
		
		super.update();
		rotate(rotation);
		scale(scaleX, scaleY);
		
	}
	
	public void rotate(double n) {
		
		AffineTransform at = new AffineTransform();
		at.rotate(n, hoverImage.getWidth() / 2, hoverImage.getHeight() / 2);
		
		AffineTransformOp rot = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
		hoverImage = rot.filter(hoverImage, null);
		image = rot.filter(image, null);
		
	}
	
	public void scale(double x, double y) {
		
		AffineTransform at = new AffineTransform();
		at.scale(x, y);
		
		AffineTransformOp size = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
		hoverImage = size.filter(hoverImage, null);
		image = size.filter(image, null);
		
	}

}
