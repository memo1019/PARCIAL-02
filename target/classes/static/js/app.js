app = (function (){

    var _module = "js/apiclient.js";
    var map;


    function _updateData(data){
        $("#lblname").text("City: "+data.name);
        $("#lblid").text("Id: "+data.id);
        $("#lbltimezone").text("City: "+data.timezone);
        $("#lbldt").text("Dt: "+data.dt);
        $("#lblclouds").text("Clouds: "+data.clouds);
        $("#lblvisibility").text("Visibility: "+data.visibility);
        $("#lblbase").text("Base: "+data.base);
        $("#lbllat").text("Lat: "+data.Coord.lat);
        $("#lbllon").text("Lon: "+data.Coord.lon);
        $("#lblwid").text("Id: "+data.weather.id);
        $("#lblmain").text("Main: "+data.weather.main);
        $("#lbldescrp").text("Description: "+data.weather.description);
        $("#lblicon").text("Icon: "+data.weather.icon);
        $("#lbltemp").text("Temp: "+data.main.temp);
        $("#lblfeels").text("Feels like: "+data.main.feels_like);
        $("#lbltmpmin").text("Temp min: "+data.main.temp_min);
        $("#lbltmpmax").text("Temp max: "+data.main.temp_max);
        $("#lblpress").text("Pressure: "+data.main.pressure);
        $("#lblhumed").text("humidity: "+data.main.humidity);
        $("#lblspeed").text("Speed: "+data.sys.temp);
        $("#lbldeg").text("Deg: "+data.sys.id);
        $("#lbltype").text("Type: "+data.wind.speed);
        $("#lblSYSid").text("Id: "+data.wind.deg);
        $("#lblcountry").text("Country: "+data.sunrise.country);
        $("#lblsunrise").text("Sunrise: "+data.sunrise.sunrise);
        $("#lblsunset").text("Sunset: "+data.sunrise.sunset);
        document.getElementById("infow").style.visibility="visible";
        _initMap(data)
    }

    var markers;
    var bounds;

    function _initMap(data){
        map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: -34.397, lng: 150.644},
            zoom: 8
        });
        plotMarkers(data);
    }

    function plotMarkers(m){
        markers = [];
        bounds = new google.maps.LatLngBounds();

        m.forEach(function (marker) {
            var position = new google.maps.LatLng(marker.coord.lat, marker.coord.lng);

            markers.push(
                new google.maps.Marker({
                    position: position,
                    map: map,
                    animation: google.maps.Animation.DROP
                })
            );

            bounds.extend(position);
        });

        map.fitBounds(bounds);
    }

    return {

        getWeatherByCity: function (city) {
            $.getScript(_module, function () {
                apiclient.getWeatherByCity(city, _updateData);
            });
        }
    }

})();