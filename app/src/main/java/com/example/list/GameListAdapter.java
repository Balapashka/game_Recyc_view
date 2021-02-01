package com.example.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class GameListAdapter extends RecyclerView.Adapter<GameListAdapter.ViewHolder> {

    private List<Game> gameList;
    private Context context;

    public GameListAdapter(List<Game> gameList, Context context) {
        this.gameList = gameList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView photo;
        public TextView title, desc, genre;

        public ViewHolder(View view) {
            super(view);

            photo =view.findViewById(R.id.photo);
            title =view.findViewById(R.id.title);
            desc =view.findViewById(R.id.desc);
            genre =view.findViewById(R.id.genre);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_main, viewGroup, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int position) {
        Game item = gameList.get(position);

        Glide.with(context.getApplicationContext())
                .load(item.getPhoto())
                .into(viewHolder.photo);

        viewHolder.title.setText(item.getTitle());
        viewHolder.desc.setText(item.getDesc());
        viewHolder.genre.setText(item.getGenre());
    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }
}