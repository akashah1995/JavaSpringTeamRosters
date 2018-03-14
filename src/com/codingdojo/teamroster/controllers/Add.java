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
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
//		String firstname = request.getParameter("firstname");
//		String lastname = request.getParameter("lastname");
//		int age = Integer.parseInt(request.getParameter("age"));
//		int playerid = (int) session.getAttribute("playercount");
//		Player player = new Player(firstname, lastname, age, playerid);
//		playerid = playerid + 1;
//		session.setAttribute("playercount", playerid);
//		ArrayList <Team> teaminfo = (ArrayList<Team>) session.getAttribute("teaminfo");
//		int length = teaminfo.size();
//		for (int i = 0; i < length; i++) {
//			if (teaminfo.get(i).id == (int) session.getAttribute("id")){
//				Team currteam = teaminfo.get(i);
//				currteam.addPlayer(player);
//				System.out.println("Added a player");
//			}	
//		}
//		
//		request.getRequestDispatcher("/TeamPlayers").forward(request,response);
//		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		int age = Integer.parseInt(request.getParameter("age"));
		int playerid = (int) session.getAttribute("playercount");
		Player player = new Player(firstname, lastname, age, playerid);
		playerid = playerid + 1;
		session.setAttribute("playercount", playerid);
		@SuppressWarnings("unchecked")
		ArrayList <Team> teaminfo = (ArrayList<Team>) session.getAttribute("teaminfo");
		System.out.println(teaminfo);
		int length = teaminfo.size();
		for (int i = 0; i < length; i++) {
			if (teaminfo.get(i).id == (int) session.getAttribute("id")){
				Team currteam = teaminfo.get(i);
				currteam.addPlayer(player);
				System.out.println("Added a player");
			}	
		}
		
		request.getRequestDispatcher("/TeamPlayers").forward(request,response);
	}

}
