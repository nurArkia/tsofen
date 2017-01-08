package com.example.dell.tsofen_lessons;

/**
 * Created by DELL on 12/20/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.MyViewHolder> {

    private List<Lesson> LessonsList;
    private  ItemClickListener itemClickListener;

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView subject, title, date,teacher;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            subject = (TextView) view.findViewById(R.id.subject);
            date = (TextView) view.findViewById(R.id.date);
            teacher = (TextView) view.findViewById(R.id.teacher);

        }

        @Override
        public void onClick(View view) {
            if ( itemClickListener!=null){
                itemClickListener.onClick(view,getAdapterPosition());
            }
        }
    }


    public LessonAdapter(List<Lesson> LessonsList) {
        this.LessonsList = LessonsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lesson_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Lesson movie = LessonsList.get(position);
        holder.title.setText(movie.getTitle());
        holder.subject.setText(movie.getSubject());
        holder.date.setText(movie.getDate());
        holder.teacher.setText(movie.getTeacher());

    }

    @Override
    public int getItemCount() {
        return LessonsList.size();
    }
    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }
}