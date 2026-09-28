package com.example.TrabajoPractico_2.FactoryMethod;

public class Main {
	public static void main(String[] args) {
        Club club1 = new ClubTechado();
        Club club2 = new ClubAbierto();

        club1.reservar("Mateo", 2);
        club2.reservar("Juan", 3);
    }
}
