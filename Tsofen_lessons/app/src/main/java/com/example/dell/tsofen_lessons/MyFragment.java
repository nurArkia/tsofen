package com.example.dell.tsofen_lessons;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import fragments.AddFragment;
import fragments.ReplceFragment;

/**
 * Created by DELL on 1/2/2017.
 */

public class MyFragment extends Fragment {
    Button addFragmentBtn;
    Button removeFragmentBtn;
    Button repalceFragmentBtn;
    FragmentActivity fragmentActivity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.myfragment_layout, container, false);

              fragmentActivity=getActivity();

            addFragmentBtn=(Button)v.findViewById(R.id.add_btn);

            addFragmentBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AddFragment fragment=new AddFragment();
                    fragmentActivity.getSupportFragmentManager().beginTransaction()
                          .add(R.id.fragment_container, fragment).commit();
                }
            });

        removeFragmentBtn=(Button)v.findViewById(R.id.remove_btn);

        removeFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = fragmentActivity.getSupportFragmentManager().findFragmentById(R.id.fragment_container);
                if(fragment != null)
                    fragmentActivity.getSupportFragmentManager().beginTransaction().remove(fragment).commit();
            }
        });

        repalceFragmentBtn=(Button)v.findViewById(R.id.replce_btn);

        repalceFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReplceFragment fragment=new ReplceFragment();
                fragmentActivity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment).commit();
            }
        });



        return v;
    }


}
