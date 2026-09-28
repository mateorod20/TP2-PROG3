package com.example.TrabajoPractico_2.Facade;

public class SistemaPagos {
	public boolean cobrar(String jugador, int monto) {
        System.out.println("[Pagos] Cobrados $" + monto + " a " + jugador);
        return true;
    }
}
