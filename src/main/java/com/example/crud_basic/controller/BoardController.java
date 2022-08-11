package com.example.crud_basic.controller;

import com.example.crud_basic.dto.BoardResponseDto;
import com.example.crud_basic.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board/{boardId}")
    public BoardResponseDto getBoard(@PathVariable Long boardId) {
        return boardService.getBoard(boardId);
    }

    /*
    서버 올리시고 아래 url 에서 DB 값들도 한 번 확인해보세요~!
     http://localhost:8080/h2-console
     */
}
