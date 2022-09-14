package ui;

import javax.swing.*;

public class GUI extends JFrame{

	ImageIcon sepsPic = new ImageIcon("\\Legion Reference Docs\\Separatists\\CIS.jpeg");
	JButton seps = new JButton("Separatists", sepsPic);
	JButton seps2 = new JButton(sepsPic);
	// Constructor to setup the GUI components and event handlers
	public GUI() {
		super("Star Wars Legion by Phanderbock");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JPanel panel = new JPanel();
	    panel.add(seps);
		panel.add(seps2);
	    add(panel);
	    setVisible(true);
	}
 
	// The entry main() method
	public static void main(String[] args) {
		GUI ui = new GUI();
		

	}


}
