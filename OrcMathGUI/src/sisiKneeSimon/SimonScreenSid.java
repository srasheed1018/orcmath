package sisiKneeSimon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenSid extends ClickableScreen implements Runnable {

	public TextLabel round;
	public ButtonInterfaceSid[] options;
	public ProgressInterfaceSid progress;
	public ArrayList<MoveInterfaceSid> moves;
	private int roundnumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	private int numberOfButtons = 6;
	private Color[] colors;
	
	public SimonScreenSid(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		round.setText("");
		nextRound();

	}

	public void nextRound() {
		acceptingInput = false;
		roundnumber++;
		moves.add(randomMove());
		progress.setRound(roundnumber);
		progress.setSequenceSize(moves.size());
		
	}
	
	public void changeText(String txt) {
		//RESUME
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {

		addButtons();
		for(ButtonInterfaceSid b: options){ 
		    viewObjects.add(b); 
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		moves = new ArrayList<MoveInterfaceX>();
		//add 2 moves to start
		lastSelectedButton = -1;
		moves.add(randomMove());
		moves.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(round);

	}

	public MoveInterfaceSid randomMove() {
		int bIndex = (int)(Math.random()*options.length);
	    while(bIndex == lastSelectedButton){
	        bIndex = (int)(Math.random()*options.length);
	    }
	    return getMove(bIndex);
	}

	
	/**
	Placeholder until partner finishes implementation of MoveInterface
	*/
	public MoveInterfaceSid getMove(int bIndex) {
		return null;
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	public ProgressInterfaceSid getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addButtons() {
		options = new ButtonInterfaceSid[numberOfButtons];
		colors[0] = Color.red;
		colors[1] = Color.blue;
		colors[2] = Color.green;
		colors[3] = Color.magenta;
		colors[4] = Color.cyan;
		colors[5] = Color.darkGray;
		for (int i = 0; i < numberOfButtons; i++) {
			final ButtonInterfaceSid b = getAButton();
			options[i] = b;
			b.setColor(colors[i]);
			b.setX(100*i);
			b.setY(300);
			b.setAction(new Action() { 
				
				public void act() {
					if (acceptingInput) {
						Thread blink = new Thread(new Runnable() {
							public void run() {
								b.highlight();
								try {
								Thread.sleep(800);
								} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								}
								b.dim();
							}
						});
						blink.start();
						if (b==moves.get(sequenceIndex).getButton()) {
							sequenceIndex++;
						}
						else {
							progress.gameOver();
						}
						if (sequenceIndex == moves.size()) {
							Thread nextRound = new Thread(SimonScreenSid.this);
							nextRound.start();
						}
					}//end of if
				}//end of act
			});
		}
		
	}

	/** placeholder */
	private ButtonInterfaceSid getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

}
