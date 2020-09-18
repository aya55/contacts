package com.example.contacts;

public class contact {
    private  String name;
    private  String phone;
    private  int photo;
    public contact() {

    }

    public contact(String name, String phone, int photo) {
        this.name = name;
        this.phone = phone;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPhoto() {
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
