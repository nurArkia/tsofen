package com.example.dell.tsofen_lessons;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Lesson> lessonsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private LessonAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new LessonAdapter(lessonsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        prepareLessonsData();
    }

    private void prepareLessonsData() {
        Lesson lesson;
        lesson=new Lesson("android","lesson1","21/10/2016","Orr");
        lessonsList.add(lesson);
        lesson=new Lesson("android","lesson2","23/10/2016","Orr");
        lessonsList.add(lesson);
        lesson=new Lesson("android","lesson3","25/10/2016","Orr");
        lessonsList.add(lesson);
        lesson=new Lesson("android","lesson3","25/10/2016","Orr");
        lessonsList.add(lesson);
        lesson=new Lesson("android","lesson3","25/10/2016","Orr");
        lessonsList.add(lesson);
        lesson=new Lesson("android","lesson3","25/10/2016","Orr");
        lessonsList.add(lesson);
        lesson=new Lesson("android","lesson3","25/10/2016","Orr");
        lessonsList.add(lesson);
        lesson=new Lesson("android","lesson3","25/10/2016","Orr");
        lessonsList.add(lesson);
        lesson=new Lesson("android","lesson3","25/10/2016","Orr");
        lessonsList.add(lesson);

    }
}
