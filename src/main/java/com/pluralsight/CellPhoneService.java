
package com.pluralsight;
// import scanner
import java.util.Scanner;

    // created a cellphone application class with a main+
class CellPhoneApplication {

        public static void main(String[] args) {

            //insert scanner
            Scanner scanner = new Scanner(System.in);

            //enter both new cellphones
            CellPhone cellPhone1 = new CellPhone();
            CellPhone cellPhone2 = new CellPhone();

            // fill phone 1
            System.out.println("Enter info for phone 1");
            fillPhone(scanner, cellPhone1);

            //fill phone 2
            System.out.println("Enter info for phone 2");
            fillPhone(scanner, cellPhone2);

            //display phone 1
            System.out.println("**** Phone 1 ****");
            display(cellPhone1);

            //display phone 2
            System.out.println("**** Phone 2 ****");
            display(cellPhone2);

            cellPhone1.dial(cellPhone2.getPhoneNumber());
            cellPhone2.dial(cellPhone1.getPhoneNumber());

            scanner.close();
        }
            //use setter cellphone to add values
        public static void fillPhone(Scanner scanner, CellPhone phone) {
            System.out.print("What is the serial number? ");
            phone.setSerialNumber(scanner.nextInt());
            scanner.nextLine();

            System.out.println("What model is the phone? ");
            phone.setModel(scanner.nextLine());

            System.out.println("Who is the carrier? ");
            phone.setCarrier(scanner.nextLine());

            System.out.println(" What is the phone number? ");
            phone.setPhoneNumber(scanner.nextLine());

            System.out.println(" Who is the owner of the phone? ");
            phone.setOwner(scanner.nextLine());
        }
            //use getter print to screen
        public static void display(CellPhone phone) {
            System.out.println("Serial Number: " + phone.getSerialNumber());
            System.out.println("Model: " + phone.getModel());
            System.out.println("Carrier: " + phone.getCarrier());
            System.out.println("Phone Number: " + phone.getPhoneNumber());
            System.out.println("Owner: " + phone.getOwner());

        }
}

