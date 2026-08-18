package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen2 extends AppCompatActivity {

    private FloatingActionButton fabGoToAddPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen2);

        fabGoToAddPost = findViewById(R.id.fabGoToAddPost);

        fabGoToAddPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen2.this, activity_add_posts.class);
                startActivity(intent);
            }
        });
    }
}