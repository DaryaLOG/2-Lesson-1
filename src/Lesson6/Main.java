package Lesson6;

import okhttp3.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient();

        MediaType JSON = MediaType.parse("JSON");

        //RequestBody requestBody = RequestBody.create();
        Request request = new Request.Builder()
                .url("https://api.weather.yandex.ru/v2/forecast?lat=55.820946&lon=37.585241&lang=ru_RU&limit=5&extra=true")
                .addHeader("X-Yandex-API-Key", "28186e20-0b08-40ce-84cf-be632b62b22b")
                .build();

        try {
            Response response = okHttpClient.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
