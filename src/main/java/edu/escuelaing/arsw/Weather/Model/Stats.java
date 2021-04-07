package edu.escuelaing.arsw.Weather.Model;

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

    public Stats() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public edu.escuelaing.arsw.Weather.Model.Sunrise getSunrise() {
        return Sunrise;
    }

    public void setSunrise(edu.escuelaing.arsw.Weather.Model.Sunrise sunrise) {
        Sunrise = sunrise;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
