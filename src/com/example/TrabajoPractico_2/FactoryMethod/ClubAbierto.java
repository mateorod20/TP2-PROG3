package com.example.TrabajoPractico_2.FactoryMethod;

public class ClubAbierto extends Club {
	protected Cancha crearCancha() {
		return new CanchaAbierta(); 
		}
}
