package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ShapeCalc {
	public ShapeCalc() {
		//setting frame
		JFrame frame1=new JFrame("Shape Calculator");
		frame1.setVisible(true);
		frame1.setSize(400, 400);
		//frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panels
		JPanel displaypnl=new JPanel();
		JPanel controlpnl=new JPanel();
		Container cpnl=frame1.getContentPane();
		
		JLabel areaLbl= new JLabel("Area: ");
		JTextField typeTF=new JTextField("Square");
		JButton newbtn=new JButton("Makeit");
		//adding pnls
		cpnl.add(controlpnl,BorderLayout.NORTH);
		cpnl.add(displaypnl,BorderLayout.CENTER);
		cpnl.add(areaLbl,BorderLayout.SOUTH);
		
		
		
	}
	
	
}
