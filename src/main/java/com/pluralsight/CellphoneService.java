package com.pluralsight;
//import scanner
import java.util.Scanner;

public class CellphoneService {
    public static void main(String[] args) {

    }


    // created a cellphone application class with a main
    class CellPhoneApplication {
        public static void main(String[] args) {
        }
    }

    // added cellphone class to instantiate objects in
    class CellPhone {

        //add cellphone details needed properties/ data members
        Double serialNumber;
        String model ;
        String carrier;
        String phoneNumber;
        String owner;
 // provide getter and setters for all 5 data memebers
        public Double getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(Double serialNumber) {
            this.serialNumber = serialNumber;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getCarrier() {
            return carrier;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        //add empty parameterless constructor from generate
        public CellPhone(Double serialNumber, String model, String carrier, String phoneNumber, String owner) {
            this.serialNumber = serialNumber = 0.0;
            this.model = model = "";
            this.carrier = carrier = "";
            this.phoneNumber = phoneNumber = "";
            this.owner = owner = "";
        }







    }
}