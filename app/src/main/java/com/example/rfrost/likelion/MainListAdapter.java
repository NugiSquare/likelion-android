package com.example.rfrost.likelion;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rfrost on 2015. 9. 13..
 */
public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder> {

    private Context context;
    private List<Integer> images;
    private List<String> names;

    public MainListAdapter(Context context, List<Integer> images, List<String> names) {
        this.context = context;
        this.images = images;
        this.names = names;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public Button button;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.image_view);
            textView = (TextView) itemView.findViewById(R.id.text_view);
            button = (Button) itemView.findViewById(R.id.button);
        }
    }

    @Override
    public MainListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainListAdapter.ViewHolder holder, int position) {
        Log.d("MainListAdapter", "position : " + position);

        holder.imageView.setImageDrawable(context .getResources().getDrawable(images.get(position)));
        holder.textView.setText(names.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }
}
