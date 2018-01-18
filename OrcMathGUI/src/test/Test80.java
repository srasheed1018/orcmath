package test;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class Test80 extends ClickableScreen {

	private TextLabel info;
	private Button loseBtn;
	private Button winBtn;
	
	public Test80(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
	
		info = new TextLabel(100,100,300,100, "CLICK SOMETHING");
		viewObjects.add(info);
		
		loseBtn = new Button(100, 200, 100, 50, "Lose", Color.red, new Action() {

			@Override
			public void act() {
				loseBtn.setEnabled(false);
				winBtn.setEnabled(false);
				info.setText("YOU LOSE :(");
			}} );
		
		winBtn = new Button(100, 260, 100, 50, "Win", Color.green, new Action() {

			@Override
			public void act() {
				loseBtn.setEnabled(false);
				winBtn.setEnabled(false);
				info.setText("YOU WIN :D");
			}} );
		viewObjects.add(loseBtn);
		viewObjects.add(winBtn);
	}

}
