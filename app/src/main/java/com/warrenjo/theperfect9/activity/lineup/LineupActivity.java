package com.warrenjo.theperfect9.activity.lineup;

import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.google.android.material.tabs.TabLayout;
import com.warrenjo.theperfect9.R;
import com.warrenjo.theperfect9.activity.BaseActivity;

public class LineupActivity extends BaseActivity {

    private LineupPagerAdapter mLineupPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineup);
        setTitle("라인업");

        // 구글 애드몹 셋팅
        RelativeLayout adLayout = (RelativeLayout) findViewById(R.id.adLayout);
        setAd(adLayout);

        setViewPager();
    }

    private void setViewPager() {
        mLineupPagerAdapter = new LineupPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mLineupPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
    }
}
