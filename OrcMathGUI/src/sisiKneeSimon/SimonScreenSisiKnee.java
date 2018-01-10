package sisiKneeSimon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenSisiKnee extends ClickableScreen implements Runnable {

	private static final long serialVersionUID = -2452328323352199392L;
	public TextLabel round;
	public ButtonInterfaceSisi[] options;
	public ProgressInterfaceSid progress;
	public ArrayList<MoveInterfaceSisi> moves;
	private int roundNumber = 0;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	private int numberOfButtons = 6;
	private Color[] colors = {Color.red, Color.blue, Color.green, Color.magenta, Color.cyan, Color.darkGray};
	
	public SimonScreenSisiKnee(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		round.setText("");
		nextRound();
	}
	
	//Sisi
	@SuppressWarnings("static-access")
	public void nextRound() {
		
		acceptingInput = false;
		roundNumber++;
		moves.add(randomMove());
		progress.setRound(roundNumber);
		progress.setSequenceSize(moves.size());
		
		Thread label = new Thread(new Runnable() {

			public void run() {

				changeText("Awesome! Simon's turn!");
				
			}
			
		});
		
		label.run();
		
		try {
			label.sleep(1000);
		} catch (InterruptedException e) {}
		
		removeText();
		playSequence();
		changeText("You got it?");
		acceptingInput = true;
		sequenceIndex = 0;
		
	}
	
	//Sisi
	public void changeText(String txt) {
		
		round.setText(txt);
		
	}
	
	//Sisi
	public void removeText() {
		
		round.setText("");
		
	}
	
	//Sisi
	private void playSequence() {

		ButtonInterfaceSisi b = null;
		
		for(int i = 0; i < moves.size(); i++) {
			
			if(!b.equals(null)) {
				b.dim();
			}
			
			b = getAButton();
			b.highlight();
			
			double sleepTime = 5 * Math.pow(Math.E, -0.25 * (roundNumber - 1));
			
			try {
				Thread.sleep((long)(sleepTime * 1000));
			} catch (InterruptedException e) {}
			
		}
		
		b.dim();
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {

		addButtons();
		for(ButtonInterfaceSisi b: options){ 
		    viewObjects.add(b); 
		}
		progress = getProgress();
		round = new TextLabel(130,230,300,40,"Let's play Simon!");
		moves = new ArrayList<MoveInterfaceSisi>();
		//add 2 moves to start
		lastSelectedButton = -1;
		moves.add(randomMove());
		moves.add(randomMove());
		roundNumber = 0;
		viewObjects.add((Visible) progress);
		viewObjects.add(round);

	}

	public MoveInterfaceSisi randomMove() {
		int bIndex = (int)(Math.random()*options.length);
	    while(bIndex == lastSelectedButton){
	        bIndex = (int)(Math.random()*options.length);
	    }
	    return getMove(bIndex);
	}

	
	/**
	Placeholder until partner finishes implementation of MoveInterface
	*/
	public MoveInterfaceSisi getMove(int bIndex) {
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
		options = new ButtonInterfaceSisi[numberOfButtons];
		/*
		colors[0] = Color.red;
		colors[1] = Color.blue;
		colors[2] = Color.green;
		colors[3] = Color.magenta;
		colors[4] = Color.cyan;
		colors[5] = Color.darkGray;
		*/
		for (int i = 0; i < numberOfButtons; i++) {
			final ButtonInterfaceSisi b = getAButton();
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
							Thread nextRound = new Thread(SimonScreenSisiKnee.this);
							nextRound.start();
						}
					}//end of if
				}//end of act
			});
		}
		
	}

	/** placeholder */
	private ButtonInterfaceSisi getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

}
