package com.example.TrabajoPractico_2.Facade;

public class ReservaFacade {
	 private final SistemaCanchas canchas = new SistemaCanchas();
	    private final SistemaPagos pagos = new SistemaPagos();
	    private final SistemaNotificaciones notificaciones = new SistemaNotificaciones();

	    public void reservarTurno(String jugador, String horario) {
	        System.out.println("Reserva para: " +jugador+"");

	        if (canchas.reservar(horario) && pagos.cobrar(jugador, 10000)) {
	            notificaciones.enviarConfirmacion(jugador, horario);
	            System.out.println("Turno confirmado");
	        } else {
	            System.out.println("No se pudo completar la reserva");
	        }
	    }
}
