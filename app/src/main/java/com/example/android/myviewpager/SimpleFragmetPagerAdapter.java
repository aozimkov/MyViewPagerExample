package com.example.android.myviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by def on 03.06.18.
 *
 * This class contain the logic of our fragment pager
 * Do not forget make a chenges in getCount() when add new position in Adapter Constructor
 */

public class SimpleFragmetPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmetPagerAdapter(FragmentManager fm){ super(fm); }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new PageOneFragment();
        } else {
            return new PAgeTwoFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
