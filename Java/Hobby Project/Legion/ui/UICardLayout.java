package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class UICardLayout implements ItemListener{

JPanel cards;

public void addComponentToPane(Container pane) throws IOException{
    //Generate Faction Images
    BufferedImage Logo1 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/CIS.png"));
	ImageIcon sepsPic = new ImageIcon(Logo1);
	BufferedImage Logo2 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/GAR.png"));
	ImageIcon GARPic = new ImageIcon(Logo2);
	BufferedImage Logo3 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/Empire.png"));
	ImageIcon ImpPic = new ImageIcon(Logo3);
	BufferedImage Logo4 = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/ui/Rebels.png"));
	ImageIcon RebsPic = new ImageIcon(Logo4);

    //Generate Class Images
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

    //Separatist Commander Images
    BufferedImage GrievousImg = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Commander/General Grievous.jpeg"));
    ImageIcon GrievousIcon = new ImageIcon(GrievousImg);
    BufferedImage DookuImg = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Commander/Count Dooku.jpeg"));
    ImageIcon DookuIcon = new ImageIcon(DookuImg);
    BufferedImage KalaniImg = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Commander/kalani.jpeg"));
    ImageIcon KalaniIcon = new ImageIcon(KalaniImg);
    BufferedImage KrakenImg = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Commander/Kraken.jpeg"));
    ImageIcon KrakenIcon = new ImageIcon(KrakenImg);
    BufferedImage STacImg = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Commander/Super Tactical Droid.jpeg"));
    ImageIcon STacIcon = new ImageIcon(STacImg);
    BufferedImage TTacImg = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Commander/T-Series Tactical Droid.jpeg"));
    ImageIcon TTacIcon = new ImageIcon(TTacImg);

    //Separatist Operative Images
    BufferedImage BosskImg = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Operative/Bossk.jpeg"));
    ImageIcon BosskIcon = new ImageIcon(BosskImg);
    BufferedImage BaneImg = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Operative/Cad Bane.jpeg"));
    ImageIcon BaneIcon = new ImageIcon(BaneImg);
    BufferedImage DMaulImg = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/Legion/Legion Reference Docs/Separatists/Unit Cards/Operative/Darth Maul.jpeg"));
    ImageIcon dMaulIcon = new ImageIcon(DMaulImg);



    JPanel factionsCard = new JPanel();
    JButton sepsButton = new JButton(sepsPic);
    sepsButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
        System.out.println("You've chosen Separatists!");
        JPanel classesCard = new JPanel();
        JPanel CardList = new JPanel();
        CardList.setLayout(new GridLayout(0, 3));

        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cards.add(factionsCard);
                cards.remove(classesCard);
            }
        });
        classesCard.add(goBack);
        JButton commButton = new JButton(commPic);
        commButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            System.out.println("You've chosen Commanders!");
            CardList.removeAll();
            JButton grievousButton = new JButton(GrievousIcon);
            JButton dookuButton = new JButton(DookuIcon);
            JButton kalaniButton = new JButton(KalaniIcon);
            JButton krakenButton = new JButton(KrakenIcon);
            JButton sTacButton = new JButton(STacIcon);
            JButton tTacButton = new JButton(TTacIcon);
            CardList.add(grievousButton);
            CardList.add(dookuButton);
            CardList.add(kalaniButton);
            CardList.add(krakenButton);
            CardList.add(sTacButton);
            CardList.add(tTacButton);
            classesCard.validate();
            }
        });
        classesCard.add(commButton);
        JButton opButton = new JButton(opPic);
        opButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            System.out.println("You've chosen Operatives!");
            CardList.removeAll();
            JButton bosskButton = new JButton(BosskIcon);
            JButton baneButton = new JButton(BaneIcon);
            JButton dmaulButton = new JButton(dMaulIcon);
            CardList.add(bosskButton);
            CardList.add(baneButton);
            CardList.add(dmaulButton);
            classesCard.validate();
          }
        });
        classesCard.add(opButton);
        JButton corpButton = new JButton(corpPic);
        corpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            System.out.println("You've chosen Corp!");
            }
        });
        classesCard.add(corpButton);
        JButton specButton = new JButton(specPic);
        specButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            System.out.println("You've chosen Special Forces!");
            }
        });
        classesCard.add(specButton);
        JButton supButton = new JButton(supPic);
        supButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            System.out.println("You've chosen Support!");
            }
        });
        classesCard.add(supButton);
        JButton hvyButton = new JButton(hvyPic);
        hvyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            System.out.println("You've chosen Heavy!");
            }
        });
        classesCard.add(hvyButton);
        classesCard.add(CardList);
        cards.add(classesCard);
        cards.remove(factionsCard);
    }    
    });
    factionsCard.add(sepsButton); 
    JButton garButton = new JButton(GARPic);
    garButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
        System.out.println("You've chosen Republic!");
        }
    });
    factionsCard.add(garButton);
    JButton rebsButton = new JButton(RebsPic);
    rebsButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
        System.out.println("You've chosen Rebels!");
        }
    });
    factionsCard.add(rebsButton);
    JButton impButton = new JButton(ImpPic);
    impButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
        System.out.println("You've chosen Empire!");
        }
    });
    factionsCard.add(impButton);

    

    cards = new JPanel(new CardLayout());
    cards.add(factionsCard);
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
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    frame.setVisible(true);
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
