package edu.escuelaing.arsw.Weather.Services;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public interface HttpConectionServices1 {
    JSONObject getWeatherByCity(String city) throws UnirestException;
}