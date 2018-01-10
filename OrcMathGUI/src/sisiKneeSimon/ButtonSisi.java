package sisiKneeSimon;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.Button;

public class ButtonSisi extends Button implements ButtonInterfaceSid {
	
	public final static int HOVERED_WIDTH = 40; public final static int HOVERED_HEIGHT = 40;
	public final static int WIDTH = 30; public final static int HEIGHT = 30;
	
	public ButtonSisi(int x, int y, Color color) {
		
		super(x, y, WIDTH, HEIGHT, "", color, null);
		update();
		
	}

	public ButtonSisi(int x, int y, int w, int h) {
		
		super(x, y, WIDTH, HEIGHT, "", null);
		update();
		
	}

	public void setColor(Color color) {
		
		setBackground(color);
		update();

	}

	public void highlight() {

		w = HOVERED_WIDTH;
		h = HOVERED_HEIGHT;
		update();
		
	}

	public void dim() {

		w = WIDTH;
		h = HEIGHT;
		update();

	}
	
	@Override
	public void drawButton(Graphics2D g, boolean hover){
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		if(hover) {
			highlight();
		} else {
			dim();
		}
		
		drawShape(g, hover);
		g.setColor(getForeground());
		
	}

}
