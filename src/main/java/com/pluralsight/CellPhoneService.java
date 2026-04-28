
package com.pluralsight;
// import scanner
import java.util.Scanner;

    // created a cellphone application class with a main
class CellPhoneApplication {
     public static void main(String[] args) {

         // insert scanner
         Scanner scanner = new Scanner(System.in);

         // enter CellPhone class
         CellPhone phone = new CellPhone();

         //use setter cellphone to add values
         System.out.println("What is the serial number? ");
         Integer serialNumber = scanner.nextInt();
         phone.setSerialNumber(serialNumber);
         scanner.nextLine();

         System.out.println("What model is the phone? ");
         String model = scanner.nextLine();
         phone.setModel(model);

         System.out.println("Who is the carrier? ");
         String carrier = scanner.nextLine();
         phone.setCarrier(carrier);

         System.out.println(" What is the phone number? ");
         String phoneNumber = scanner.nextLine();
         phone.setPhoneNumber(phoneNumber);

         System.out.println(" Who is the owner of the phone? ");
         String owner = scanner.nextLine();
         phone.setOwner(owner);


         // use getter print to screen
         System.out.println("Serial Number: " + phone.getSerialNumber());
         System.out.println("Model: " + phone.getModel());
         System.out.println("Carrier: " + phone.getCarrier());
         System.out.println("Phone Number: " + phone.getPhoneNumber());
         System.out.println("Owner: " + phone.getOwner());


        }

    }


    // added cellphone class to instantiate objects in
class CellPhone {

        //add cellphone details needed properties/ data members
    private Integer serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // added constructor and set to the given values
    CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
        }


    //insert Getter
    public Integer getSerialNumber() {
         return serialNumber;
    }

    public String getModel() {
         return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }


        //String carrier;
        //String phoneNumber;
       // String owner;


    // insert setter
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}

