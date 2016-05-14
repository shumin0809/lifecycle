package com.shumin.lifecycle.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by shumin on 5/14/16.
 */
public class BaseFragmentStatePagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter {

    private final static int PAGES = 4;

    public BaseFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return PAGES;
    }
}
