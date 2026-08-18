package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;

public class bottom extends AppCompatActivity {

    private FloatingActionButton fabAddPost;
    private ImageView ivGoToProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        fabAddPost = findViewById(R.id.fabAddPost);
        ivGoToProfile = findViewById(R.id.ivGoToProfile);

        fabAddPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bottom.this, HomeScreen2.class);
                startActivity(intent);
            }
        });

        ivGoToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bottom.this, profile_screen.class);
                startActivity(intent);
            }
        });
    }
}