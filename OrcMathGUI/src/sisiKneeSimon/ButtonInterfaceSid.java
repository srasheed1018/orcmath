package sisiKneeSimon;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceSid extends Clickable {

	void setColor(Color color);
	
	void setAction(Action a);

	void highlight();

	void dim();

}
