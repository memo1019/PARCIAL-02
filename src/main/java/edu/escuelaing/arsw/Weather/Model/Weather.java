package edu.escuelaing.arsw.Weather.Model;

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

    public Weather() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
