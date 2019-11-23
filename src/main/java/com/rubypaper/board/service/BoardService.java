package com.rubypaper.board.service;

import com.rubypaper.board.domain.Board;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BoardService {

    void insertBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(Board board);

    Board getBoard(Board board);

    Page<Board> getBoardList(Board board);

    List<Board> getBoardList_json(Board board);

}
