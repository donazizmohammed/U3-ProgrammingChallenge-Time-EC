package com.example.project;
public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int hour;
    private int minute;
    private int second;
    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //GETTERS 
    

    public String info(){
        String str = "";
        if (hour < 10){ str += 0; }
        str += hour;
        str += ":";
        if (minute < 10){ str += 0; }
        str += minute;
        str += ":"; 
        if (second < 10){ str += 0; }
        str += second;
        return str;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    public void tick(){
        if (second < 59) {
            second++;
        } else {
            second = 0;
            if (minute < 59) {
                minute++;
            } else {
                minute = 0;
                if (hour < 23) {
                    hour++;
                } else {
                    hour = 0;
                }
            }
        }
    }


    public void add(Time time2) {
        
        int totalSeconds = this.second + time2.second;
        int carryMinutes = totalSeconds / 60;
        this.second = totalSeconds % 60;

        int totalMinutes = this.minute + time2.minute + carryMinutes;
        int carryHours = totalMinutes / 60;
        this.minute = totalMinutes % 60;

        int totalHours = this.hour + time2.hour + carryHours;
        this.hour = totalHours % 24;
    }
}

