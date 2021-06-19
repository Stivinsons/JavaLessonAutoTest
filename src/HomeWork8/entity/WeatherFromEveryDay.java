package HomeWork8.entity;

public class WeatherFromEveryDay {
    private String time_Response;
    private String city_Key;
    private String weatherForDay;


    public WeatherFromEveryDay(String time_Response, String city_Key, String weatherFromDay) {
        this.time_Response = time_Response;
        this.city_Key = city_Key;
        this.weatherForDay = weatherFromDay;
    }

    public String getTime_Response() {
        return time_Response;
    }

    public void setTime_Response(String time_Response) {
        this.time_Response = time_Response;
    }

    public String getCity_Key() {
        return city_Key;
    }

    public void setCity_Key(String city_Key) {
        this.city_Key = city_Key;
    }

    public String getWeatherForDay() {
        return weatherForDay;
    }

    public void setWeatherFromFiveDays(String weatherFromFiveDays) {
        this.weatherForDay = weatherFromFiveDays;
    }

    @Override
    public String toString() {
        return "WeatherFromEveryDay{" +
                "time_Response='" + time_Response + '\'' +
                ", city_Key='" + city_Key + '\'' +
                ", weatherForDay='" + weatherForDay + '\'' +
                '}';
    }
}
