package com.facebook.clone.weeksixtask.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Post {
    private int postCommentId;
    private String content;
    private String contentType;
    private  int parent_id;
    private int likes;
    private String likedBY;
    private  String date_created;
}
