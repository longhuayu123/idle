package com.example.administrator.idle.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.administrator.idle.Recommend.OneFragment_one;
import com.example.administrator.idle.Recommend.OneFragment_two;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/22.
 */

public class MyAdapter extends FragmentPagerAdapter {

    //数据源的集合
   private  List<Fragment> list = new ArrayList<Fragment>();



    public MyAdapter(FragmentManager fm, List<Fragment> list) {
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

    /*//ViewPager与TabLayout绑定后，这里获取到PageTitle就是Tab的Text
    @Override
    public CharSequence getPageTitle(int position) {
        return [position];
    }*/




































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


    /**
     * Created by Administrator on 2017/5/23.
     */

   /* public static class OneFragmentAdapter extends FragmentPagerAdapter{

        private  String[] oneonetitles = new String[]{"视频","小说"};



        public OneFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position==1){
                return  new OneFragment_two();
            }
            *//*else if (){

            }else if (){

            }*//*

            return new OneFragment_one();
        }

        @Override
        public int getCount() {
            return oneonetitles.length;
        }

        //ViewPager与TabLayout绑定后，这里获取到PageTitle就是Tab的Text
        @Override
        public CharSequence getPageTitle(int position) {
            return oneonetitles[position];
        }

    }*/
}
