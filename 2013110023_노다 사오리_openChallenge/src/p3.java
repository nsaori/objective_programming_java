//2013110023 노다 사오리

import java.awt.*;
import javax.swing.*;

public class p3 extends Panel {

	public p3() {
		
		//배치관리자 삭제
		this.setLayout(null);
		
 		JLabel lh = new JLabel("Hello");
 		JLabel ll = new JLabel("Love");
 		JLabel lj = new JLabel("Java");
 		
 		lh.setSize(100, 40);
 		lh.setLocation(100, 5);
 		
 		ll.setSize(100, 40);
 		ll.setLocation(200, 100);
 		
 		lj.setSize(100, 40);
 		lj.setLocation(20, 130);
 		
		this.add(lh);
		this.add(ll);
		this.add(lj);
	}
}
