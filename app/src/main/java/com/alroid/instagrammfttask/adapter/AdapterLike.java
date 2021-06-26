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
import com.alroid.instagrammfttask.entity.Like;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class AdapterLike extends RecyclerView.Adapter<AdapterLike.LikesViewHolder> {
    Context context;
    List<Like> likeActivities;
    AdapterLike.SelectedLike selectedLike;

    public AdapterLike(Context context, List<Like> likeActivities, SelectedLike selectedLike) {
        this.context = context;
        this.likeActivities = likeActivities;
        this.selectedLike = selectedLike;
    }

    @NonNull
    @Override
    public LikesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_like, parent, false);
        return new LikesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LikesViewHolder holder, int position) {
        Like like = likeActivities.get(position);

        holder.iv_friend.setImageDrawable(like.getImgFriend());
        holder.iv_post.setImageDrawable(like.getImgPost());
        holder.tv_like_username.setText(like.getFriend_userName());

        holder.iv_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening this profile :)", 1000);
                snackBar.setAnchorView(holder.iv_friend)
                        .show();
            }
        });

        holder.tv_like_username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening this post :)", 1000);
                snackBar.setAnchorView(holder.iv_friend)
                        .show();
            }
        });

        holder.tv_like_description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening this post :)", 1000);
                snackBar.setAnchorView(holder.iv_friend)
                        .show();
            }
        });

        holder.iv_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening this profile :)", 1000);
                snackBar.setAnchorView(holder.iv_friend)
                        .show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return likeActivities.size();
    }

    public class LikesViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_friend, iv_post;
        TextView tv_like_username, tv_like_description;

        // constructor:
        public LikesViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_friend = itemView.findViewById(R.id.iv_friend);
            iv_post = itemView.findViewById(R.id.iv_post);
            tv_like_username = itemView.findViewById(R.id.tv_like_userName);
            tv_like_description = itemView.findViewById(R.id.tv_like_description);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedLike.selectedLike(likeActivities.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface SelectedLike {
        void selectedLike(Like likeActivity);
    }
}
