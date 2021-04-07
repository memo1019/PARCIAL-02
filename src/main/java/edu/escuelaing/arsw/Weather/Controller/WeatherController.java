package edu.escuelaing.arsw.Weather.Controller;

import edu.escuelaing.arsw.Weather.Services.WeatherServices1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class WeatherController {
    @Autowired
    WeatherServices1 weatherServices;
    @RequestMapping(value="/weather/{city}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeatherByCity(@PathVariable(name="city") String city) {
        try {
            return new ResponseEntity<>(weatherServices.getWeatherByCity(city), HttpStatus.ACCEPTED);
        }catch(Exception e){
            Logger.getLogger(WeatherController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
