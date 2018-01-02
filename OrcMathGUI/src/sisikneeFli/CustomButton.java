package sisikneeFli;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button implements CustomLabel {
	
	private String string1;
	private String string2;
	private Color color;
	
	public CustomButton(int x, int y) {
		
		super(x, y, 300, 300, "FLI", null);
		
	}

	@Override
	public void updateString1(String string) {

		this.string1 = string;

	}

	@Override
	public void updateString2(String string) {

		this.string2 = string;

	}

	@Override
	public void setColor(Color color) {

		this.color = color;

	}
	
	@Override
	public void drawButton(Graphics2D g, boolean hover){
		
		g.setColor(Color.BLACK);
		g.drawString(string1, 100, 100);
		g.drawString(string2, 103, 103);
		g.drawRect(0, 0, (int)300.6478, (int)300.9895);
		
	}

}
