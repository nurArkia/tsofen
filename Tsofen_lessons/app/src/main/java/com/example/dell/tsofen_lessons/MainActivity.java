package com.example.dell.tsofen_lessons;


import android.content.Context;
import android.content.Intent;
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

public class MainActivity extends AppCompatActivity implements ItemClickListener {

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

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        if (position==6-1)
                        {
                            Intent myIntent = new Intent(MainActivity.this, fragmentActivity.class);

                            MainActivity.this.startActivity(myIntent);

                        }else if (position==8-1){
                            Intent myIntent = new Intent(MainActivity.this, AsynctaskActivite.class);

                            MainActivity.this.startActivity(myIntent);
                        }

                    }
                })
        );

    }


    private void prepareLessonsData() {
        Lesson lesson;
        for (int i=1;i<16;i++){
            lesson=new Lesson("android","lesson" +i,"21/10/2016","Or");
            lessonsList.add(lesson);
        }




    }


    @Override
    public void onClick(View view, int position) {
        Toast.makeText(view.getContext(),"asd"+position,Toast.LENGTH_SHORT).show();
    }
}
