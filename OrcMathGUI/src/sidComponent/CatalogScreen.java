package sidComponent;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester{

	private TextField brandField;
	private TextField nameField;
	private TextField colorField;
	private TextField sizeField;
	private TextArea text;
	private Button add;
	private Button save;
	private Button delete;
	private FileOpenButton open;
	private ShoeMaker maker = new ShoeMaker(); 
	
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
		save = new Button(20,300,70,40,"Save", new Action() {
			
			@Override
			public void act() {
				
				addClicked();
				
			}
		});
		add = new Button(100,300,70,40,"Add", new Action() {
			
			@Override
			public void act() {
				addClicked();
				
			}
		});
		delete = new Button(180,300,70,40,"Delete", new Action() {
			
			@Override
			public void act() {
				addClicked();
				
			}
		});
		open = new FileOpenButton(260, 300, 70, 40, null, this);
		viewObjects.add(brandField);
		viewObjects.add(nameField);
		viewObjects.add(colorField);
		viewObjects.add(sizeField);
		viewObjects.add(text);
		viewObjects.add(save);
		viewObjects.add(add);
		viewObjects.add(delete);
		viewObjects.add(open);
	}

	
	protected void addClicked() {
		text.setText("woah you clicked a button bro");
		
	}


	@Override
	public void setFile(File f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JFrame getWindow() {
		// TODO Auto-generated method stub
		return null;
	}
}
