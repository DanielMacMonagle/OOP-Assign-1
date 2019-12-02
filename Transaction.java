public class Transaction{

    String bankName, bankNumber;
    int cardNumber, CVV;


    public Transaction(){
        this.cardNumber = 0;
        this.CVV = 0;
        this.bankName = "Unknown";
        this.bankNumber = "Unknown";
    }

    public Transaction(String bankName, String bankNumber, int cardNumber, int CVV){
        this.bankNumber = bankNumber;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.CVV = CVV;
    }

    public String getBankName(){
        return bankName;
    }

    public void setBankName(){
        this.bankName = bankName;
    }

    public String getBankNumber(){
        return bankNumber;
    }

    public void setBankNumber(){
        this.bankNumber = bankNumber;
    }

    public int getCardNumber(){
        return cardNumber;
    }

    public void setCardNumber(){
        this.cardNumber = cardNumber;
    }

    public int getCVV(){
        return CVV;
    }

    public void setCVV(){
        this.CVV = CVV;
    }

    public String toString(){
        return "Card Number: " + getCardNumber() +
                "\nCVV: " + getCVV() +
                "\nBank Name: " + getBankName() +
                "\nBank Number: " + getBankNumber();
    }


}
