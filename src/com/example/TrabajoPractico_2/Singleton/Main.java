package com.example.TrabajoPractico_2.Singleton;

public class Main {
    public static void main(String[] args) {
    	
        AnotadorPadel juez = AnotadorPadel.getInstance();      
        AnotadorPadel pantalla = AnotadorPadel.getInstance();  
        juez.puntoPara(0); pantalla.mostrar();
        juez.puntoPara(0); pantalla.mostrar();
        juez.puntoPara(1); pantalla.mostrar();
        juez.puntoPara(0); pantalla.mostrar();
        juez.puntoPara(0); pantalla.mostrar();   


    }
}