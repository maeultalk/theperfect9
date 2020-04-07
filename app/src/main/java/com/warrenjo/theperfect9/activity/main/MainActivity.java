package com.warrenjo.theperfect9.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.warrenjo.theperfect9.R;
import com.warrenjo.theperfect9.activity.BaseActivity;
import com.warrenjo.theperfect9.activity.lineup.LineupActivity;
import com.warrenjo.theperfect9.activity.lineup.LineupPagerAdapter;

public class MainActivity extends BaseActivity {

    Button button_lineup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // 구글 애드몹 셋팅
        setAd();

        setLayout();
        setOnClickListener();
    }

    private void setLayout() {
        button_lineup = (Button) findViewById(R.id.button_lineup);
    }

    private void setOnClickListener() {
        button_lineup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LineupActivity.class);
                startActivity(intent);
            }
        });
    }
}
