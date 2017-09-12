package com.example.day01zouye.presenter.controller;

import com.example.day01zouye.model.Bean;
import com.example.day01zouye.presenter.Base_Presenter;
import com.example.day01zouye.view.Besa_View;

import java.util.List;

/**
 * Created by 勿忘初心 on 2017/9/11.
 */

public interface Base_controlldr  {
    interface mView extends Besa_View{
        void showData(List<Bean.DataBean> mdata);
        void showloging();
    }
    interface mPresenter extends Base_Presenter{
        void Request();
    }
}
