//2013110023 노다 사오리

import java.awt.*;

import javax.swing.JButton;

public class p2 extends Panel {
	public p2() {
		this.setLayout(new FlowLayout());
		
		this.add(new JButton("Open"));
		this.add(new JButton("Read"));
		this.add(new JButton("Close"));
		
		setBackground(Color.LIGHT_GRAY);
	}
}
