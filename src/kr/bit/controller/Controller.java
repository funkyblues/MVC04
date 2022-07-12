package kr.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	// 모든 POJO가 가지고 있어야 되는 메서드
	// return type을 String으로 바꿔주어야 한다.
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException;
}
