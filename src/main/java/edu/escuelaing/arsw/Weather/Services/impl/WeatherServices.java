package edu.escuelaing.arsw.Weather.Services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.escuelaing.arsw.Weather.ConfigCache.WeatherCache1;
import edu.escuelaing.arsw.Weather.Model.*;
import edu.escuelaing.arsw.Weather.Services.HttpConectionServices1;
import edu.escuelaing.arsw.Weather.Services.WeatherServices1;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WeatherServices  implements WeatherServices1{

    @Autowired
    HttpConectionServices1 connectionHttpInterface;

    @Autowired
    WeatherCache1 weatherCacheService;
    private final String cache = "oneCity";

    public List<Stats> getWeatherByCity(String city) throws Exception{
        if (!weatherCacheService.containsCache(cache) || new Date().getTime() - weatherCacheService.getCreationDate(cache).getTime() >= 300000 ) {
            List<Stats> stats = new ArrayList<>();
            try {
                JSONObject rta = connectionHttpInterface.getWeatherByCity(city);

                int id = rta.getInt("id");

                JSONObject jsonObject = rta.getJSONObject("coord");
                ObjectMapper mapper = new ObjectMapper();
                Coord coord = mapper.readValue(jsonObject.toString(), Coord.class);

                jsonObject = rta.getJSONObject("main");
                Main main = mapper.readValue(jsonObject.toString(), Main.class);

                jsonObject = rta.getJSONArray("weather").getJSONObject(0);
                Weather weather = mapper.readValue(jsonObject.toString(), Weather.class);


                jsonObject = rta.getJSONObject("wind");
                Wind wind = mapper.readValue(jsonObject.toString(), Wind.class);

                jsonObject = rta.getJSONObject("clouds");
                int clouds = rta.getJSONObject("clouds").getInt("all");

                jsonObject = rta.getJSONObject("sunrise");
                Sunrise sunrise = mapper.readValue(jsonObject.toString(), Sunrise.class);

                Long dt = rta.getLong("dt");
                String base = rta.getString("base");
                int visibility = rta.getInt("visibility");
                int timezone = rta.getInt("timezone");
                String name = rta.getString("name");

                stats.add(new Stats(coord, weather, base, main, visibility, wind, clouds, dt, sunrise, timezone, id, name));
            } catch (Exception e) {
            throw new Exception(e.getMessage());
            }
            if (stats.size() == 0) {
                throw new Exception("Cases not found");
            }
        weatherCacheService.updateCacheData(cache, stats);
    }
        return weatherCacheService.getCacheByName(cache);

    }

}
