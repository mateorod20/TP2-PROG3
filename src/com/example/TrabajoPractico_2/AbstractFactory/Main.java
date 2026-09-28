package com.example.TrabajoPractico_2.AbstractFactory;

public class Main {
	 public static void main(String[] args) {
	        FabricaEquipo fabrica1 = new FabricaPrincipiante();
	        FabricaEquipo fabrica2 = new FabricaProfesional();

	        Paleta pala1 = fabrica1.crearPala();
	        Paleta pala2 = fabrica2.crearPala();

	        System.out.println("Principiante: " + pala1.descripcion());
	        System.out.println("Profesional: " + pala2.descripcion());
	    }
}
