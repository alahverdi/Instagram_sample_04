package com.alroid.instagrammfttask.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.alroid.instagrammfttask.R;
import com.alroid.instagrammfttask.entity.PostMain;
import com.alroid.instagrammfttask.fragment.ActionBottomDialogFragment;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class AdapterPostMain extends RecyclerView.Adapter<AdapterPostMain.PostViewHolder> {
    Context context;
    List<PostMain> posts;
    SelectedPost selectedPost;

    public AdapterPostMain(Context context, List<PostMain> posts, SelectedPost selectedPost) {
        this.context = context;
        this.posts = posts;
        this.selectedPost = selectedPost;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_post_main, parent, false);
        return new AdapterPostMain.PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        PostMain post = posts.get(position);

        holder.iv_user.setImageDrawable(post.getImgUser());
        holder.iv_post.setImageDrawable(post.getImgPost());
        holder.tv_userName.setText(post.getUserName());
        holder.tv_like_num.setText(post.getLikeNum());
        holder.tv_userName_description.setText(post.getUserName());
        holder.tv_description.setText(post.getDescription());
        holder.tv_comment_num.setText(post.getCommentNum());
        holder.tv_hour.setText(post.getHour());

        holder.img_btn_more_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomSheet(v);
            }
        });

        holder.tv_userName_description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening this profile :)", 1000);
                snackBar.setAnchorView(holder.tv_hour);
                snackBar.show();
            }
        });

        holder.tv_userName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening this profile :)", 1000);
                snackBar.setAnchorView(holder.iv_user);
                snackBar.show();
            }
        });

        holder.iv_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening this profile :)", 1000);
                snackBar.setAnchorView(holder.iv_user);
                snackBar.show();
            }
        });

        holder.tv_description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening full description :)", 1000);
                snackBar.setAnchorView(holder.tv_hour);
                snackBar.show();
            }
        });

        holder.img_btn_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isSelected()) {
                    holder.img_btn_like.setImageResource(R.drawable.ic_like_heart_border);
                    holder.tv_like_num.setText("963");
                    v.setSelected(false);
                } else {
                    holder.img_btn_like.setImageResource(R.drawable.ic_like_heart_red);
                    holder.tv_like_num.setText("964");
                    v.setSelected(true);
                    Snackbar snackBar = Snackbar.make(v, "Liked", 500);
                    snackBar.setAnchorView(holder.img_btn_like);
                    snackBar.show();
                }
            }
        });

        holder.img_btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isSelected()) {
                    holder.img_btn_save.setImageResource(R.drawable.ic_saved_border);
                    v.setSelected(false);
                } else {
                    holder.img_btn_save.setImageResource(R.drawable.ic_saved_filled);
                    v.setSelected(true);
                    Snackbar snackBar = Snackbar.make(v, "Saved", 1000);
                    snackBar.setAnchorView(holder.img_btn_like);
                    snackBar.show();
                }
            }
        });

        holder.img_btn_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar.make(v, "Opening Comments :)", 1000);
                snackBar.setAnchorView(holder.img_btn_like);
                snackBar.show();
            }
        });

        holder.img_btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Url = "https://www.instagram.com/guitarpick.app/";
                Intent intentShare = new Intent(Intent.ACTION_SEND);
                intentShare.setType("text/plain");
                intentShare.putExtra(Intent.EXTRA_TEXT, "instagram UI design by Alroid\n\n" + Url);
                context.startActivity(Intent.createChooser(intentShare, "Share via : "));
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    // view holder class:
    public class PostViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_user,
                iv_post;
        ImageButton img_btn_more_icon,
                img_btn_like,
                img_btn_comment,
                img_btn_send,
                img_btn_save;
        TextView tv_userName,
                tv_like_num,
                tv_userName_description,
                tv_description,
                tv_comment_num,
                tv_hour;

        //constructor:
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_user = itemView.findViewById(R.id.iv_user);
            iv_post = itemView.findViewById(R.id.iv_post);
            img_btn_more_icon = itemView.findViewById(R.id.img_btn_more_icon);
            img_btn_like = itemView.findViewById(R.id.img_btn_like);
            img_btn_comment = itemView.findViewById(R.id.img_btn_comment);
            img_btn_send = itemView.findViewById(R.id.img_btn_send);
            img_btn_save = itemView.findViewById(R.id.img_btn_save);
            tv_userName = itemView.findViewById(R.id.tv_userName_toolbar);
            tv_like_num = itemView.findViewById(R.id.tv_like_num);
            tv_userName_description = itemView.findViewById(R.id.tv_userName_description);
            tv_description = itemView.findViewById(R.id.tv_description);
            tv_comment_num = itemView.findViewById(R.id.tv_comment_num);
            tv_hour = itemView.findViewById(R.id.tv_hour);
        }
    }

    public interface SelectedPost {
        void selectedPost(PostMain post);
    }

    // Bottom Sheet (more option in items):
    public void showBottomSheet(View view) {
        ActionBottomDialogFragment addPhotoBottomDialogFragment =
                ActionBottomDialogFragment.newInstance();
        addPhotoBottomDialogFragment.show(((AppCompatActivity) context).getSupportFragmentManager(),
                ActionBottomDialogFragment.TAG);
    }
}
