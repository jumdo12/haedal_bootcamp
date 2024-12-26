package com.example.headal.dto.response;

import com.example.headal.dto.UserSimpleResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostResponseDto {
    private Long id;
    private UserSimpleResponseDto user;
    private String imageData;
    private String content;
    private Long likeCount;
    private Boolean isLike;
    private String createdAt;
}