package com.shumin.lifecycle.ui.component;

import com.shumin.lifecycle.R;

/**
 * Created by shumin on 5/14/16.
 */
public enum  CustomViewPagerEnum {

    FIRST(R.layout.view_life_cycle),
    SECOND(R.layout.view_second),
    THIRD(R.layout.view_third);

    private int mLayoutResId;

    CustomViewPagerEnum(int mLayoutResId) {
        this.mLayoutResId = mLayoutResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
