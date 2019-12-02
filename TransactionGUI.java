import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionGUI extends JFrame {

    public TransactionGUI()
    {

        JFrame f = new JFrame();
        f.setTitle("MacMonagle Car Sales");

        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        p.setLayout(null);//one line of code added here by JB

        // ----- Registration ----- //
        JLabel labelRegistration;
        JTextField RegistrationField;
        labelRegistration = new JLabel("Registration: ",SwingConstants.RIGHT);
        RegistrationField = new JTextField(16);
        labelRegistration.setBounds(150,40,100,30);
        p.add(labelRegistration);
        RegistrationField.setBounds(250,40,150,30);
        p.add(RegistrationField);

        // ----- Card Number ----- //
        JLabel labelCardNumber;
        JTextField CardNumberField;
        labelCardNumber = new JLabel("Card Number: ",SwingConstants.RIGHT);
        CardNumberField = new JTextField(16);
        labelCardNumber.setBounds(150,80,100,30);
        p.add(labelCardNumber);
        CardNumberField.setBounds(250,80,150,30);
        p.add(CardNumberField);

        // ----- CVV ----- //
        JLabel labelCVV;
        JTextField CVVField;
        labelCVV = new JLabel("CVV: ",SwingConstants.RIGHT);
        CVVField = new JTextField(3);
        labelCVV.setBounds(150,120,100,30);
        p.add(labelCVV);
        CVVField.setBounds(250,120,150,30);
        p.add(CVVField);

        // ----- Bank Name ----- //
        JLabel labelBankName;
        JTextField BankNameField;
        labelBankName = new JLabel("Bank Name: ",SwingConstants.RIGHT);
        BankNameField = new JTextField(15);
        labelBankName.setBounds(150,160,100,30);
        p.add(labelBankName);
        BankNameField.setBounds(250,160,150,30);
        p.add(BankNameField);

        // ----- Bank Number ----- //
        JLabel labelBankNumber;
        JTextField BankNumberField;
        labelBankNumber = new JLabel("Bank Number: ",SwingConstants.RIGHT);
        BankNumberField = new JTextField(15);
        labelBankNumber.setBounds(150,200,100,30);
        p.add(labelBankNumber);
        BankNumberField.setBounds(250,200,150,30);
        p.add(BankNumberField);

        // ----- Submit Label ----- //
        JLabel labelErrorMessage;
        labelErrorMessage = new JLabel("All Fields must be filled in order to continue");
        labelErrorMessage.setBounds(200,230,400,30);
        p.add(labelErrorMessage);
        labelErrorMessage.setVisible(false);

        // ----- Submit Button ----- //
        JButton button1 = new JButton();
        button1.setText("Submit");
        button1.setBounds(250,260,100,30);
        p.add(button1);

        // ----- Return Button ----- //
        JButton button2 = new JButton();
        button2.setText("Return");
        button2.setBounds(350,260,100,30);
        p.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                labelErrorMessage.setText(""); //line added by JB to make sure label set blank when all fields are filled with values

                if (!CardNumberField.getText().equals("") || CVVField.getText().equals("") ||
                        BankNameField.getText().equals("") || BankNumberField.getText().equals(""))
                {
                    labelErrorMessage.setVisible(false);

                    JOptionPane.showMessageDialog(null,"Sale has been completed and car has been removed from the database!");
                    System.exit(0);
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