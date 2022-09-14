package ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI extends JFrame {

	BufferedImage Logo1 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/CIS.png"));
	ImageIcon sepsPic = new ImageIcon(Logo1);
	BufferedImage Logo2 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/GAR.png"));
	ImageIcon GARPic = new ImageIcon(Logo2);
	BufferedImage Logo3 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/Empire.png"));
	ImageIcon ImpPic = new ImageIcon(Logo3);
	BufferedImage Logo4 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/Rebels.png"));
	ImageIcon RebsPic = new ImageIcon(Logo4);
	JButton seps = new JButton("Separatists", sepsPic);
	// Constructor to setup the GUI components and event handlers
	public GUI() throws IOException{
		super("Star Wars Legion by Phanderbock");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JPanel panel = new JPanel();
	    panel.add(seps);
	    add(panel);
	    setVisible(true);
	}
 
	// The entry main() method
	public static void main(String[] args) throws IOException {
		GUI ui = new GUI();
	}


}
