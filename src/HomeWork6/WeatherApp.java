package HomeWork6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WeatherApp {
    public static void main(String[] args) throws IOException {

        String apiKey = "TTNQdRjBkaaDvVZeutxS8wG5TcwkBaaD";
        String cityID = "293149";

        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();


        HttpUrl urlWeatherFromCityID = new HttpUrl
                .Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegments("forecasts/v1/daily/5day/" + cityID)
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
        String[] arrayWeatherFromCityID = responseBodyWeatherFromCityID.split("},");
        for (int i = 0; i < arrayWeatherFromCityID.length; i++) {
            System.out.println(arrayWeatherFromCityID[i]);
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
