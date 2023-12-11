package com.example.animalagro.io;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL = "https://veterinariaanimalagro.pythonanywhere.com";  // Url de la API
    // Se configura una instancia de retrofit para comunicarse con la API de la veterinaria
    // Se establece la .baseUrl(BASE_URL) y se configura de GSON, para convertir las respuestas de
    // JSON a objetos java
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    // Mas informacion sobre GSON:
    // Gson es una biblioteca que facilita el proceso de mapear datos JSON a objetos Java y viceversa
}