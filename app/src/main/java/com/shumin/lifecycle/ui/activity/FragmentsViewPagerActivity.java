package com.shumin.lifecycle.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.shumin.lifecycle.R;
import com.shumin.lifecycle.ui.adapter.BaseFragmentStatePagerAdapter;

/**
 * Created by shumin on 5/14/16.
 */
public class FragmentsViewPagerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_view_pager);
        Log.d("AppCompatActivity", "FragmentsViewPagerActivity onCreate");
        setupUi();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AppCompatActivity", "FragmentsViewPagerActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AppCompatActivity", "FragmentsViewPagerActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AppCompatActivity", "FragmentsViewPagerActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AppCompatActivity", "FragmentsViewPagerActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AppCompatActivity", "FragmentsViewPagerActivity onDestroy");
    }

    private void setupUi() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.fragments_view_pager);
        if (viewPager != null) {
            viewPager.setAdapter(new BaseFragmentStatePagerAdapter(getSupportFragmentManager()));
        }
    }

}
