package com.example.demo.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.mvc.domain.Board;
import com.example.demo.mvc.parameter.BoardParameter;

/*
 * 게시판 서비스
 * @author 송은주
 */  

@Repository
public interface BoardRepository { // xml과 연동되어 자동으로 쿼리가 실행된다
	List<Board> getList();
	
	Board get(int boardSeq);
	
	void save(BoardParameter board);
	
	void update(BoardParameter board);
	
	void delete(int boardSeq);
}
