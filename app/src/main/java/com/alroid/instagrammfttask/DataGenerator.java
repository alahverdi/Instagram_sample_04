package com.alroid.instagrammfttask;

import android.content.Context;
import android.content.res.Resources;

import androidx.core.content.ContextCompat;

import com.alroid.instagrammfttask.entity.Like;
import com.alroid.instagrammfttask.entity.PostMain;
import com.alroid.instagrammfttask.entity.PostProfile;
import com.alroid.instagrammfttask.entity.Story;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static List<Story> getStories(Context context) {
        List<Story> stories = new ArrayList<>();
        Resources resources = context.getResources();
        String[] storiesUserName = resources.getStringArray(R.array.stories_userName);

        for (int i = 0; i < storiesUserName.length; i++) {
            Story story = new Story();
            story.setId(i);
            story.setUserName(storiesUserName[i]);
            switch (i) {
                case 0:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_01));
                    break;
                case 1:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_02));
                    break;
                case 2:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_03));
                    break;
                case 3:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_04));
                    break;
                case 4:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_05));
                    break;
                case 5:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_06));
                    break;
                case 6:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_07));
                    break;
                case 7:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_08));
                    break;
                case 8:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_09));
                    break;
                case 9:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_10));
                    break;
                case 10:
                    story.setImg(ContextCompat.getDrawable(context, R.drawable.user_photo_11));
                    break;
            }
            stories.add(story);
        }
        return stories;
    }

    public static List<Story> getHighlights(Context context) {
        List<Story> highlights = new ArrayList<>();
        Resources resources = context.getResources();
        String[] highlightsUserName = resources.getStringArray(R.array.highlights_userName);

        for (int i = 0; i < highlightsUserName.length; i++) {
            Story highlight = new Story();
            highlight.setId(i);
            highlight.setUserName(highlightsUserName[i]);
            switch (i) {
                case 0:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_01));
                    break;
                case 1:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_02));
                    break;
                case 2:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_03));
                    break;
                case 3:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_04));
                    break;
                case 4:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_05));
                    break;
                case 5:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_06));
                    break;
                case 6:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_07));
                    break;
                case 7:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_08));
                    break;
                case 8:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_09));
                    break;
                case 9:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_10));
                    break;
                case 10:
                    highlight.setImg(ContextCompat.getDrawable(context, R.drawable.highlight_photo_11));
                    break;
            }
            highlights.add(highlight);
        }
        return highlights;
    }

    public static List<PostMain> getPostsMain(Context context) {
        List<PostMain> posts = new ArrayList<>();
        Resources resources = context.getResources();
        String[] postsDescription = resources.getStringArray(R.array.posts_description);
        String[] postsCommentNum = resources.getStringArray(R.array.posts_comment_num);
        String[] postsHour = resources.getStringArray(R.array.posts_hour);
        String[] postsUserNames = resources.getStringArray(R.array.stories_userName);

        for (int i = 0; i < postsHour.length; i++) {
            PostMain post = new PostMain();
            post.setId(i);
            post.setLikeNum("963");

            switch (i) {
                case 0:
                    post.setCommentNum(postsCommentNum[0]);
                    post.setDescription(postsDescription[0]);
                    post.setUserName(postsUserNames[0]);
                    post.setHour(postsHour[0]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_01));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_01));
                    break;
                case 1:
                    post.setCommentNum(postsCommentNum[1]);
                    post.setDescription(postsDescription[1]);
                    post.setUserName(postsUserNames[1]);
                    post.setHour(postsHour[1]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_02));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_02));
                    break;
                case 2:
                    post.setCommentNum(postsCommentNum[2]);
                    post.setDescription(postsDescription[2]);
                    post.setUserName(postsUserNames[2]);
                    post.setHour(postsHour[2]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_03));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_03));
                    break;
                case 3:
                    post.setCommentNum(postsCommentNum[3]);
                    post.setDescription(postsDescription[3]);
                    post.setUserName(postsUserNames[3]);
                    post.setHour(postsHour[3]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_04));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_04));
                    break;
                case 4:
                    post.setCommentNum(postsCommentNum[4]);
                    post.setDescription(postsDescription[4]);
                    post.setUserName(postsUserNames[4]);
                    post.setHour(postsHour[4]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_05));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_05));
                    break;
                case 5:
                    post.setCommentNum(postsCommentNum[5]);
                    post.setDescription(postsDescription[5]);
                    post.setUserName(postsUserNames[5]);
                    post.setHour(postsHour[5]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_06));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_06));
                    break;
                case 6:
                    post.setCommentNum(postsCommentNum[6]);
                    post.setDescription(postsDescription[6]);
                    post.setUserName(postsUserNames[6]);
                    post.setHour(postsHour[6]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_07));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_07));
                    break;
                case 7:
                    post.setCommentNum(postsCommentNum[7]);
                    post.setDescription(postsDescription[7]);
                    post.setUserName(postsUserNames[7]);
                    post.setHour(postsHour[7]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_08));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_08));
                    break;
                case 8:
                    post.setCommentNum(postsCommentNum[8]);
                    post.setDescription(postsDescription[8]);
                    post.setUserName(postsUserNames[8]);
                    post.setHour(postsHour[8]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_09));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_09));
                    break;
                case 9:
                    post.setCommentNum(postsCommentNum[9]);
                    post.setDescription(postsDescription[9]);
                    post.setUserName(postsUserNames[9]);
                    post.setHour(postsHour[9]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_10));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_10));
                    break;
                case 10:
                    post.setCommentNum(postsCommentNum[10]);
                    post.setDescription(postsDescription[10]);
                    post.setUserName(postsUserNames[10]);
                    post.setHour(postsHour[10]);
                    post.setImgUser(ContextCompat.getDrawable(context, R.drawable.user_photo_11));
                    post.setImgPost(ContextCompat.getDrawable(context, R.drawable.post_img_11));
                    break;
            }

            posts.add(post);
        }
        return posts;
    }

    public static List<PostProfile> getPostsProfile(Context context) {
        List<PostProfile> posts = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            PostProfile post = new PostProfile();
            switch (i) {
                case 0:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_01));
                    break;
                case 1:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_09));
                    break;
                case 2:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;
                case 3:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_07));
                    break;
                case 4:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_02));
                    break;
                case 5:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_05));
                    break;
                case 6:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_04));
                    break;
                case 7:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_03));
                    break;
                case 8:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_06));
                    break;
            }

            posts.add(post);
        }
        return posts;
    }

    public static List<PostProfile> getPostsExplore(Context context) {
        List<PostProfile> posts = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            PostProfile post = new PostProfile();
            switch (i) {
                case 0:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_01));
                    break;
                case 1:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_02));
                    break;
                case 2:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_03));
                    break;
                case 3:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_04));
                    break;
                case 4:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_05));
                    break;
                case 5:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_06));
                    break;
                case 6:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_07));
                    break;
                case 7:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;
                case 8:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_09));
                    break;
                case 9:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_01));
                    break;
                case 10:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_02));
                    break;
                case 11:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_03));
                    break;
                case 12:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_04));
                    break;
                case 13:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_05));
                    break;
                case 14:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_06));
                    break;
                case 15:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_07));
                    break;
                case 16:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;
                case 17:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_09));
                    break;
                case 18:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_01));
                    break;
                case 19:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_02));
                    break;
                case 20:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_03));
                    break;
                case 21:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_04));
                    break;
                case 22:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_05));
                    break;
                case 23:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_06));
                    break;
                case 24:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_07));
                    break;
                case 25:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;
                case 26:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_09));
                    break;
                case 27:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_01));
                    break;
                case 28:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_02));
                    break;
                case 29:
                    post.setImg(ContextCompat.getDrawable(context, R.drawable.explore_pic_03));
                    break;
            }

            posts.add(post);
        }
        return posts;
    }

    public static List<Like> getLikes(Context context) {
        List<Like> likes = new ArrayList<>();
        Resources resources = context.getResources();
        String[] likesFriendUserNames = resources.getStringArray(R.array.likes_friend_userNames);

        for (int i = 0; i < 11; i++) {
            Like like = new Like();
            switch (i) {
                case 0:
                    like.setId(0);
                    like.setFriend_userName(likesFriendUserNames[0]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_01));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;

                case 1:
                    like.setId(1);
                    like.setFriend_userName(likesFriendUserNames[1]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_10));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;

                case 2:
                    like.setId(2);
                    like.setFriend_userName(likesFriendUserNames[2]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_03));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;

                case 3:
                    like.setId(3);
                    like.setFriend_userName(likesFriendUserNames[3]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_04));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_09));
                    break;

                case 4:
                    like.setId(4);
                    like.setFriend_userName(likesFriendUserNames[4]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_05));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_09));
                    break;

                case 5:
                    like.setId(5);
                    like.setFriend_userName(likesFriendUserNames[5]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_06));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;

                case 6:
                    like.setId(6);
                    like.setFriend_userName(likesFriendUserNames[6]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_07));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;

                case 7:
                    like.setId(7);
                    like.setFriend_userName(likesFriendUserNames[7]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_08));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;

                case 8:
                    like.setId(8);
                    like.setFriend_userName(likesFriendUserNames[8]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_09));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_08));
                    break;

                case 9:
                    like.setId(9);
                    like.setFriend_userName(likesFriendUserNames[9]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_10));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_09));
                    break;

                case 10:
                    like.setId(10);
                    like.setFriend_userName(likesFriendUserNames[10]);
                    like.setImgFriend(ContextCompat.getDrawable(context, R.drawable.user_photo_11));
                    like.setImgPost(ContextCompat.getDrawable(context, R.drawable.explore_pic_09));
                    break;
            }

            likes.add(like);
        }
        return likes;
    }


}
