package com.example.dell.tsofen_lessons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AsynctaskActivite extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asynctask_activite);

        setFragment();

    }

    private void setFragment(){

        // Create a new Fragment to be placed in the activity layout
        AsynctastFragment fragment= new AsynctastFragment();

        // Add the fragment to the 'fragment_container' FrameLayout
        getSupportFragmentManager().beginTransaction()
                .add(R.id.async_image_container, fragment).commit();
    }

}
