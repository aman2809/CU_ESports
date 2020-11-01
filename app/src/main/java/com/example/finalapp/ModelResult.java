package com.example.finalapp;

public class ModelResult {


    private String name;
    private String number;
    private int photo;


    public ModelResult() {
    }

    public ModelResult(String name, String number, int photo) {
        this.name = name;
        this.number = number;
        this.photo = photo;
    }


    // Getter


    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getPhoto() {
        return photo;
    }


    //Setter


    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
