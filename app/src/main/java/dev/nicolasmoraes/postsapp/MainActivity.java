package dev.nicolasmoraes.postsapp;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import dev.nicolasmoraes.postsapp.adapter.PostsAdapter;
import dev.nicolasmoraes.postsapp.databinding.ActivityMainBinding;
import dev.nicolasmoraes.postsapp.model.Posts;
import dev.nicolasmoraes.postsapp.service.Api;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PostsAdapter postsAdapter;
    private final ArrayList<Posts> postsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build();

        Api api = retrofit.create(Api.class);

        api.getPosts().enqueue(new Callback<ArrayList<Posts>>() {
            @Override
            public void onResponse(Call<ArrayList<Posts>> call, Response<ArrayList<Posts>> response) {
                if(response.isSuccessful()) {
                    ArrayList<Posts> posts = response.body();

                    if(posts != null) {
                        for(Posts post: posts) {
                            String title = post.getTitle();
                            String body = post.getBody();
                            postsList.add(new Posts(title, body));
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "Erro ao buscar os dados", Toast.LENGTH_SHORT).show();
                    }

                    RecyclerView recyclerViewPosts = binding.recyclerViewPosts;
                    recyclerViewPosts.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    recyclerViewPosts.setHasFixedSize(true);
                    postsAdapter = new PostsAdapter(postsList, MainActivity.this);
                    recyclerViewPosts.setAdapter(postsAdapter);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Posts>> call, Throwable throwable) {
                Toast.makeText(MainActivity.this, "Erro fatal de servidor", Toast.LENGTH_SHORT).show();

            }
        });



    }

}