package com.example.dell.tsofen_lessons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class fragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        setFragment();

    }

    private void setFragment(){

        // Create a new Fragment to be placed in the activity layout
        MyFragment fragment= new MyFragment();

        // Add the fragment to the 'fragment_container' FrameLayout
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment).commit();
    }


}
