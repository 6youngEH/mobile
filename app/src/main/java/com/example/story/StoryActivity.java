package com.example.story;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class StoryActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StoryitemAdapter storyItemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_story);

        Toolbar toolbar = findViewById(R.id.story_toolbar);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recycle); // 레이아웃 파일에서 RecyclerView의 ID 확인 필요
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // LinearLayoutManager를 사용, 다른 레이아웃 매니저도 선택 가능
        List<String> comments = Arrays.asList("Great story!", "Wow!", "Thanks for sharing!");
        List<String> likes = Arrays.asList("100 likes", "200 likes", "150 likes");
        // 어댑터 설정
        storyItemAdapter = new StoryitemAdapter(this, comments, likes);
        recyclerView.setAdapter(storyItemAdapter);
        // BottomNavigationView 초기화 및 클릭 리스너 설정
    }
}
