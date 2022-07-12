package kr.bit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.model.MemberDAO;
import kr.bit.model.MemberVO;

public class MemberListController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// POJO(아르바이트생)가 해야할 일의 범위
		// 1. Model과 연동
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.memberList();
		// 2. 객체 바인딩
		request.setAttribute("list", list);
		// member/memberList.jsp
		// 3. 다음페이지로 넘어가는 정보를 return(String)
		return "memberList";
	}

}
