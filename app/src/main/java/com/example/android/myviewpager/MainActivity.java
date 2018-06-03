package com.example.android.myviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewParent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find Viewpager
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        //Init adapter
        SimpleFragmetPagerAdapter adapter = new SimpleFragmetPagerAdapter(
                getSupportFragmentManager());

        //set adapter for viewPager
        viewPager.setAdapter(adapter);
    }
}
