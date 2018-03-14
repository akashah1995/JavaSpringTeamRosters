package com.codingdojo.teamroster.controllers;
import java.util.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.teamroster.models.Team;

/**
 * Servlet implementation class TeamPlayers
 */
@WebServlet("/TeamPlayers")
public class TeamPlayers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamPlayers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Team> teaminfo = (ArrayList<Team>) session.getAttribute("teaminfo");
		int length = teaminfo.size();
		for (int i = 0; i < length; i++) {
			if (teaminfo.get(i).id == (int) session.getAttribute("id")){
				Team team = teaminfo.get(i);
				request.setAttribute("team", team);
				int teamlength = team.players.size();
				request.setAttribute("teamlength",teamlength);
				System.out.println("Accessing the specific team");
			}	
		}
	
		request.getRequestDispatcher("/WEB-INF/views/teamplayers.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
