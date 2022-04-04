package com.project.restaurant.presenters;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.project.restaurant.models.Provider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class FetchAPI {
    String url;

    public FetchAPI(String url) {
        this.url = url;
    }

    public ArrayList<Provider> getData() throws IOException {
        URL jsonpage = new URL(this.url);
        URLConnection urlcon = jsonpage.openConnection();
        BufferedReader buffread = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
        String response = buffread.readLine();

        Gson gson = new Gson();
        Type userListType = new TypeToken<ArrayList<Provider>>(){}.getType();

        return gson.fromJson(response, userListType);
    }
}
