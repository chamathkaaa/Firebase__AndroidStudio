package com.example.firebase_androidstudio;

public class Student {

    private String ID;
    private String Name;
    private String Address;
    private int Contact;

    public Student() {
    }

    public Student(String ID, String name, String address, int contact) {
        this.ID = ID;
        Name = name;
        Address = address;
        Contact = contact;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }
}
