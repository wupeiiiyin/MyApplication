package com.example.day01zouye;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.day01zouye.model.Bean;
import com.example.day01zouye.presenter.controller.Base_controlldr;
import com.example.day01zouye.presenter.controller.Base_controllerImp;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Base_controlldr.mView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Base_controllerImp base_controllerImp = new Base_controllerImp(this);
        base_controllerImp.Request();
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showData(List<Bean.DataBean> mdata) {
        Log.e("TAG", mdata.toString() );
        Log.e("TAG", "ssssssss" );
      //  Toast.makeText(this,mdata.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showloging() {

    }
}
