package com.example.story;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StoryitemAdapter extends RecyclerView.Adapter<StoryitemAdapter.ViewHolder> {
    private Context context;
    private List<String> comments;
    private List<String> likes;

    public StoryitemAdapter(Context context, List<String> comments, List<String> likes) {
        this.context = context;
        this.comments = comments;
        this.likes = likes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_story_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.comment.setText(comments.get(position));
        holder.like.setText(likes.get(position));
    }

    @Override
    public int getItemCount() {
        return comments.size();  // 이제 댓글의 수만큼 아이템이 있다고 반환
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView comment;
        TextView like;

        ViewHolder(View itemView) {
            super(itemView);
            comment = itemView.findViewById(R.id.story_comment);
            like = itemView.findViewById(R.id.story_like);
        }
    }
}
