package com.rubypaper.board.controller;

import com.rubypaper.board.domain.Board;
import com.rubypaper.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping(value ="/board")
public class TestController {
    @Autowired
    private BoardService boardService;

    @GetMapping(value = "/getBoardList_json")
    public List<Board> getBoardList_json(Board board) {
        return boardService.getBoardList_json(board);
    }

    @GetMapping("/getBoard/{seq}/{content}")//http://localhost:8080/board/getBoard/1/sdf
    public Board getBoard(@PathVariable Long seq, @PathVariable String content) {
        Board b = new Board();
        b.setSeq(seq);
        b.setContent(content);
        return b;
    }

    @GetMapping("/getName")//http://localhost:8080/board/getName?name=sdfsdf&a=sdf
    public String getName(@RequestParam String name, @RequestParam String a) {

        return name + "----" + a;
    }

    @GetMapping("/sample")
    public String hello(@RequestBody Board board) {
        return "hello";
    }

}