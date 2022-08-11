package com.example.crud_basic.repository;

import com.example.crud_basic.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}