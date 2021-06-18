package HomeWork7;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class WeatherApp {

    private static final String apiKey = "TTNQdRjBkaaDvVZeutxS8wG5TcwkBaaD";
    private static final String cityID = "293149";
    private static final String PROTOCOL = "http";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String FIVE_DAYS = "5day";
    static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {


        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();


        HttpUrl urlWeatherFromCityID = new HttpUrl
                .Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(FORECASTS)
                .addPathSegment(VERSION)
                .addPathSegment(DAILY)
                .addPathSegment(FIVE_DAYS)
                .addPathSegment(cityID)
                .addQueryParameter("apikey", apiKey)
                .build();

        Request requestWeatherFromCityID = new Request
                .Builder()
                .url(urlWeatherFromCityID)
                .get()
                .build();

        Response response = okHttpClient.newCall(requestWeatherFromCityID).execute();
        String responseBodyWeatherFromCityID = response.body().string();
        System.out.println(response.code());
        for (int day = 0; day < 5; day++) {
            String dataForEveryDay = objectMapper.readTree(responseBodyWeatherFromCityID)
                    .at("/DailyForecasts").get(day).at("/Date").asText().split("T")[0];
            String minimumTemperatureForEveryDay = objectMapper.readTree(responseBodyWeatherFromCityID)
                    .at("/DailyForecasts").get(day).at("/Temperature/Minimum/Value").asText();
            String maximumTemperatureForEveryDay = objectMapper.readTree(responseBodyWeatherFromCityID)
                    .at("/DailyForecasts").get(day).at("/Temperature/Maximum/Value").asText();
            String unitMinimumTemperatureForEveryDay = objectMapper.readTree(responseBodyWeatherFromCityID)
                    .at("/DailyForecasts").get(day).at("/Temperature/Minimum/Unit").asText();
            //Если вдруг юниты будут отличаться
            String unitMaximumTemperatureForEveryDay = objectMapper.readTree(responseBodyWeatherFromCityID)
                    .at("/DailyForecasts").get(day).at("/Temperature/Maximum/Unit").asText();
            String weatherForEveryDay = "Дата : " + dataForEveryDay + "\nМинимальная температура : "
                    + minimumTemperatureForEveryDay + unitMinimumTemperatureForEveryDay +
                    "\nМаксимальная температура : " + maximumTemperatureForEveryDay + unitMaximumTemperatureForEveryDay;
            System.out.println(weatherForEveryDay);
        }

        //Получение ID города заккоментировано что бы не потратить все запросы
        /*HttpUrl urlCityID = new HttpUrl
                .Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegments("locations/v1/cities/autocomplete")
                .addQueryParameter("apikey", apiKey)
                .addQueryParameter("q", "Khabarovsk")
                .build();

        Request requestCityID = new Request
                .Builder()
                .url(urlCityID)
                .get()
                .build();

        Response response = okHttpClient.newCall(requestCityID).execute();
        String responseBodyCityID = response.body().string();
        System.out.println(response.code());
        System.out.println(responseBodyCityID);
        String stringCityID = responseBodyCityID.split(",")[1];
        String cityID = stringCityID.split(":")[1];
        String clearCityID = cityID.replace( "\"", "");*/
    }
}
