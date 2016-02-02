package com.example.nick.fragmentsystem;

import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

public class MyPagerAdapter extends PagerAdapter {

    private List<View> viewList;
    public MyPagerAdapter(List<View> viewList){
        this.viewList = viewList;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


}
