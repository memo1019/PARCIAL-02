package edu.escualing.arsw.Weather.Services;

import edu.escualing.arsw.Weather.Model.Stats;

public interface WeatherServices1 {
    public Stats getWeatherbyCity(String city) throws Exception;
}
