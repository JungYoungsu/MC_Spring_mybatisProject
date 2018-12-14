package com.multicampus.biz.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.multicampus.biz.util.SqlSessionFactoryBean;

public class BoardDAO {
	private SqlSession mybatis;
	
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertBoard(BoardVO vo) {
		mybatis.insert("insertBoard", vo);
	}

	public void updateBoard(BoardVO vo) {
		mybatis.update("updateBoard", vo);
	}

	public void deleteBoard(BoardVO vo) {
		mybatis.delete("deleteBoard", vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO) mybatis.selectOne("getBoard", vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("getBoardList", vo);
	}
}
