package edu.escuelaing.arsw.Weather.Services.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.escuelaing.arsw.Weather.Services.HttpConectionServices1;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class HttpConectionServices implements HttpConectionServices1 {
    @Override
    public JSONObject getWeatherByCity(String city) throws UnirestException {
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&appid=b334d625411f5b37adfabafe3783cafa", city);
        HttpResponse<String> response = Unirest
                .get(url)
                .asString();
        return new JSONObject(response.getBody());
    }
}
