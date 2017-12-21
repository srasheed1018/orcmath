package sisikneeHolidayCard;

import guiTeacher.GUIApplication;

public class HolidayCardGUI extends GUIApplication {
	
	private static final long serialVersionUID = -2452328323352199392L;
	
	public HolidayCardGUI(int width, int height) {
		
		super(width, height);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		HolidayCardGUI card = new HolidayCardGUI(550, 751);
		Thread holiday = new Thread(card);
		holiday.start();
		
	}

	@Override
	public void initScreen() {
		
		HolidayCardScreen card = new HolidayCardScreen(550, 751);
		setScreen(card);

	}

}
