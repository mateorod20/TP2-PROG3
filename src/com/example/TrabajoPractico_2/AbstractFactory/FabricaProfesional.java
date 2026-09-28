package com.example.TrabajoPractico_2.AbstractFactory;

public class FabricaProfesional implements FabricaEquipo {

	public Paleta crearPala() { 
		return new PaletaProfesional(); 
		}
}
