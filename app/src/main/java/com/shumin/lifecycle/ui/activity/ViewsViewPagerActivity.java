package com.shumin.lifecycle.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.shumin.lifecycle.R;
import com.shumin.lifecycle.ui.adapter.ViewStatePagerAdapter;

/**
 * Created by shumin on 5/14/16.
 */
public class ViewsViewPagerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("AppCompatActivity", "ViewsViewPagerActivity onCreate");
        setContentView(R.layout.activity_views_view_pager);
        setupUi();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AppCompatActivity", "ViewsViewPagerActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AppCompatActivity", "ViewsViewPagerActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AppCompatActivity", "ViewsViewPagerActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AppCompatActivity", "ViewsViewPagerActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AppCompatActivity", "ViewsViewPagerActivity onDestroy");
    }

    private void setupUi() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.views_view_pager);
        if (viewPager != null) {
            viewPager.setAdapter(new ViewStatePagerAdapter(this));
        }
    }

}
