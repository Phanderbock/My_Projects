import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class KharadronClass implements ItemListener {

    JPanel basePanel;

    public void addComponentToPane(Container pane) throws IOException{
        //Opening image
        BufferedImage coverImage = ImageIO.read(new File("C:/Users/Brennan/Documents/Github/My_Projects/Java/Hobby Project/KharadronOverlords/ko_cover.jpg"));
        ImageIcon coverIcon = new ImageIcon(coverImage);

        JPanel coverPanel = new JPanel();
        JPanel buttonsPanel = new JPanel();
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                basePanel.removeAll();
                basePanel.add(buttonsPanel);
                basePanel.repaint();
                basePanel.validate();
            }
        });
        JButton coverButton = new JButton(coverIcon);
        coverButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                basePanel.add(buttonsPanel);
                basePanel.remove(coverPanel);
                basePanel.validate();
            }
        });

        JButton points = new JButton("Points");
        points.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JPanel pointsPanel = new JPanel();
                JLabel pointsLabel = new JLabel(
                    "<html>Unit Size  /  Unit Name     / Points / Role / Extra Notes<br> <br>"
                    + "     (10) Arkanaut Company     /  90  / Battleline / <br>"
                    + "     (1) Arkanaut Frigate     / 250 /   Behemoth  / Battleline in Barak-Zilfin  <br>"
                    + "    (1) Arkanaut Ironclad    / 490 /   Behemoth  / <br>"
                    + "     (1) Aether-Khemist      / 90  /    Leader   / <br>"
                    + "     (1) Aetheric Navigator   / 100 /    Leader   / <br>"
                    + "   (1) Arkanaut Admiral     / 140 /    Leader   / <br>"
                    + "    (1) Brokk Gurngsson    / 240 /    Leader   / Unique  <br>"
                    + " (1) Endrinmaster w/ D. Suit / 220 /    Leader   / <br>"
                    + " (1) Endrinmaster w/ Harness / 100 /    Leader   / <br>"
                    + "   (1) Bjorgen Thundrik    / 140 /    Leader   / <br>"
                    + " (4) Thundrik's Profiteers  / n/a /             / Unique, must be taken with Bjorgen <br>"
                    + "    (3)  Endrinriggers      / 100 /             / Battleline if Endrinmaster w/ D.Suit is General <br>"
                    + " (1) Grundstock Gunhauler   / 150 /             / Battleline in Barak-Urbaz <br>"
                    + " (5) Grundstock Thunderers  / 120 /             / Battleline in Barak-Nar <br>"
                    + "   (3)   Skywardens         / 100 /             / Battleline if Endrinmaster w/ D.Suit is General </html"
                    );
                pointsPanel.add(goBack);
                pointsPanel.add(pointsLabel);
                basePanel.add(pointsPanel);
                basePanel.remove(buttonsPanel);
            }
        });

        JButton warscrolls = new JButton("Warscrolls");

        JButton battalions = new JButton("Battalions");

        JButton pathToGlory = new JButton("Path to Glory");

        coverPanel.add(coverButton, BorderLayout.NORTH);
        buttonsPanel.add(points);
        buttonsPanel.add(warscrolls);
        buttonsPanel.add(battalions);
        buttonsPanel.add(pathToGlory);

        basePanel = new JPanel(new CardLayout());
        basePanel.add(coverPanel);
        pane.add(basePanel, BorderLayout.CENTER);

    }
    public void itemStateChanged(ItemEvent evt){
        CardLayout cl = (CardLayout)(basePanel.getLayout());
        cl.show(basePanel, (String)evt.getItem());
    }
    
    public static void createAndShowGUI() throws IOException {
        JFrame frame = new JFrame("KO by Gandegar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        KharadronClass gui = new KharadronClass();
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

   
