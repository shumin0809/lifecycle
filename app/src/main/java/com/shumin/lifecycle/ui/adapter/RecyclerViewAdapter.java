package com.shumin.lifecycle.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shumin.lifecycle.R;
import com.shumin.lifecycle.ui.component.HorizontalRecyclerView;

/**
 * Created by shumin on 5/14/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int ROWS = 12;

    private Context context;

    public RecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_recycler_view_row, parent, false);
        return new RowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RowViewHolder rowViewHolder = (RowViewHolder) holder;
        rowViewHolder.recyclerView.init(position);
    }

    @Override
    public int getItemCount() {
        return ROWS;
    }

    public static class RowViewHolder extends RecyclerView.ViewHolder {
        public HorizontalRecyclerView recyclerView;
        public RowViewHolder(View itemView) {
            super(itemView);
            recyclerView = (HorizontalRecyclerView) itemView.findViewById(R.id.horizontal_recycler_view_container);
        }

    }

}
