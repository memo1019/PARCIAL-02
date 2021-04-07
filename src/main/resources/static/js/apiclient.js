apiclient= (function(){
    function getWeatherByCity(city,callback){
        $.ajax ({
            dataType: "json",
            url: "https://parcial-02.herokuapp.com//weather/"+city,
            success: function(data){
                callback(data)
            }
        });
    }

    return{
        getWeatherByCity:getWeatherByCity
    }
})();