package sisiKneeSimon;

import guiTeacher.GUIApplication;

public class SimonGameSid extends GUIApplication {
	
	private static final long serialVersionUID = -2452328323352199392L;
	public static SimonScreenSid game;

	public SimonGameSid(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		game = new SimonScreenSid(800,500);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
