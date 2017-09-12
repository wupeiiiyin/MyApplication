package com.example.day01zouye.model;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 勿忘初心 on 2017/9/11.
 */

public class Okhttp {
    public void getData(Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("http://m.yunifang.com/yunifang/mobile/goods/getall?random=60305&encode=b0358434fda8d7478bfc325b5828b721&category_id=17").build();
       Call call = client.newCall(request);
        call.enqueue(callback);
    }
}
