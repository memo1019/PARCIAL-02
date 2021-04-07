app = (function (){

    var _module = "js/apiclient.js";
    var map;


    function _updateData(data){
        $("#name").text("City: "+data.name);
        $("#id").text("Id: "+data.id);
        $("#timezone").text("City: "+data.timezone);
        $("#dt").text("Dt: "+data.dt);
        $("#clouds").text("Clouds: "+data.clouds);
        $("#visibility").text("Visibility: "+data.visibility);
        $("#base").text("Base: "+data.base);
        $("#lat").text("Lat: "+data.Coord.lat);
        $("#lon").text("Lon: "+data.Coord.lon);
        $("#wid").text("Id: "+data.weather.id);
        $("#main").text("Main: "+data.weather.main);
        $("#descrp").text("Description: "+data.weather.description);
        $("#icon").text("Icon: "+data.weather.icon);
        $("#temp").text("Temp: "+data.main.temp);
        $("#feels").text("Feels like: "+data.main.feels_like);
        $("#tmpmin").text("Temp min: "+data.main.temp_min);
        $("#tmpmax").text("Temp max: "+data.main.temp_max);
        $("#press").text("Pressure: "+data.main.pressure);
        $("#humed").text("humidity: "+data.main.humidity);
        $("#speed").text("Speed: "+data.sys.temp);
        $("#deg").text("Deg: "+data.sys.id);
        $("#type").text("Type: "+data.wind.speed);
        $("#Sunid").text("Id: "+data.wind.deg);
        $("#country").text("Country: "+data.sunrise.country);
        $("#sunrise").text("Sunrise: "+data.sunrise.sunrise);
        $("#sunset").text("Sunset: "+data.sunrise.sunset);
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