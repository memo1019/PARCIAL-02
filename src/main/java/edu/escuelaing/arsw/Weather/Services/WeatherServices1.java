package edu.escuelaing.arsw.Weather.Services;

import edu.escuelaing.arsw.Weather.Model.Stats;

import java.util.List;

public interface WeatherServices1 {
    public List<Stats> getWeatherByCity(String city) throws Exception;
}
