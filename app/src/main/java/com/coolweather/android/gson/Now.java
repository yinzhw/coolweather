package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 857238590 on 2017/5/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
