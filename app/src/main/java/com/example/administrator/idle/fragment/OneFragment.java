package com.example.administrator.idle.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.idle.R;
import com.example.administrator.idle.Recommend.OneFragment_five;
import com.example.administrator.idle.Recommend.OneFragment_four;
import com.example.administrator.idle.Recommend.OneFragment_one;
import com.example.administrator.idle.Recommend.OneFragment_six;
import com.example.administrator.idle.Recommend.OneFragment_three;
import com.example.administrator.idle.Recommend.OneFragment_two;
import com.example.administrator.idle.adapter.VpiPageAdapter;
import com.viewpagerindicator.TabPageIndicator;

import java.util.ArrayList;

public class OneFragment extends Fragment {


    private TabPageIndicator tbi;
    private ViewPager vp;
    private VpiPageAdapter adapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();

    private String[] titles = {"推荐","视频","娱乐","体育","电影","军事"};
    private View view;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_one_fragment,container,false);
        init();
        return view;
    }



    private void init() {
        this.vp = (ViewPager)view.findViewById(R.id.vp);
        this.tbi = (TabPageIndicator)view. findViewById(R.id.tbi);

        fragments.add(new OneFragment_one());
        fragments.add(new OneFragment_two());
        fragments.add(new OneFragment_three());
        fragments.add(new OneFragment_four());
        fragments.add(new OneFragment_five());
        fragments.add(new OneFragment_six());



        adapter = new VpiPageAdapter(getFragmentManager(), fragments, titles);
        vp.setAdapter(adapter);
        tbi.setViewPager(vp);

    }





   /* private TabLayout tablayout;
    private ViewPager viewpager;
    private ArrayList<Fragment> arrayList;
    private MyAdapter adapter;
    private String[] titles = {"oneone", "onetwo"};


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        init();
    }

    private void init() {
        viewpager =
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_one_fragment, container, false);


    }*/
}




/*

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_one_fragment, container, false);




       */
/* initlayout();

        oneadapter = new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return onefragment.get(position);
            }

            @Override
            public int getCount() {
                return onefragment.size();
            }
        };
*//*

    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void initViews() {

        */
/*onetitles = new String[]{"oneone", "onetwo"};
        onefragment = new ArrayList<>();
        onefragment.add(new OneFragment_one());
        onefragment.add(new OneFragment_two());

        FragmentManager fragmentManager = getFragmentManager();
        MyAdapter.OneFragmentAdapter oneadapter = new MyAdapter.OneFragmentAdapter(fragmentManager);
*//*



        */
/*//*
/使用适配器将ViewPager与Fragment绑定在一起
      oneviewpager = (ViewPager) findViewById(R.id.viewpager);
        onefragmentadapter = new OneFragmentAdapter(getSupportFragmentManager());
        oneviewpager.setAdapter(onefragmentadapter);

        //将TabLayout与ViewPager绑定在一起
        onetablayout= (TabLayout) findViewById(R.id.one_tablayout);
        onetablayout.setupWithViewPager(oneviewpager);


        //指定Tab的位置
        one = onetablayout.getTabAt(0);
        two = onetablayout.getTabAt(1);

        //设置Tab的图标，假如不需要则把下面的代码删去
        one.setIcon(R.mipmap.ic_launcher);
        two.setIcon(R.mipmap.ic_launcher);*//*

    }









    */
/*private TabLayout onetablayout;
    private ViewPager oneviewpager;
    private OneFragmentAdapter onefragmentadapter;

    private TabLayout.Tab one;
    private TabLayout.Tab two;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);

        getActionBar().hide();
        setContentView(R.layout.activity_one_fragment);

        //初始化视图
        initViews();
    }

    private void initViews() {

        //使用适配器将ViewPager与Fragment绑定在一起
        oneviewpager = (ViewPager) findViewById(R.id.viewpager);
        onefragmentadapter = new OneFragmentAdapter(getSupportFragmentManager());
        oneviewpager.setAdapter(onefragmentadapter);

        //将TabLayout与ViewPager绑定在一起
        onetablayout= (TabLayout) findViewById(R.id.one_tablayout);
        onetablayout.setupWithViewPager(oneviewpager);


        //指定Tab的位置
        one = onetablayout.getTabAt(0);
        two = onetablayout.getTabAt(1);

        //设置Tab的图标，假如不需要则把下面的代码删去
        one.setIcon(R.mipmap.ic_launcher);
        two.setIcon(R.mipmap.ic_launcher);

    }*//*

}
*/
