package edu.escuelaing.arsw.Weather.Model;

import java.io.Serializable;

public class Sunrise implements Serializable {
    private int id;
    private int type;
    private String country;
    private Long sunrise;
    private Long sunset;

    public Sunrise(int type, int id, String country, Long sunrise, Long sunset) {
        this.id = id;
        this.type = type;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public Sunrise() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

    public void setSunset(Long sunset) {
        this.sunset = sunset;
    }
}
