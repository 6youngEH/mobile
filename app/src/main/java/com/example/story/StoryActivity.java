package com.example.story;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_story);

        Toolbar toolbar = findViewById(R.id.story_toolbar);
        setSupportActionBar(toolbar);
    }
}
