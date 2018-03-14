package com.codingdojo.teamroster.controllers;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.teamroster.models.Team;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int playerid  = Integer.parseInt(request.getParameter("playerid"));
		ArrayList<Team> teaminfo = (ArrayList<Team>) session.getAttribute("teaminfo");
		int length = teaminfo.size();
		System.out.println(length);
		int teamlength = 0;
		Team team = null;
		for (int i = 0; i < length; i++) {
			if (teaminfo.get(i).id == (int) session.getAttribute("id")){
				team = teaminfo.get(i);
				teamlength = team.players.size();
				System.out.println("Got the team");
			}
		}
		
		for (int i = 0; i< teamlength; i++) {
			System.out.println("Went inside the second loop");
			if (playerid == team.getPlayer(i).getId()) {
				team.players.remove(i);
			}
		}
		
		request.getRequestDispatcher("/TeamPlayers").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
