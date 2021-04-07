package edu.escualing.arsw.Weather.Model;

import java.io.Serializable;

public class Stats implements Serializable {
    private  int id;
    private Coord coord;
    private Weather weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private int clouds;
    private long dt;
    private Sunrise Sunrise;
    private  int timezone;
    private String name;
    public Stats(Coord coord, Weather weather, String base, Main main, int visibility, Wind wind, int clouds, long dt, Sunrise Sunrise, int timezone, int id, String name) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.Sunrise = Sunrise;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
    }

}
