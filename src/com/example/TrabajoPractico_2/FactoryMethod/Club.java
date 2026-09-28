package com.example.TrabajoPractico_2.FactoryMethod;

public abstract class Club {

	protected abstract Cancha crearCancha();   

    public void reservar(String jugador, int horas) {
        Cancha cancha = crearCancha();     
        int total = cancha.precioPorHora() * horas;
        System.out.println(jugador + " reservó: " + cancha.descripcion()
                + " por " + horas + " hs -> $" + total);
    }
}
