//20161111 saori

import javax.swing.*;
import java.awt.*;

public class MyFrameGridLayout extends JFrame {

	public MyFrameGridLayout(){
		
		this.setTitle("gridLayout");
		this.setSize(300, 250);
		
		Container cp = this.getContentPane();
		cp.setLayout(new GridLayout(3, 2,30,20));
		
		cp.add(new JButton("1"));
		cp.add(new JButton("2"));
		cp.add(new JButton("3"));
		cp.add(new JButton("4"));
		cp.add(new JButton("5"));
		//cp.add(new JButton("6"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
//default ayout = border layout~~~