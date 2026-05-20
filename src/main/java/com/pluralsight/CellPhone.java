package com.pluralsight;

// added cellphone class to instantiate objects in
public class CellPhone {
    //add cellphone details needed properties/ data members
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // added constructor and set to the given values
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    //add overloaded constructor
    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    //Getter
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


    // setter
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

    // add dial method
    public void dial(String phoneNumber) {
        System.out.println(owner + "'s phone is calling " + phoneNumber);
    }

    //add overloaded method constructor
    public void dial(CellPhone phone) {
        System.out.println(owner + "'s phone is calling " + phone.getPhoneNumber());
    }

}