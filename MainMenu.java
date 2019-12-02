import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class MainMenu {

    public MainMenu() throws Exception{

        File inFile = new File("myCars.data");
        FileInputStream carInStream = new FileInputStream(inFile);
        ObjectInputStream cos = new ObjectInputStream(carInStream);
        AddCarGUI.carList = (ArrayList<Car>) cos.readObject();
        cos.close();

        CarPanel cp = new CarPanel();
        JFrame f = new JFrame();

        f.setTitle("MacMonagle Car Sales");
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("Add Car");
        b1.setBounds(200,50,100,150);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //How do I move to the AddCarGUI page?
                try {
                    new AddCarGUI(); //line of code added by JB here to make "Add Car" GUI appear
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        JButton b2 = new JButton("Sell Car");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    new SellCarGUI();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        JButton b3 = new JButton("Quit");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = -2;
        c.gridy=-2;
        cp.add(b1);

        c.gridx = 0;
        c.gridy=0;
        cp.add(b2);

        c.gridx = 2;
        c.gridy= 2;
        cp.add(b3);

        f.add(cp);
        f.setVisible(true);

    }

    private static class CarPanel extends JPanel{

        public void paintComponent(Graphics g)
        {

            super.paintComponent(g);

            ImageIcon image = new ImageIcon("images/Macs.png");

            g.drawImage(image.getImage(), 0, 0, null);

        }
    }

}
