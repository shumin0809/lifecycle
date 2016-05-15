package com.shumin.lifecycle.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;

import com.shumin.lifecycle.ui.fragment.LifeCycleFragment;
import com.shumin.lifecycle.ui.fragment.SecondFragment;
import com.shumin.lifecycle.ui.fragment.ThirdFragment;

/**
 * Created by shumin on 5/14/16.
 */
public class FragmentsStatePagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter {

    private final static int PAGES = 3;

    public FragmentsStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LifeCycleFragment();
            case 1:
                return new SecondFragment();
            default:
                return new ThirdFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGES;
    }
}
