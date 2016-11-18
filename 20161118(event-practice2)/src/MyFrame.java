//listener class 삽입

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(){
		this.setTitle("frame에 listener class 삽입");
		this.setSize(300,250);
		
		MyPabel p = new MyPabel();
		this.add(p);
		
		
		MyListener ml = new MyListener();
		p.b.addActionListener(ml);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public class MyListener implements ActionListener{

		int count =0;
		@Override
		public void actionPerformed(ActionEvent e) {	
			count++;
			JButton b= (JButton)e.getSource();
			b.setText("버튼이 눌려졌습니다. " + count);
			b.setBackground(Color.pink);
			
		}
		
		
	}
}
