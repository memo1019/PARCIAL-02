package edu.escuelaing.arsw.Weather.Services;

import edu.escuelaing.arsw.Weather.Model.Stats;

public interface WeatherServices1 {
    public Stats getWeatherByCity(String city) throws Exception;
}
