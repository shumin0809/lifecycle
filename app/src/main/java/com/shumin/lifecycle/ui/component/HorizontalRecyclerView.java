package com.shumin.lifecycle.ui.component;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shumin.lifecycle.R;
import com.shumin.lifecycle.ui.adapter.RecyclerViewItemAdapter;

/**
 * Created by shumin on 5/14/16.
 */
public class HorizontalRecyclerView extends LinearLayout {

    public HorizontalRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void init(int position) {
        ((TextView) findViewById(R.id.title_description)).setText(position + " row ");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.horizontal_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new RecyclerViewItemAdapter(getContext()));
    }

}
