package com.example.TrabajoPractico_2.Decorator;

public class Main {
	 public static void main(String[] args) {
	        Reserva simple = new ReservaBasica();

	        Reserva completa = new ReservaBasica();
	        completa = new ConIluminacion(completa);     
	        completa = new ConAlquilerDePaleta(completa);    

	        System.out.println(simple.descripcion() + " -> $" + simple.precio());
	        System.out.println(completa.descripcion() + " -> $" + completa.precio());
	    }
}
