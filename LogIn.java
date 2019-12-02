import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("MacMonagle Car Sales");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        p.setLayout(null);

        // ----- Username ----- //
        JLabel labelUsername;
        JTextField usernameField;
        labelUsername = new JLabel("Username: ",SwingConstants.RIGHT); //Make the text appear on the right of the label
        usernameField = new JTextField(15);
        labelUsername.setBounds(150,120,100,30);
        p.add(labelUsername);
        usernameField.setBounds(250,120,150,30);
        p.add(usernameField);

        // ----- Password ----- //
        JLabel labelPassword;
        JTextField passwordField;
        labelPassword = new JLabel("Password: ",SwingConstants.RIGHT);
        passwordField = new JTextField(15);
        labelPassword.setBounds(150,160,100,30);
        p.add(labelPassword);
        passwordField.setBounds(250,160,150,30);
        p.add(passwordField);

        // ----- Submit Label ----- //
        JLabel labelErrorMessage;
        labelErrorMessage = new JLabel("Username and Password are incorrect! Please try again!");
        labelErrorMessage.setBounds(200,200,400,30);
        p.add(labelErrorMessage);
        labelErrorMessage.setVisible(false);

        // ----- Log In Button ----- //
        JButton button1 = new JButton();
        button1.setText("Log In");
        button1.setBounds(250,240,100,30);
        p.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                labelErrorMessage.setText(""); //line added by JB to make sure label set blank when all fields are filled with values

                if (!(usernameField.getText().equals("") || passwordField.getText().equals("")))
                {
                    labelErrorMessage.setVisible(false);

                    if ((usernameField.getText().equals("admin") && (passwordField.getText().equals("admin"))))
                    {
                        labelErrorMessage.setVisible(false);
                        try {
                            new MainMenu();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    else
                    {
                        labelErrorMessage.setVisible(true);
                        labelErrorMessage.setText("Username and Password not recognised!");
                    }

                }
                else
                    {
                    labelErrorMessage.setVisible(true);
                    labelErrorMessage.setText("Log in details required in order to continue!");
                    }
            }
        });

        f.add(p);
        f.setVisible(true);

    }
}
