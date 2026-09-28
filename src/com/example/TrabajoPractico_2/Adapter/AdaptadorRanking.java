package com.example.TrabajoPractico_2.Adapter;

public class AdaptadorRanking implements Ranking {
	 private final RankingFederacion federacion;

	    public AdaptadorRanking(RankingFederacion federacion) {
	        this.federacion = federacion;
	    }

	    @Override
	    public int puntos() {
	        String texto = federacion.consultarPuntaje();         
	        return Integer.parseInt(texto.replace(" pts", "").trim());
	    }
}
