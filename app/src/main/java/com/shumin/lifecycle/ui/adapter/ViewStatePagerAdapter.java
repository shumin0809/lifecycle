package com.shumin.lifecycle.ui.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shumin.lifecycle.ui.component.CustomViewPagerEnum;
import com.shumin.lifecycle.ui.component.LifeCycleView;
import com.shumin.lifecycle.ui.component.SecondView;
import com.shumin.lifecycle.ui.component.ThirdView;

/**
 * Created by shumin on 5/14/16.
 */
public class ViewStatePagerAdapter extends PagerAdapter {

    private Context mContext;

    public ViewStatePagerAdapter(Context context) {

        this.mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        CustomViewPagerEnum customViewPagerEnum = CustomViewPagerEnum.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout;
        switch (customViewPagerEnum) {
            case FIRST:
                layout = (LifeCycleView) inflater.inflate(customViewPagerEnum.getLayoutResId(), container, false);
                break;
            case SECOND:
                layout = (SecondView) inflater.inflate(customViewPagerEnum.getLayoutResId(), container, false);
                break;
            default:
                layout = (ThirdView) inflater.inflate(customViewPagerEnum.getLayoutResId(), container, false);
        }
        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public int getCount() {
        return CustomViewPagerEnum.values().length;
    }

}
