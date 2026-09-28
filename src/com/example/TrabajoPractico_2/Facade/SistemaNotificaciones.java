package com.example.TrabajoPractico_2.Facade;

public class SistemaNotificaciones {
	public void enviarConfirmacion(String jugador, String horario) {
        System.out.println("[Notificaciones] Confirmación enviada a " + jugador
                + " (turno " + horario + ")");
    }
}
