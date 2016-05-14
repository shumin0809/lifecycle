package com.shumin.lifecycle.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.shumin.lifecycle.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AppCompatActivity", "MainActivity onCreate");
        setupUi();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AppCompatActivity", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AppCompatActivity", "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AppCompatActivity", "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AppCompatActivity", "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AppCompatActivity", "MainActivity onDestroy");
    }

    private void setupUi() {
        findViewById(R.id.launch_fragment_view_pager).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        findViewById(R.id.launch_view_view_pager).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewsViewPagerActivity.class);
                startActivity(intent);
            }
        });
    }

}
