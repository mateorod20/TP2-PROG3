package com.example.TrabajoPractico_2.AbstractFactory;

public class FabricaPrincipiante implements FabricaEquipo {
	public Paleta crearPala() { 
		return new PaletaPrincipiante(); 
		}
}
