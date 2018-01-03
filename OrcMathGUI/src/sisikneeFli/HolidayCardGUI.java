package sisikneeFli;

import guiTeacher.GUIApplication;

public class HolidayCardGUI extends GUIApplication {
	
	private static final long serialVersionUID = -2452328323352199392L;
	public static HolidayCardGUI card;
	public static HolidayCardScreen front;
	public static HolidayCardScreen back;
	
	public HolidayCardGUI(int width, int height) {
		
		super(width, height);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		card = new HolidayCardGUI(550, 751);
		Thread holiday = new Thread(card);
		holiday.start();
		
	}

	@Override
	public void initScreen() {
		
		front = new HolidayCardScreen(550, 751);
		back = new HolidayCardScreen(550, 751);
		
		setScreen(front);

	}

}
