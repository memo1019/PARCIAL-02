package edu.escuelaing.arsw.Weather.ConfigCache.impl;

import edu.escuelaing.arsw.Weather.ConfigCache.WeatherCache1;
import edu.escuelaing.arsw.Weather.Model.Stats;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.javatuples.Pair;

@Service
public class WeatherCache implements WeatherCache1 {
    private Map<String, Pair<Date, List<Stats>>> cache;


    /**
     * Instantiates a new Coronavirus stats cache.
     */
    public WeatherCache() {
        this.cache = new ConcurrentHashMap<String, Pair<Date, List<Stats>>>();
    }

    @Override
    public void addCache(String name, List<Stats> data) {
        Pair<Date, List<Stats>> tuple = new Pair<Date, List<Stats>>(new Date(), data);
        cache.put(name, tuple);
    }

    @Override
    public List<Stats> getCacheByName(String name) {
        return cache.get(name).getValue1();
    }

    @Override
    public Date getCreationDate(String name) {
        return cache.get(name).getValue0();
    }

    @Override
    public void updateCacheData(String name, List<Stats> newData) {
        Pair<Date, List<Stats>> tuple = new Pair<Date, List<Stats>>(new Date(), newData);
        cache.put(name, tuple);
    }

    @Override
    public boolean containsCache(String name) {
        return cache.containsKey(name);
    }
}
