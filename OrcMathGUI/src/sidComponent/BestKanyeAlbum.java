package sidComponent;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class BestKanyeAlbum extends Component {

	public BestKanyeAlbum() {
		super(40, 40, 100, 100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.white);
		g.drawRect(0, 0, getWidth(), getHeight());

	}

}
