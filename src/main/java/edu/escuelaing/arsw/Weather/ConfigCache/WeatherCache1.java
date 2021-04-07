package edu.escuelaing.arsw.Weather.ConfigCache;

import edu.escuelaing.arsw.Weather.Model.Stats;

import java.util.Date;
import java.util.List;

public interface WeatherCache1 {
    void addCache(String name, List<Stats> data);

    List<Stats> getCacheByName (String name);

    Date getCreationDate (String name);

    void updateCacheData (String name, List<Stats> newData);

    boolean containsCache (String name);
}
