package com.shumin.lifecycle.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.shumin.lifecycle.R;
import com.shumin.lifecycle.ui.adapter.ViewsStatePagerAdapter;

/**
 * Created by shumin on 5/14/16.
 */
public class ViewsViewPagerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views_view_pager);
        setupUi();
    }


    private void setupUi() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.views_view_pager);
        if (viewPager != null) {
            viewPager.setAdapter(new ViewsStatePagerAdapter(this));
        }
    }

}
