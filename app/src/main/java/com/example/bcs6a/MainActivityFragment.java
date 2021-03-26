package com.example.bcs6a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivityFragment extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private VIewPagerAdapter vIewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tablayout);
        vIewPagerAdapter = new VIewPagerAdapter(getSupportFragmentManager());
        setViewPager();
        setTabLayout();
    }

    private void setTabLayout() {
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(Color.BLUE,Color.GREEN);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setViewPager() {
        viewPager.setAdapter(vIewPagerAdapter);

    }
}