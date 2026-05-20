package com.back.domain.post.postComment.entity;

import com.back.domain.post.post.entity.Post;
import com.back.global.jpa.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor
public class PostComment extends BaseEntity {
    @ManyToOne(fetch = LAZY)
    @JsonIgnore
    private Post post;
    private String body;

    public PostComment(Post post, String body) {
        this.post = post;
        this.body = body;
    }

    public void modify(String body) {
        this.body = body;
    }
}