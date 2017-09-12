package com.example.day01zouye.presenter.controller;

import android.util.Log;

import com.example.day01zouye.model.Bean;
import com.example.day01zouye.model.Okhttp;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by 勿忘初心 on 2017/9/11.
 */

public class Base_controllerImp implements Base_controlldr.mPresenter {

    private  Base_controlldr.mView mView1;
    private  Okhttp okhttp;

    public Base_controllerImp(Base_controlldr.mView mView){
        mView1 = mView;
        okhttp = new Okhttp();
    }
    @Override
    public void Request() {
        mView1.showloging();
        okhttp.getData(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("TAG", "请求失败 " );
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e("TAG", "请求成功 " );
                String string = response.body().string();
                Gson gson = new Gson();
                Bean bean = gson.fromJson(string, Bean.class);
                List<Bean.DataBean> data = bean.getData();
                List<Bean.DataBean> mdata = new ArrayList<Bean.DataBean>();
                mdata.addAll(data);
                mView1.showData(mdata);
            }
        });
    }
}
