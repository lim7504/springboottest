package com.rubypaper.board.persistence;

import com.rubypaper.board.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoardRepository extends CrudRepository<Board, Long> {
    @Query("SELECT b FROM Board b")
    Page<Board> getBoardList(Pageable pageable);

    public static final String BoardList_json = "SELECT B.SEQ, B.TITLE, B.CONTENT, B.CREATE_DATE FROM BOARD B";
    @Query(value = BoardList_json, nativeQuery = true)
    List<Board> getBoardList_json();

//    @Query("SELECT b FROM Board b")
//    List<Board> getBoardList_json();
}
