package com.example.itsme.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperarature temperarature;
    @SerializedName("cond")
    public More more;

    public class Temperarature {
        public String max;
        public String min;
    }
    
    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
