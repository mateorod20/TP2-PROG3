package com.example.TrabajoPractico_2.Facade;

public class Main {
    public static void main(String[] args) {
        ReservaFacade fachada = new ReservaFacade();

        fachada.reservarTurno("Mateo Rodriguez", "20:00");
    }
}
