package edu.escualing.arsw.Weather.Model;

import java.io.Serializable;

public class Wind implements Serializable {
    private double speed;
    private double deg;
    public Wind(double deg,double speed){
        this.speed=speed;
        this.deg=deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }
}
