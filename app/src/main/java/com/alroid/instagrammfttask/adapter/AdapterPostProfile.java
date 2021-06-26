package com.alroid.instagrammfttask.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alroid.instagrammfttask.R;
import com.alroid.instagrammfttask.entity.PostMain;
import com.alroid.instagrammfttask.entity.PostProfile;
import com.alroid.instagrammfttask.entity.Story;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class AdapterPostProfile extends RecyclerView.Adapter<AdapterPostProfile.PostViewHolder> {
    Context context;
    List<PostProfile> posts;
    AdapterPostProfile.SelectedPost selectedPostProfile;

    public AdapterPostProfile(Context context, List<PostProfile> posts) {
        this.context = context;
        this.posts = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_post_profile, parent, false);
        return new AdapterPostProfile.PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        PostProfile post = posts.get(position);

        holder.iv_post_profile.setImageDrawable(post.getImg());

        holder.iv_post_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening this post :)", 1000);
                snackBar.setAnchorView(holder.iv_post_profile)
                        .show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    // view holder class:
    public class PostViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_post_profile;

        //constructor:
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_post_profile = itemView.findViewById(R.id.iv_post_profile);
            iv_post_profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public interface SelectedPost {
        void selectedStory(PostProfile postProfile);
    }
}
