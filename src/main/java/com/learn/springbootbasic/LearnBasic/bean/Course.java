package com.learn.springbootbasic.LearnBasic.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private long id;
    //@Column(name = "course_name")
    private String course;
    private String author;

    public Course() {
    }

    public Course(long id, String course, String author) {
        this.id = id;
        this.course = course;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
