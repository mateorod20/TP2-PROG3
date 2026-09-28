package com.example.TrabajoPractico_2.Adapter;

public class Main {
	  public static void main(String[] args) {
	        Ranking ranking = new AdaptadorRanking(new RankingFederacion());

	        System.out.println("Puntos del jugador: " + ranking.puntos());
	        System.out.println("Puntos + bonus de torneo: " + (ranking.puntos() + 100));
	    }
}
