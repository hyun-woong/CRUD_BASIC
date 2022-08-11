package com.example.crud_basic.service;

import com.example.crud_basic.dto.BoardResponseDto;
import com.example.crud_basic.model.Board;
import com.example.crud_basic.model.User;
import com.example.crud_basic.repository.BoardRepository;
import com.example.crud_basic.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final UserRepository userRepository;

    //더미 데이터를 넣어주는 부분이라 무시하셔도 됩니다.
    @PostConstruct
    @Transactional
    public void data() {
        for (int i = 0; i < 5; i++) {
            String title = "title" + i;
            String password = "1q2w3";
            String content = "content123" + i;

            String username = "kimWoong" + i;
            int age = 22;
            String gender = "M";
            User user = new User(age, gender, username);
            Board board = new Board(title, password, content, user);
            userRepository.save(user);
            boardRepository.save(board);
        }
    }

    //게시글과 연관관계가 맺어진 User 클래스에서 유저이름만 가져오기
    public BoardResponseDto getBoard(Long boardId) {
        Board board = boardRepository.findById(boardId).orElseThrow(
                () -> new NullPointerException("게시글이 없습니다.")
        );
        BoardResponseDto responseDto = new BoardResponseDto(board);

        return responseDto;
    }
}
