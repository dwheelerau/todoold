package com.dave.mytodolistapp;

/**
 * Created by Dave on 10/4/2014.
 */
public class Comment {
    private long id;
    private String comment;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    public String toString(){
        return comment;
    }
   }
