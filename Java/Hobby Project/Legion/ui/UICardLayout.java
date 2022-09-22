package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class UICardLayout implements ItemListener{

JPanel cards;
final static String FactionsPanel = "Card with Factions";
final static String ClassesPanel = "Card with Classes";

public void addComponentToPane(Container pane) throws IOException{
    BufferedImage Logo1 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/CIS.png"));
	ImageIcon sepsPic = new ImageIcon(Logo1);
	BufferedImage Logo2 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/GAR.png"));
	ImageIcon GARPic = new ImageIcon(Logo2);
	BufferedImage Logo3 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/Empire.png"));
	ImageIcon ImpPic = new ImageIcon(Logo3);
	BufferedImage Logo4 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/Rebels.png"));
	ImageIcon RebsPic = new ImageIcon(Logo4);

	BufferedImage commLogo = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/Commander.png"));
	BufferedImage opLogo = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/Operative.png"));
	BufferedImage corpLogo = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/corp.png"));
	BufferedImage specLogo = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/sf.png"));
	BufferedImage supLogo = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/support.png"));
	BufferedImage hvyLogo = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/heavy.png"));
    ImageIcon commPic = new ImageIcon(commLogo);
	ImageIcon opPic = new ImageIcon(opLogo);
	ImageIcon corpPic = new ImageIcon(corpLogo);
	ImageIcon specPic = new ImageIcon(specLogo);
    ImageIcon supPic = new ImageIcon(supLogo);
    ImageIcon hvyPic = new ImageIcon(hvyLogo);

    JPanel comboBoxPane = new JPanel();
    String comboBoxItems[] = {FactionsPanel, ClassesPanel};
    JComboBox cb = new JComboBox(comboBoxItems);
    cb.setEditable(false);
    cb.addItemListener(this);
    comboBoxPane.add(cb);

    JPanel factionsCard = new JPanel();
    JButton sepsButton = new JButton(sepsPic);
    sepsButton.addActionListener(new Listener());
    factionsCard.add(sepsButton); 
    JButton garButton = new JButton(GARPic);
    garButton.addActionListener(new Listener());
    factionsCard.add(garButton);
    JButton rebsButton = new JButton(RebsPic);
    rebsButton.addActionListener(new Listener());
    factionsCard.add(rebsButton);
    JButton impButton = new JButton(ImpPic);
    impButton.addActionListener(new Listener());
    factionsCard.add(impButton);

    JPanel classesCard = new JPanel();
    JButton commButton = new JButton(commPic);
    commButton.addActionListener(new Listener());
    classesCard.add(commButton);
    JButton opButton = new JButton(opPic);
    opButton.addActionListener(new Listener());
    classesCard.add(opButton);
    JButton corpButton = new JButton(corpPic);
    corpButton.addActionListener(new Listener());
    classesCard.add(corpButton);
    JButton specButton = new JButton(specPic);
    specButton.addActionListener(new Listener());
    classesCard.add(specButton);
    JButton supButton = new JButton(supPic);
    supButton.addActionListener(new Listener());
    classesCard.add(supButton);
    JButton hvyButton = new JButton(hvyPic);
    hvyButton.addActionListener(new Listener());
    classesCard.add(hvyButton);

    cards = new JPanel(new CardLayout());
    cards.add(factionsCard, FactionsPanel);
    cards.add(classesCard, ClassesPanel);

    pane.add(comboBoxPane, BorderLayout.PAGE_START);
    pane.add(cards, BorderLayout.CENTER);
}

public void itemStateChanged(ItemEvent evt){
    CardLayout cl = (CardLayout)(cards.getLayout());
    cl.show(cards, (String)evt.getItem());
}

public static void createAndShowGUI() throws IOException {
    JFrame frame = new JFrame("Legion by Phanderbock");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    UICardLayout gui = new UICardLayout();
    gui.addComponentToPane(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
}

class Listener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e){

    }
}

public static void main(String[] args) {
    try {
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    } catch (UnsupportedLookAndFeelException ex) {
        ex.printStackTrace();
    } catch (IllegalAccessException ex) {
        ex.printStackTrace();
    } catch (InstantiationException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    }
    /* Turn off metal's use of bold fonts */
    UIManager.put("swing.boldMetal", Boolean.FALSE);
     
    //Schedule a job for the event dispatch thread:
    //creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            try {
                createAndShowGUI();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    });
}

}
