package sisikneeFli;

import java.awt.Color;

import guiTeacher.interfaces.Clickable;

public interface CustomLabel extends Clickable {
	
	void updateString1(String string);
	
	void updateString2(String string);
	
	void setColor(Color color);
	
}
