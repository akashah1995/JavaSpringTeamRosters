package com.codingdojo.teamroster.controllers;
import java.util.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.teamroster.models.*;

/**
 * Servlet implementation class Create
 */
@WebServlet("/Create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = request.getParameter("teamname");
		ArrayList <Team> teaminfo = new ArrayList <Team>();
		if (session.getAttribute("teaminfo") == null) {
			session.setAttribute("id",0);
			int id = (int) session.getAttribute("id");
			Team team = new Team(name, id);
			teaminfo.add(team);
			session.setAttribute("teaminfo", teaminfo);
		}
		else {
		    int id = (int) session.getAttribute("id");
		    id  = id + 1;
		    session.setAttribute("id", id);
			teaminfo = (ArrayList<Team>) session.getAttribute("teaminfo");
			Team team = new Team(name, id);
			teaminfo.add(team);
			session.setAttribute("teaminfo", teaminfo);
		}
		
		session.setAttribute("playercount", 0);
		System.out.println(session.getAttribute("teaminfo"));
		request.getRequestDispatcher("/TeamPlayers").forward(request,response);
		
		
	}

}
