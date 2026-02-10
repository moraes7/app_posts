package dev.nicolasmoraes.postsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import dev.nicolasmoraes.postsapp.databinding.PostsItemBinding;
import dev.nicolasmoraes.postsapp.model.Posts;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder> {

    private final ArrayList<Posts> postsList;
    private final Context context;

    public PostsAdapter(ArrayList<Posts> postsList, Context context) {
        this.postsList = postsList;
        this.context = context;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PostsItemBinding postsItem;
        postsItem = PostsItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new PostsViewHolder(postsItem);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder holder, int position) {
        holder.binding.txtTitle.setText(postsList.get(position).getTitle());
        holder.binding.txtBody.setText(postsList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public static class PostsViewHolder extends RecyclerView.ViewHolder {

        PostsItemBinding binding;

        public PostsViewHolder(PostsItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
