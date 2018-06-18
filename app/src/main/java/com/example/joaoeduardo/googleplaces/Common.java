package com.example.joaoeduardo.googleplaces;

import com.example.joaoeduardo.googleplaces.Remote.IGoogleAPIService;
import com.example.joaoeduardo.googleplaces.Remote.RetrofitClient;

public class Common {
    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";
    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getclient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
