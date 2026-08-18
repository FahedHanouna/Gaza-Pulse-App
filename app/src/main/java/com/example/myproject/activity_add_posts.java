package com.example.myproject;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class activity_add_posts extends AppCompatActivity {

    private EditText etPostContent;
    private Button btnPublish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_posts);

        etPostContent = findViewById(R.id.etPostContent);
        btnPublish = findViewById(R.id.btnPublish);

        btnPublish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String postText = etPostContent.getText().toString().trim();

                if (TextUtils.isEmpty(postText)) {
                    Toast.makeText(activity_add_posts.this, "الرجاء كتابة تفاصيل المنشور أولاً", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(activity_add_posts.this, "تم حفظ المنشور بنجاح وجاري المزامنة أوفلاين", Toast.LENGTH_LONG).show();

                    etPostContent.setText("");

                    finish();
                }
            }
        });
    }
}