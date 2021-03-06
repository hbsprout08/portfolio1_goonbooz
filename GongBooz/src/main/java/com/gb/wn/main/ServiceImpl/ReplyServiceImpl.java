package com.gb.wn.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gb.wn.main.DAO.ReplyDAO;
import com.gb.wn.main.Service.ReplayService;
import com.gb.wn.main.board.boardVO.ReplyVO;

@Service("replyService")
public class ReplyServiceImpl implements ReplayService {

	@Autowired
	private ReplyDAO rdao;
		
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception {
		return rdao.readReply(bno);
	}

	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		rdao.writeReply(vo);
		rdao.replyCnt(vo);
	}

	@Override
	public void updateReply(ReplyVO vo) throws Exception {
		rdao.updateReply(vo);		
	}

	@Override
	public void deleteReply(ReplyVO vo) throws Exception {
		rdao.deleteReply(vo);	
		rdao.replyCnt(vo);
		
	}

	@Override
	public ReplyVO selectReply(int rno) throws Exception {
		return rdao.selectReply(rno);
	}

}
