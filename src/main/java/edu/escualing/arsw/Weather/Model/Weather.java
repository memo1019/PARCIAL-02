package edu.escualing.arsw.Weather.Model;

import java.io.Serializable;

public class Weather implements Serializable {
    private long id;
    private String main;
    private String description;
    private String icon;
    public Weather(long id,String main,String description,String icon){
        this.id=id;
        this.description=description;
        this.main=main;
        this.icon=icon;
    }
}
