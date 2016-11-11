//20161111 saori

import java.awt.*;
import javax.swing.*;

public class MyFrameBoderLayout extends JFrame{

	public MyFrameBoderLayout(){
		
		this.setTitle("boderLayout");
		this.setSize(300, 250);
		
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(new JButton("north"), BorderLayout.NORTH);
		cp.add(new JButton("west"), BorderLayout.WEST);
		cp.add(new JButton("center"), BorderLayout.CENTER);
		cp.add(new JButton("east"), BorderLayout.EAST);
		cp.add(new JButton("south"), BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
