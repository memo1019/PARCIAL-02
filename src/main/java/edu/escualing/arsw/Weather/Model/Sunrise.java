package edu.escualing.arsw.Weather.Model;

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
}
