import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellCarGUI extends JFrame {

    public SellCarGUI() {

        JFrame f = new JFrame();
        f.setTitle("MacMonagle Car Sales");


        f.setSize(1200, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        f.add(p);
        f.setVisible(true);

        p.setLayout(null);//one line of code added here by JB

        // ----- Make ----- //
        JLabel labelMake;
        JTextField makeField;
        labelMake = new JLabel("Make: ", SwingConstants.RIGHT); //Make the text appear on the right of the label
        makeField = new JTextField(15);
        labelMake.setBounds(150, 20, 100, 30);
        p.add(labelMake);
        makeField.setBounds(250, 20, 150, 30);
        p.add(makeField);

        // ----- Submit Label ----- //
        JLabel labelErrorMessage;
        labelErrorMessage = new JLabel("Please enter a make of car in order to search!");
        labelErrorMessage.setBounds(200, 60, 400, 30);
        p.add(labelErrorMessage);
        labelErrorMessage.setVisible(false);

        // ----- Search Button ----- //
        JButton button1 = new JButton();
        button1.setText("Search");
        button1.setBounds(200, 100, 100, 30);
        p.add(button1);

        // ----- Return Button ----- //
        JButton button2 = new JButton();
        button2.setText("Return");
        button2.setBounds(300, 100, 100, 30);
        p.add(button2);

        // ----- Continue Button ----- //
        JButton button3 = new JButton();
        button3.setText("Continue");
        button3.setBounds(1060, 610, 100, 30);
        p.add(button3);

        // ----- Car Details text field ----- //
        JTextArea carDetailsField;
        carDetailsField = new JTextArea();
        carDetailsField.setBounds(50, 150, 1000, 450);
        p.add(carDetailsField);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                carDetailsField.setText(String.format("%-20s%-20s%-17s%-20s%-17s%-17s%-17s%-17s%-17s%-17s%-17s%-17s%-17s\n\n",
                        "Registration" , "Make", "Model", "Engine Size" , "Year", "Color" , "Body Type" , "Transmission" , "Fuel Type" , "Doors" ,
                        "Mileage" ,"Tax" , "Price" ));
                String list ="";

                if(!(makeField.getText().equals("")))
                    {
                        for(Car cr: AddCarGUI.carList){
                            if(cr.getMake().equals(makeField.getText())){

                                 list += cr.toString();
                            }
                        }

                        labelErrorMessage.setVisible(false);
                    }

                    else
                         {

                            labelErrorMessage.setVisible(true);
                            labelErrorMessage.setText("Please enter a make of car in order to search!");
                        }

                carDetailsField.append(list);


            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    f.setVisible(false);

            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f.setVisible(false);
                new CustomerGUI();
            }
        });



    }


}