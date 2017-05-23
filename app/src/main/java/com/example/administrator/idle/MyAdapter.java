package com.example.administrator.idle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/22.
 */

public class MyAdapter extends FragmentPagerAdapter {

   //数据源的集合
    List<Fragment> list = new ArrayList<Fragment>();



    public MyAdapter(FragmentManager fm,List<Fragment> list) {
        super(fm);
        this.list.clear();
        this.list.addAll(list);
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);

    }

    @Override
    public int getCount() {
        return list.size();
    }






































    /*private String[] titlesmain = new String[]{"推荐", "小说", "视频", "我的"};
    private String[] titlestuijiantop = new String[]{"推荐","综艺","搞笑","体育"};

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new TwoFragment();
        } else if (position == 2) {
            return new ThreeFragment();
        } else if (position == 3) {
            return new FourFragment();
        }
        return new OneFragment();
    }

    @Override
    public int getCount() {
           return titlesmain.length;
    }

    public CharSequence getPageTitle(int position) {
        return titlesmain[position];
    }*/



}
