package com.example.TrabajoPractico_2.Decorator;

public class ConAlquilerDePaleta extends ReservaDecorador {

	public ConAlquilerDePaleta(Reserva reserva) {
		super(reserva); 
		}

    public String descripcion() {
    	return reserva.descripcion() + " + Alquiler de paleta"; 
    	}
    public int precio() {
    	return reserva.precio() + 3000; 
    	}
}
