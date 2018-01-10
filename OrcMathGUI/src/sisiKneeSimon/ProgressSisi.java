package sisiKneeSimon;

import java.awt.Graphics2D;

import guiTeacher.components.Component;
import guiTeacher.components.TextLabel;

public class ProgressSisi extends Component implements ProgressInterfaceSid {
	
	private boolean gameRunning = true;
	private int sequenceSize;
	private int roundNumber;
	
	public ProgressSisi(int x, int y, int w, int h) {
		
		super(x, y, w, h);
		
	}

	@Override
	public void gameOver() {

		gameRunning = false;

	}

	@Override
	public void setRound(int x) {

		roundNumber = x;

	}

	@Override
	public void setSequenceSize(int x) {

		sequenceSize = x;

	}

	@Override
	public void update(Graphics2D g) {

		if(gameRunning) {
			g.draw(null);
		}

	}

}
