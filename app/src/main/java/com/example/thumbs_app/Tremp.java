package com.example.thumbs_app;

import android.util.Log;

public class Tremp {

    String id;
    String Createtremp;
    String Name;
    String TimeStart;
    String TimeEnd;
    String LocationStart;
    String LocationEnd;
    String day;
    String phoneDriver;
    int CountofRriders;


    public int getCountofRriders() {
        return CountofRriders;
    }

    public void setCountofRriders() {
        CountofRriders++;
    }

    public Tremp(){

    }

    public Tremp(String id1,String Cp, String name, String timeStart, String timeEnd, String location,String locationEnd2, String day,String phonenum) {
        phoneDriver=phonenum;
        Createtremp=Cp;
        id = id1;
        Name = name;
        TimeStart = timeStart;
        TimeEnd = timeEnd;
        LocationStart = location;
        LocationEnd = locationEnd2;
        this.day = day;
    }

    public String getcp() {
        Log.d("ASd ","Asd"+Createtremp);

        return Createtremp;
    }
    public void setcp(String name) {
        Createtremp = name;
    }

    public String getName() {
        return Name;
    }
    public String getPhoneDriver() {
        return phoneDriver;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getTimeStart() {
        return TimeStart;
    }

    public void setTimeStart(String timeStart) {
        TimeStart = timeStart;
    }

    public String getTimeEnd() {
        return TimeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        TimeEnd = timeEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocationStart() {
        return LocationStart;
    }

    public void setLocationStart(String locationStart) {
        LocationStart = locationStart;
    }

    public String getLocationEnd() {
        return LocationEnd;
    }

    public void setLocationEnd(String locationEnd) {
        LocationEnd = locationEnd;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}