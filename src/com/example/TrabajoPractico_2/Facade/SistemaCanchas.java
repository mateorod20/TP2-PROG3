package com.example.TrabajoPractico_2.Facade;

public class SistemaCanchas {
	public boolean reservar(String horario) {
        System.out.println("[Canchas] Cancha reservada para las " + horario);
        return true;
    }
}
