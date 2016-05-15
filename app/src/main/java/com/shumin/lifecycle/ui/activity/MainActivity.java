package com.shumin.lifecycle.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.shumin.lifecycle.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUi();
    }


    private void setupUi() {
        View launchFragment = findViewById(R.id.launch_fragment_view_pager);
        if (launchFragment != null) {
            launchFragment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, FragmentsViewPagerActivity.class);
                    startActivity(intent);
                }
            });
        }

        View launchView = findViewById(R.id.launch_view_view_pager);
        if (launchView != null) {
            launchView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ViewsViewPagerActivity.class);
                    startActivity(intent);
                }
            });
        }

        View launchRecyclerView = findViewById(R.id.launch_recycler_view);
        if (launchRecyclerView != null) {
            launchRecyclerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

}
