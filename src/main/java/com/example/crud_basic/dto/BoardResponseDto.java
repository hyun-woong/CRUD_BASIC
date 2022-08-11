package com.example.crud_basic.dto;

import com.example.crud_basic.model.Board;
import com.example.crud_basic.model.User;
import lombok.Getter;

@Getter
public class BoardResponseDto {
    private String title;
    private String content;
    private String username;


    public BoardResponseDto(Board board) {
        this.title = board.getTitle();
        this.content = board.getContent();
        this.username = board.getUser().getUsername();
    }

}
