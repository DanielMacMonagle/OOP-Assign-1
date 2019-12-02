import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;

import static java.lang.Float.parseFloat;

public class AddCarGUI extends JFrame {
    static ArrayList<Car> carList = new ArrayList<>();

    public static ArrayList<Car> getCarsList() //JB added method to allow access to array list from other classes
    {
        return carList;
    }

    public AddCarGUI() throws IOException {

        JFrame f = new JFrame();
        f.setTitle("MacMonagle Car Sales");

        f.setSize(600, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

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

        // ----- Model ----- //
        JLabel labelModel;
        JTextField modelField;
        labelModel = new JLabel("Model: ", SwingConstants.RIGHT);
        modelField = new JTextField(15);
        labelModel.setBounds(150, 60, 100, 30);
        p.add(labelModel);
        modelField.setBounds(250, 60, 150, 30);
        p.add(modelField);

        // ----- Registration ----- //
        JLabel labelRegistration;
        JTextField RegistrationField;
        labelRegistration = new JLabel("Registration: ", SwingConstants.RIGHT);
        RegistrationField = new JTextField(11);
        labelRegistration.setBounds(150, 100, 100, 30);
        p.add(labelRegistration);
        RegistrationField.setBounds(250, 100, 150, 30);
        p.add(RegistrationField);

        // ----- Engine Size ----- //
        JLabel labelEngineSize;
        JTextField EngineSizeField;
        labelEngineSize = new JLabel("Engine Size: ", SwingConstants.RIGHT);
        EngineSizeField = new JTextField(3);
        labelEngineSize.setBounds(150, 140, 100, 30);
        p.add(labelEngineSize);
        EngineSizeField.setBounds(250, 140, 150, 30);
        p.add(EngineSizeField);

        // ----- Year ----- //
        JLabel labelYear;
        JTextField YearField;
        labelYear = new JLabel("Year: ", SwingConstants.RIGHT);
        YearField = new JTextField(4);
        labelYear.setBounds(150, 180, 100, 30);
        p.add(labelYear);
        YearField.setBounds(250, 180, 150, 30);
        p.add(YearField);

        // ----- Colour ----- //
        JLabel labelColour;
        JTextField ColourField;
        labelColour = new JLabel("Colour: ", SwingConstants.RIGHT);
        ColourField = new JTextField(10);
        labelColour.setBounds(150, 220, 100, 30);
        p.add(labelColour);
        ColourField.setBounds(250, 220, 150, 30);
        p.add(ColourField);

        // ----- Body Type ----- //
        JLabel labelBodyType;
        JTextField BodyTypeField;
        labelBodyType = new JLabel("Body Type: ", SwingConstants.RIGHT);
        BodyTypeField = new JTextField(10);
        labelBodyType.setBounds(150, 260, 100, 30);
        p.add(labelBodyType);
        BodyTypeField.setBounds(250, 260, 150, 30);
        p.add(BodyTypeField);

        // ----- Transmission ----- //
        JLabel labelTransmission;
        JTextField TransmissionField;
        labelTransmission = new JLabel("Transmission: ", SwingConstants.RIGHT);
        TransmissionField = new JTextField(8);
        labelTransmission.setBounds(150, 300, 100, 30);
        p.add(labelTransmission);
        TransmissionField.setBounds(250, 300, 150, 30);
        p.add(TransmissionField);

        // ----- Fuel Type ----- //
        JLabel labelFuelType;
        JTextField FuelTypeField;
        labelFuelType = new JLabel("Fuel Type: ", SwingConstants.RIGHT);
        FuelTypeField = new JTextField(8);
        labelFuelType.setBounds(150, 340, 100, 30);
        p.add(labelFuelType);
        FuelTypeField.setBounds(250, 340, 150, 30);
        p.add(FuelTypeField);

        // ----- Doors ----- //
        JLabel labelDoors;
        JTextField DoorsField;
        labelDoors = new JLabel("Doors: ", SwingConstants.RIGHT);
        DoorsField = new JTextField(1);
        labelDoors.setBounds(150, 380, 100, 30);
        p.add(labelDoors);
        DoorsField.setBounds(250, 380, 150, 30);
        p.add(DoorsField);

        // ----- Mileage ----- //
        JLabel labelMileage;
        JTextField MileageField;
        labelMileage = new JLabel("Mileage: ", SwingConstants.RIGHT);
        MileageField = new JTextField(7);
        labelMileage.setBounds(150, 420, 100, 30);
        p.add(labelMileage);
        MileageField.setBounds(250, 420, 150, 30);
        p.add(MileageField);

        // ----- Tax ----- //
        JLabel labelTax;
        JTextField TaxField;
        labelTax = new JLabel("Tax Price: ", SwingConstants.RIGHT);
        TaxField = new JTextField(7);
        labelTax.setBounds(150, 460, 100, 30);
        p.add(labelTax);
        TaxField.setBounds(250, 460, 150, 30);
        p.add(TaxField);

        // ----- Price ----- //
        JLabel labelPrice;
        JTextField PriceField;
        labelPrice = new JLabel("Price: ", SwingConstants.RIGHT);
        PriceField = new JTextField(7);
        labelPrice.setBounds(150, 500, 100, 30);
        p.add(labelPrice);
        PriceField.setBounds(250, 500, 150, 30);
        p.add(PriceField);

        // ----- Submit Label ----- //
        JLabel labelErrorMessage;
        labelErrorMessage = new JLabel("All Fields must be filled in order to continue");
        labelErrorMessage.setBounds(200, 540, 400, 30);
        p.add(labelErrorMessage);
        labelErrorMessage.setVisible(false);

        // ----- Save Button ----- //
        JButton button3 = new JButton();
        button3.setText("Save");
        button3.setBounds(150, 580, 100, 30);
        p.add(button3);

        // ----- Submit Button ----- //
        JButton button1 = new JButton();
        button1.setText("Submit");
        button1.setBounds(250, 580, 100, 30);
        p.add(button1);

        // ----- Return Button ----- //
        JButton button2 = new JButton();
        button2.setText("Return");
        button2.setBounds(350, 580, 100, 30);
        p.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                labelErrorMessage.setText(""); //line added by JB to make sure label set blank when all fields are filled with values

                if (!(makeField.getText().equals("") || modelField.getText().equals("") || RegistrationField.getText().equals("") ||
                        EngineSizeField.getText().equals("") || YearField.getText().equals("") || ColourField.getText().equals("") ||
                        BodyTypeField.getText().equals("") || TransmissionField.getText().equals("") || FuelTypeField.getText().equals("") ||
                        DoorsField.getText().equals("") || MileageField.getText().equals("") || TaxField.getText().equals("") || PriceField.getText().equals("")))
                {
                        labelErrorMessage.setVisible(false);

                    String make, model, registration, colour, bodyType, transmission, fuelType;
                    int mileage, doors, year;
                    float engineSize, tax, price;

                    make = makeField.getText(); model = modelField.getText(); registration = RegistrationField.getText();
                    engineSize = Float.parseFloat(EngineSizeField.getText()); year = Integer.parseInt(YearField.getText());
                    colour = ColourField.getText(); bodyType = BodyTypeField.getText(); transmission = TransmissionField.getText();
                    fuelType = FuelTypeField.getText(); doors = Integer.parseInt(DoorsField.getText());
                    mileage = Integer.parseInt(MileageField.getText()); tax = parseFloat(TaxField.getText());
                    price = parseFloat(PriceField.getText());


                    //Makes all fields empty again once the submit button is pressed
                    makeField.setText(""); modelField.setText(""); RegistrationField.setText("");
                    EngineSizeField.setText(""); YearField.setText(""); FuelTypeField.setText("");
                    DoorsField.setText(""); MileageField.setText("");  TaxField.setText("");  PriceField.setText("");
                    ColourField.setText(""); BodyTypeField.setText(""); TransmissionField.setText("");


                    carList.add(new Car(registration,make,model,colour,fuelType,transmission,bodyType,doors,year,mileage,engineSize,tax,price));

                    System.out.println(carList.toString());

                    String txt="";

                    for(Car cr: carList){
                        txt = cr.toString();
                        System.out.print(cr.toString());
                    }

                }
                else
                    {
                         labelErrorMessage.setVisible(true);
                         labelErrorMessage.setText("All fields must be filled in order to continue!");
                    }
            }
        });

        f.add(p);

        f.setVisible(true);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f.setVisible(false);
                try {
                    new MainMenu();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    File outFile = new File("myCars.data");
                    FileOutputStream carOutStream = new FileOutputStream(outFile);
                    ObjectOutputStream cos = new ObjectOutputStream(carOutStream);
                    cos.writeObject(carList);
                    cos.close();

                    System.out.println(carList.toString());

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });


        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {

                try {
                    File outFile = new File("myCars.data");
                    FileOutputStream carOutStream = new FileOutputStream(outFile);
                    ObjectOutputStream cos = new ObjectOutputStream(carOutStream);
                    cos.writeObject(carList);
                    cos.close();

                    System.out.println("trying");
                } catch (IOException ex) {
                    System.out.println("not trying");
                    ex.printStackTrace();
                }

                e.getWindow().dispose();
                e.getWindow().dispose();
            }
        });

    }


}