package com.codingdojo.teamroster.controllers;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.teamroster.models.*;

/**
 * Servlet implementation class Roster
 */
@WebServlet("/Roster")
public class Roster extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Roster() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setAttribute("teaminfo", null);
		request.setAttribute("numberofteams", null);
//		if (session.getAttribute("teaminfo") != null) {
//			ArrayList <Team> teaminfo = (ArrayList<Team>) session.getAttribute("teaminfo");
//			request.setAttribute("teaminfo",teaminfo);
//			int size = teaminfo.size();
//			request.setAttribute("numteams", size);
//		}
		request.getRequestDispatcher("/WEB-INF/views/roster.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
