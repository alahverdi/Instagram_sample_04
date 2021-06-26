package com.alroid.instagrammfttask.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alroid.instagrammfttask.R;
import com.alroid.instagrammfttask.entity.Story;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class AdapterStory extends RecyclerView.Adapter<AdapterStory.StoriesViewHolder> {
    Context context;
    List<Story> stories = new ArrayList<>();
    AdapterStory.SelectedStory selectedStory;

    public AdapterStory(Context context, List<Story> stories, SelectedStory selectedStory) {
        this.context = context;
        this.stories = stories;
        this.selectedStory = selectedStory;
    }

    @NonNull
    @Override
    public StoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_story, parent, false);
        return new StoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesViewHolder holder, int position) {
        Story story = stories.get(position);
        holder.iv_story.setImageDrawable(story.getImg());
        holder.tv_userName.setText(story.getUserName());

        holder.iv_story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening story :)", 1000);
                snackBar.setAnchorView(holder.tv_userName);
                snackBar.show();
            }
        });

        holder.tv_userName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening story :)", 1000);
                snackBar.setAnchorView(holder.tv_userName);
                snackBar.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    // view holder class:
    public class StoriesViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_story;
        TextView tv_userName;

        //constructor:
        public StoriesViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_story = itemView.findViewById(R.id.iv_story);
            tv_userName = itemView.findViewById(R.id.tv_userName_toolbar);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedStory.selectedStory(stories.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface SelectedStory {
        void selectedStory(Story story);
    }
}
