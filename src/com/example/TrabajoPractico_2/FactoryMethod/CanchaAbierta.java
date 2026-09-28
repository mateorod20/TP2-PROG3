package com.example.TrabajoPractico_2.FactoryMethod;

public class CanchaAbierta  implements Cancha {
	public String descripcion() { 
		return "Cancha al aire libre"; }
    public int precioPorHora() {
    	return 8000; }
}
