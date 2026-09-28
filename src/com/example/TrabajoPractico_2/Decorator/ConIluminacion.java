package com.example.TrabajoPractico_2.Decorator;

public class ConIluminacion extends ReservaDecorador {

	public ConIluminacion(Reserva reserva) {
		super(reserva);
		}

    public String descripcion() {
    	return reserva.descripcion() + " + Iluminación"; }
    public int precio() {
    	return reserva.precio() + 2000; }
}
