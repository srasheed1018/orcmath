package sidComponent;

import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField brandField;
	private TextField nameField;
	private TextField colorField;
	private TextField sizeField;
	private TextArea text;
	private Button submit;
	
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
		text = new TextArea(20,350,200,30,"");
		submit = new Button(20,300,100,50,"Done", new Action() {
			
			@Override
			public void act() {
				
				addClicked();
				
			}
		});
		viewObjects.add(brandField);
		viewObjects.add(nameField);
		viewObjects.add(colorField);
		viewObjects.add(sizeField);
		viewObjects.add(text);
		viewObjects.add(submit);
	}

	
	protected void addClicked() {
		text.setText("woah you clicked a button bro");
		
	}

	public void blah() {
		
	}
}
