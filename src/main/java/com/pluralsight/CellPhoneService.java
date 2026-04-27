
package com.pluralsight;
public class CellphoneService {

        // created a cellphone application class with a main
    class CellPhoneApplication {
            public static void main(String[] args) {
            }
        }

        // added cellphone class to instantiate objects in
        class CellPhone {
        // added constructor and set to the given values
            public CellPhone(Integer serialNumber, String model, String carrier, String phoneNumber, String owner) {
                this.serialNumber = serialNumber = 0;
                this.model = model = "";
                this.carrier = carrier = "";
                this.phoneNumber = phoneNumber = "";
                this.owner = owner = "";
            }

            //add cellphone details needed properties/ data members
            Integer serialNumber;
            String model;


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

            String carrier;
            String phoneNumber;
            String owner;


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

            //add empty parameterless constructor from generate



        }

    }
}
