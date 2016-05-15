package com.shumin.lifecycle.ui.adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.shumin.lifecycle.R;

/**
 * Created by shumin on 5/14/16.
 */
public class RecyclerViewItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int ITEMS = 12;
    private Context context;


    public RecyclerViewItemAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_recycler_view_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
        Glide.with(context).load(R.mipmap.test).into(itemViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return ITEMS;
    }

    /*
     * It is recommended to use static for inner classes to avoid memory leaks
     * if you will take their instances out of the class.
     */
    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public ItemViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image_view);
        }

    }

}
