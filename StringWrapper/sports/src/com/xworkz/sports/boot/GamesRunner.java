package com.xworkz.sports.boot;

import com.xworkz.sports.constants.GamesEnum;

public class GamesRunner {
	public static void main(String[] args) {
		String gamesenum= GamesEnum.CRICKET.getName();
		int gamesenum1= GamesEnum.CRICKET.getPlayers();
		
		String gamesenum2= GamesEnum.HOCKEY.getName();
		int gamesenum3= GamesEnum.HOCKEY.getPlayers();
		
		String gamesenum4= GamesEnum.FOOTBALL.getName();
		int gamesenum5= GamesEnum.FOOTBALL.getPlayers();
		
		String gamesenum6= GamesEnum.CHESS.getName();
		int gamesenum7= GamesEnum.CHESS.getPlayers();
		
		String gamesenum8= GamesEnum.KABBADDI.getName();
		int gamesenum9= GamesEnum.KABBADDI.getPlayers();
		
		String game= GamesEnum.KOKO.getName();
		int games= GamesEnum.KOKO.getPlayers();
		
		
		System.out.println("CRICKET captain: "+gamesenum);
		System.out.println("CRICKET palyers: "+gamesenum1);
		System.out.println("HOCKEY captain: "+gamesenum2);
		System.out.println("HOCKEY palyers: "+gamesenum3);
		System.out.println("FOOTBALL captain: "+gamesenum4);
		System.out.println("FOOTBALL palyers: "+gamesenum5);
		System.out.println("CHESS captain: "+gamesenum6);
		System.out.println("CHESS palyers: "+gamesenum7);
		System.out.println("KABBADDI captain: "+gamesenum8);
		System.out.println("KABBADDI palyers: "+gamesenum9);
		System.out.println("KOKO captain: "+game);
		System.out.println("KOKO palyers: "+games);
		
		
	}
}
