/**
 * Represents a Customer object
 *
 * Customer contains a users forename, surname, DateOFBirth, Street, Town,
 * County, Email, HouseNumber and ContactNumber
 *
 * @author Daniel MacMonagle
 */

public class Customer {

    /**
     * Each Customer contains a forename String, surname String, DateOfBirth String, street String, town String,
     * county String, email String, houseNo int and contactNo int
     */

    String forename, surname, DateOfBirth, street, town, county, email;
    int houseNo, contactNo;

    /**
     * Creates a new Customer using the single argument constructor
     * within, and provides a default value for forename, surname, DateOFBirth, Street, Town,
     * County, Email, HouseNumber and ContactNumber which are "Unknown"
     */

    public Customer(){

        this.forename = "Unknown";
        this.surname = "Unknown";
        this.DateOfBirth = "Unknown";
        this.street = "Unknown";
        this.town = "Unknown";
        this.county = "Unknown";
        this.email = "Unknown";
        this.houseNo = 0;
        this.contactNo = 0;
    }

    /**
     * Creates a new Customer with the given
     *
     * @param forename The forename of the customer
     * @param surname The surname of the customer
     * @param DateOfBirth The DateOfBirth of the customer
     * @param street The street of the customer
     * @param town The town of the customer
     * @param county The county of the customer
     * @param email The email of the customer
     * @param houseNo The houseNo of the customer
     * @param contactNo The contactNo of the customer
     */

    public Customer(String forename, String surname, String DateOfBirth, String street, String town, String county,
                    String email, int contactNo, int houseNo){

        setForename(forename);
        setSurname(surname);
        setDateOfBirth(DateOfBirth);
        setStreet(street);
        setTown(town);
        setCounty(county);
        setEmail(email);
        setHouseNo(houseNo);
        setContactNo(contactNo);

    }

    /**
     * Accessor ...
     * @return forename of customer
     */

    public String getForename(){
        return forename;
    }

    /**
     * Mutator ...
     * @param forename of the customer
     */

    public void setForename(String forename){
        this.forename = forename;
    }

    /**
     * Accessor ...
     * @return surname of customer
     */

    public String getSurname(){
        return surname;
    }

    /**
     * Mutator ...
     * @param surname of the customer
     */

    public void setSurname(String surname){ this.surname = surname; }

    /**
     * Accessor ...
     * @return DateOfBirth of customer
     */

    public String getDateOfBirth(){
        return DateOfBirth;
    }

    /**
     * Mutator ...
     * @param DateOfBirth of the customer
     */

    public void setDateOfBirth (String DateOfBirth){
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Accessor ...
     * @return HouseNo of customer
     */

    public int getHouseNo(){
        return houseNo;
    }

    /**
     * Mutator ...
     * @param houseNo of the customer
     */

    public void setHouseNo(int houseNo){ this.houseNo = houseNo; }

    /**
     * Accessor ...
     * @return street of customer
     */

    public String getStreet(){
        return street;
    }

    /**
     * Mutator ...
     * @param street of the customer
     */

    public void setStreet(String street){
        this.street = street;
    }

    /**
     * Accessor ...
     * @return Town of customer
     */

    public String getTown(){
        return town;
    }

    /**
     * Mutator ...
     * @param town of the customer
     */

    public void setTown(String town){
        this.town = town;
    }

    /**
     * Accessor ...
     * @return County of customer
     */

    public String getCounty(){
        return county;
    }

    /**
     * Mutator ...
     * @param county of the customer
     */

    public void setCounty(String county){
        this.county = county;
    }

    /**
     * Accessor ...
     * @return ContactNo of customer
     */

    public int getContactNo(){
        return contactNo;
    }

    /**
     * Mutator ...
     * @param contactNo of the customer
     */

    public void setContactNo(int contactNo){
        this.contactNo = contactNo;
    }

    /**
     * Accessor ...
     * @return Email of customer
     */

    public String getEmail(){
        return email;
    }

    /**
     * Mutator ...
     * @param email of the customer
     */

    public void setEmail(String email){
        this.email = email;
    }


    /**
     * Returns the details of the Customer
     *
     * @return forename, surname, DateOFBirth, Street, Town,
     * County, Email, HouseNumber and ContactNumber
     */

    public String toString(){
        return "Forename: " + getForename() +
                "\nSurname: " + getSurname() +
                "\nDate of Birth: " + getDateOfBirth() +
                "\nHouse Number: " + getHouseNo() +
                "\nStreet: " + getStreet() +
                "\nTown: " + getTown() +
                "\nCounty: " + getCounty() +
                "\nContact Number: " + getContactNo() +
                "\nEmail: " + getEmail();

    }

}
