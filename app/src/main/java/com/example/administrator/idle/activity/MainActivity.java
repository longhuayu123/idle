package com.example.administrator.idle.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.administrator.idle.adapter.MyAdapter;
import com.example.administrator.idle.R;
import com.example.administrator.idle.fragment.FourFragment;
import com.example.administrator.idle.fragment.OneFragment;
import com.example.administrator.idle.fragment.ThreeFragment;
import com.example.administrator.idle.fragment.TwoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private BottomNavigationBar bottomNavigationBar;
    private List<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView(); //实例化数据
        initData();   //添加数据
        initEvent();    //设置点击事件
    }

    private void initEvent() {
        //监听ViewPager的滑动
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomNavigationBar.selectTab(position, false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //禁止ViewPager滑动
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });


        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(int position) {
            }

            @Override
            public void onTabReselected(int position) {
            }
        });


    }

    private void initData() {

        //给viewpager设置数据
        list.add(new OneFragment());
        list.add(new TwoFragment());
        list.add(new ThreeFragment());
        list.add(new FourFragment());
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);

        //设置按钮模式  MODE_FIXED表示固定   MODE_SHIFTING表示转移
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        //设置背景风格       BACKGROUND_STYLE_STATIC表示静态的  ，BACKGROUND_STYLE_RIPPLE表示涟漪的，也就是可以变化的 ，跟随setActiveColorResource里面d颜色变化
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);


        //添加并设置图标、图标的颜色和文字
        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.ic_launcher, R.string.Recommend).setActiveColorResource(R.color.DarkBlue))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, R.string.Books).setActiveColorResource(R.color.MediumOrchid))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, R.string.Music).setActiveColorResource(R.color.DarkCyan))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, R.string.MyHome).setActiveColorResource(R.color.Green))
                .setFirstSelectedPosition(0)//设置默认选择item
                .initialise();//初始化


        //设置选中第一个添加的按钮
        bottomNavigationBar.selectTab(0, true);
        //显示ViewPager中添加的第一个页面
        viewPager.setCurrentItem(0);


    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
    }






    /* private ArrayList<Fragment> fragments;

    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private ThreeFragment threeFragment;
    private FourFragment fourFragment;

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabLayout.Tab one;
    private TabLayout.Tab two;
    private TabLayout.Tab three;
    private TabLayout.Tab four;

    private View contentLayout;

    private MyAdapter myAdapter;

    private BottomNavigationBar bottomNavigationBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        init();
        //初始化视图
   //     initViews();
        //初始化事件
     //   initEvents();
    }


   private void init() {
        bottomNavigationBar = (BottomNavigationBar) findViewById(bottom_navigation_bar);

        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);

        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.ic_launcher, R.string.Recommend).setActiveColorResource(R.color.colorAccent))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, R.string.Books).setActiveColorResource(R.color.colorAccent))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, R.string.Music).setActiveColorResource(R.color.colorAccent))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, R.string.MyHome).setActiveColorResource(R.color.colorAccent))
                .setFirstSelectedPosition(0)//设置默认选择item
                .initialise();//初始化

     //   textView = (TextView) findViewById(R.id.text);


        //设置事件监听器
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (position) {
                    case 0:
                     //   transaction.replace(R.id.contentLayout,OneFragment.class));
                        // textView.setText("one");
                        //Intent intent = new Intent(MainActivity.this, OneFragment.class);
                        //startActivity(intent);
                        break;
                    case 1:
                        //textView.setText("two");
                        //Intent intent2 = new Intent(MainActivity.this, OneFragment.class);
                        //startActivity(intent2);
                        break;
                    case 2:
                        textView.setText("three");
                        // Intent intent3 = new Intent(MainActivity.this, OneFragment.class);
                        // startActivity(intent3);
                        break;
                    case 3:
                        textView.setText("four");
                        //   Intent intent4 = new Intent(MainActivity.this, OneFragment.class);
                        //  startActivity(intent4);
                        break;
                }
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });


    }
*/





   /* private void initViews() {

        myAdapter = new MyAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);

        viewPager.setAdapter(myAdapter);

        tabLayout.setupWithViewPager(viewPager);

        one = tabLayout.getTabAt(0);
        two = tabLayout.getTabAt(1);
        three = tabLayout.getTabAt(2);
        four = tabLayout.getTabAt(3);

        one.setIcon(R.mipmap.ic_launcher);
        two.setIcon(R.mipmap.ic_launcher);
        three.setIcon(R.mipmap.ic_launcher);
        four.setIcon(R.mipmap.ic_launcher);

    }

    private void initEvents() {
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab == tabLayout.getTabAt(0)) {
                    one.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                    viewPager.setCurrentItem(0);
                } else if (tab == tabLayout.getTabAt(1)) {
                    one.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                    viewPager.setCurrentItem(1);
                } else if (tab == tabLayout.getTabAt(2)) {
                    one.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                    viewPager.setCurrentItem(2);
                } else if (tab == tabLayout.getTabAt(3)) {
                    one.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                    viewPager.setCurrentItem(3);
                }
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if (tab == tabLayout.getTabAt(0)) {
                    one.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                } else if (tab == tabLayout.getTabAt(1)) {
                    two.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                } else if (tab == tabLayout.getTabAt(2)) {
                    three.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                } else if (tab == tabLayout.getTabAt(3)) {
                    four.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
*/

}
