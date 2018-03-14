package com.codingdojo.teamroster.models;
import java.util.*;

public class Team {
	public String name;
	public ArrayList <Player>players = new ArrayList <Player> ();
	public int id;
	
	public Team(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ArrayList<Player> getPlayers() {
		return players;
	}



	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void addPlayer(Player player){
		this.players.add(player);
		System.out.println("Player successfully added");
	}
	
	public Player getPlayer(int i) {
		return this.players.get(i);
	}
	
	public int getid() {
		return this.id;
	}
	
}
