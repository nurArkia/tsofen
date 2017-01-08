package com.example.dell.tsofen_lessons;

/**
 * Created by DELL on 1/6/2017.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by DELL on 1/6/2017.
 */

public class AsynctastFragment extends Fragment {
    Button addImageWithAsyncBtn;
    Button addImgeWithPicassoBtn;
    Context context;
    ImageView asyncImageV;
    ImageView picassoImageV;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.asynctask_layout, container, false);


        addImageWithAsyncBtn=(Button)v.findViewById(R.id.add_async_image);
        addImgeWithPicassoBtn=(Button)v.findViewById(R.id.add_picasso_image);
        asyncImageV=(ImageView)v.findViewById(R.id.image_with_async);

        addImageWithAsyncBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getActivity().getApplicationContext(),"async",Toast.LENGTH_SHORT).show();
                DownloadWebImageAsynctask asynctask=new DownloadWebImageAsynctask(asyncImageV);
                asynctask.execute(new String[] { "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQo3qLM_Lg_UUGKifuI0nuDkLC2An_t2SQAuSlYYcjOwyt4NBkBzA" });
            }
        });

        picassoImageV=(ImageView)v.findViewById(R.id.image_with_picasso);
        addImgeWithPicassoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(getActivity().getApplicationContext(),"picasso",Toast.LENGTH_SHORT).show();
                Picasso.with(getActivity().getApplicationContext()).load("https://www.google.com/intl/en_us/mobile/android/images/android.jpg").into(picassoImageV);
            }
        });

        return v;
    }
}


