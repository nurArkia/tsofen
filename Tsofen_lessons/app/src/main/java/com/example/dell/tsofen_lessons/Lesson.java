package com.example.dell.tsofen_lessons;

/**
 * Created by DELL on 12/20/2016.
 */

public class Lesson {

    private String subject;
    private String title;
    private String date;
    private String teacher;

    public Lesson() {
    }

    public Lesson(String subject, String title, String date, String teacher) {
        this.subject = subject;
        this.title = title;
        this.date = date;
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
