package sidComponent;

import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField brandField;
	private TextField nameField;
	private TextField colorField;
	private TextField sizeField;
	private Button dsField;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		brandField = new TextField(20,100,200,30,"...","Brand");
		nameField = new TextField(20,150,200,30,"...","Name");
		colorField = new TextField(20,200,200,30,"...","Colorway");
		sizeField = new TextField(20,250,200,30,"...","Size");
		dsField = new Button(20,300,50,50,"Deadstock?", "action");
		viewObjects.add(brandField);
		viewObjects.add(nameField);
		viewObjects.add(colorField);
		viewObjects.add(sizeField);
	}

	
	public void blah() {
		
	}
}
