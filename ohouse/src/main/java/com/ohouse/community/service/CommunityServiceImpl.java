package com.ohouse.community.service;

import static com.ohouse.common.template.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.ohouse.common.model.vo.Media;
import com.ohouse.community.model.dao.CommunityDao;
import com.ohouse.community.model.vo.Board;

public class CommunityServiceImpl implements CommunityService{
	
	private CommunityDao communityDao = new CommunityDao();
	
	@Override
	public ArrayList<Board> selectBoardList() {
		SqlSession sqlSession = getSqlSession();
		ArrayList<Board> list = communityDao.selectBoardList(sqlSession);
		sqlSession.close();
		return list;
	}

	@Override
	public Media selectProfile(int membersNo) {
		SqlSession sqlSession = getSqlSession();
		Media m = communityDao.selectProfile(sqlSession, membersNo);
		sqlSession.close();
		return m;
	}
}