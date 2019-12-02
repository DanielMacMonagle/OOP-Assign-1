import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerGUI extends JFrame {

        public CustomerGUI(){
        JFrame f = new JFrame();
        f.setTitle("MacMonagle Car Sales");

        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        p.setLayout(null);

        // ----- Forename ----- //
        JLabel labelForename;
        JTextField forenameField;
        labelForename = new JLabel("Forename: ",SwingConstants.RIGHT); //Make the text appear on the right of the label
        forenameField = new JTextField(15);
        labelForename.setBounds(150,40,100,30);
        p.add(labelForename);
        forenameField.setBounds(250,40,150,30);
        p.add(forenameField);

        // ----- Surname ----- //
        JLabel labelSurname;
        JTextField surnameField;
        labelSurname = new JLabel("Surname: ",SwingConstants.RIGHT);
        surnameField = new JTextField(15);
        labelSurname.setBounds(150,80,100,30);
        p.add(labelSurname);
        surnameField.setBounds(250,80,150,30);
        p.add(surnameField);

        // ----- Date Of Birth ----- //
        JLabel labelDateOfBirth;
        JTextField DateOfBirthField;
        labelDateOfBirth = new JLabel("Date Of Birth: ",SwingConstants.RIGHT);
        DateOfBirthField = new JTextField(10);
        labelDateOfBirth.setBounds(150,120,100,30);
        p.add(labelDateOfBirth);
        DateOfBirthField.setBounds(250,120,150,30);
        p.add(DateOfBirthField);

        // ----- House No ----- //
        JLabel labelHouseNo;
        JTextField HouseNoField;
        labelHouseNo = new JLabel("House No: ",SwingConstants.RIGHT);
        HouseNoField = new JTextField(3);
        labelHouseNo.setBounds(150,160,100,30);
        p.add(labelHouseNo);
        HouseNoField.setBounds(250,160,150,30);
        p.add(HouseNoField);

        // ----- Street ----- //
        JLabel labelStreet;
        JTextField StreetField;
        labelStreet = new JLabel("Street: ",SwingConstants.RIGHT);
        StreetField = new JTextField(15);
        labelStreet.setBounds(150,200,100,30);
        p.add(labelStreet);
        StreetField.setBounds(250,200,150,30);
        p.add(StreetField);

        // ----- Town ----- //
        JLabel labelTown;
        JTextField TownField;
        labelTown = new JLabel("Town: ",SwingConstants.RIGHT);
        TownField = new JTextField(15);
        labelTown.setBounds(150,240,100,30);
        p.add(labelTown);
        TownField.setBounds(250,240,150,30);
        p.add(TownField);

        // ----- County ----- //
        JLabel labelCounty;
        JTextField CountyField;
        labelCounty = new JLabel("County: ",SwingConstants.RIGHT);
        CountyField = new JTextField(15);
        labelCounty.setBounds(150,280,100,30);
        p.add(labelCounty);
        CountyField.setBounds(250,280,150,30);
        p.add(CountyField);

        // ----- Contact No ----- //
        JLabel labelContactNo;
        JTextField ContactNoField;
        labelContactNo = new JLabel("Contact No: ",SwingConstants.RIGHT);
        ContactNoField = new JTextField(10);
        labelContactNo.setBounds(150,320,100,30);
        p.add(labelContactNo);
        ContactNoField.setBounds(250,320,150,30);
        p.add(ContactNoField);

        // ----- Email ----- //
        JLabel labelEmail;
        JTextField EmailField;
        labelEmail = new JLabel("Email: ",SwingConstants.RIGHT);
        EmailField = new JTextField(30);
        labelEmail.setBounds(150,360,100,30);
        p.add(labelEmail);
        EmailField.setBounds(250,360,150,30);
        p.add(EmailField);

        // ----- Submit Label ----- //
        JLabel labelErrorMessage;
        labelErrorMessage = new JLabel("All Fields must be filled in order to continue");
        labelErrorMessage.setBounds(200,400,400,30);
        p.add(labelErrorMessage);
        labelErrorMessage.setVisible(false);

        // ----- Submit Button ----- //
        JButton button1 = new JButton();
        button1.setText("Submit");
        button1.setBounds(250,440,100,30);
        p.add(button1);

        // ----- Return Button ----- //
        JButton button2 = new JButton();
        button2.setText("Return");
        button2.setBounds(350,440,100,30);
        p.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (!(forenameField.getText().equals("") || surnameField.getText().equals("") ||
                        DateOfBirthField.getText().equals("") || HouseNoField.getText().equals("") || StreetField.getText().equals("") ||
                        TownField.getText().equals("") || CountyField.getText().equals("") || ContactNoField.getText().equals("") ||
                        EmailField.getText().equals(""))) {
                    labelErrorMessage.setVisible(false);
                    new TransactionGUI();
                }

                else {
                        labelErrorMessage.setVisible(true);
                        labelErrorMessage.setText("All fields must be filled in order to continue!");
                     }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    new MainMenu();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                f.setVisible(false);
            }
        });


        f.add(p);
        f.setVisible(true);

    }
}
