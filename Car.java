import java.io.Serializable;

public class Car implements Serializable {

    String make, model, color, fuelType, transmission, body, registration;
    int doors, year, mileage;
    float engineSize, taxPrice, price;

    public Car(){
        this.registration = "Unknown";
        this.make = "Unknown";
        this.model = "Unknown";
        this.engineSize = 0f;
        this.doors = 0;
        this.price = 0f;
        this.year = 0;
        this.taxPrice = 0f;
        this.color = "Unknown";
        this.fuelType = "Unknown";
        this.transmission = "Unknown";
        this.body = "Unknown";
        this.mileage = 0;
    }

    public Car(String registration, String make, String model, String color, String fuelType, String transmission, String body,
               int doors, int year, int mileage, float engineSize, float taxPrice, float price){
        this.make = make;
        this.model = model;
        this.registration = registration;
        this.engineSize = engineSize;
        this.doors = doors;
        this.price = price;
        this.year = year;
        this.taxPrice = taxPrice;
        this.color = color;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.body = body;
        this.mileage = mileage;
    }

    public String getMake(){
        return make;
    }

    public void setMake(){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(){
        this.model = model;
    }

    public float getEngineSize(){
        return engineSize;
    }

    public void setEngineSize(){
        this.engineSize = engineSize;
    }

    public int getDoors(){
        return doors;
    }

    public void setDoors(){
        this.doors = doors;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    public int getYear(){
        return year;
    }

    public void setYear(){
        this.year = year;
    }

    public float getTaxPrice(){ return taxPrice; }

    public void setTaxPrice(){ this.taxPrice = taxPrice; }

    public String getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;
    }

    public String getFuelType(){
        return fuelType;
    }

    public void setFuelType(){
        this.fuelType = fuelType;
    }

    public String getTransmission(){
        return transmission;
    }

    public void setTransmission(){
        this.transmission = transmission;
    }

    public String getBody(){
        return body;
    }

    public void setBody(){
        this.body = body;
    }

    public int getMileage(){
        return mileage;
    }

    public void setMileage(){
        this.mileage = mileage;
    }

    public String getRegistration(){
        return registration;
    }

    public void setRegistration(){
        this.registration = registration;
    }

    public String toString(){
        return String.format("%-17s%-17s%-24s%-18s%-20s%-17s%-24s%-20s%-20s%-17s%-17s%-17s%-17s\n\n",  getRegistration(), getMake(),
                getModel(), getEngineSize() ,getYear(), getColor(), getBody(), getTransmission(), getFuelType(), getDoors(), getMileage(), getTaxPrice(), getPrice());

    }

}
