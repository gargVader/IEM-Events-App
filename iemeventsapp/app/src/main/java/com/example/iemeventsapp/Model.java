package com.example.iemeventsapp;

public class Model {

    String eventTitle, location, month, card_image;
    int day;
    // Empty Constructor
    Model(){

    }

    // Constructor
    public Model(String eventTitle, String location, int day, String month, String card_image) {
        this.eventTitle = eventTitle;
        this.location = location;
        this.day = day;
        this.month = month;
        this.card_image = card_image;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCard_image() {
        return card_image;
    }

    public void setCard_image(String card_image) {
        this.card_image = card_image;
    }
}
