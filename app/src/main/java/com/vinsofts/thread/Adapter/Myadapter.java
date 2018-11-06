package com.vinsofts.thread.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.vinsofts.thread.Model.Song;
import com.vinsofts.thread.R;
import java.util.List;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyHolder> {
    private Context context;
    private List<Song> songList;


    public Myadapter(Context context, List<Song> songList) {
        this.context = context;
        this.songList = songList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_song, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        Song song = songList.get(i);
        myHolder.tv_score.setText(song.getScore());
        Glide.with(context).load(song.getAvatar()).into(myHolder.iv_song);
    }

    @Override
    public int getItemCount() {
        if (songList == null) {
            return 0;
        }
        return songList.size();
    }

    static class MyHolder extends RecyclerView.ViewHolder {
        TextView tv_score;
        ImageView iv_song;

        MyHolder(@NonNull View itemView) {
            super(itemView);
            iv_song = itemView.findViewById(R.id.iv_song);
            tv_score = itemView.findViewById(R.id.tv_score);
        }
    }
}
