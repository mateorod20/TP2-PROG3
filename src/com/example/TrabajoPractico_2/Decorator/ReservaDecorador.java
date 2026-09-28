package com.example.TrabajoPractico_2.Decorator;

public abstract class ReservaDecorador implements Reserva {

	protected final Reserva reserva;

   protected ReservaDecorador(Reserva reserva) {   
	   this.reserva = reserva;
    }
}
