package sisikneeFli;

import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class HolidayCardScreen extends FullFunctionScreen {
	
	private static final long serialVersionUID = -2452328323352199392L;
	
	private TextArea text;
	private Button flipL;
	private Button flipR;
	
	public HolidayCardScreen(int width, int height) {
		
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {

		text = new TextArea(69, 99, 412, 250, "Happppppppppppppppppy New Yearsss");
		flipL = new RotatedButton(0, 0, 29, 751, "FLIP", null, -Math.PI / 2 /*, 2, 2*/);
		flipR = new RotatedButton(510, 0, 29, 751, "FLIP", null, Math.PI / 2 /*, 2, 2*/);
		
		viewObjects.add(text);
		viewObjects.add(flipL);
		viewObjects.add(flipR);
		
	}

}
