package com.xworkz.sports.constants;

public enum GamesEnum {
	CRICKET("MS Dhoni",11),HOCKEY("Harmanpreet Singh",11),FOOTBALL("leonal Messi",11),CHESS("Anand",1),KABBADDI("Kalinga",7),KOKO("Sarika Kale",12);
	
	private String name;
	private int players;
	
	
	private GamesEnum(String name, int players) {
		this.name = name;
		this.players = players;
	}

	public String getName() {
		return name;
	}
	
	public int getPlayers() {
		return players;
	}
	
	
	
}
