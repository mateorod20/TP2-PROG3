package com.example.TrabajoPractico_2.FactoryMethod;

public class ClubTechado extends Club {

	protected Cancha crearCancha()	{
		
	return new CanchaCubierta(); 
		
	}
}
