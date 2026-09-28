package com.example.TrabajoPractico_2.Singleton;

public class AnotadorPadel {
	
    private static AnotadorPadel anotador;
    private static final String[] VALORES = {"0", "15", "30", "40"};

    private final String[] parejas = {"Pareja A", "Pareja B"};
    private final int[] puntos = {0, 0};  
    private final int[] games = {0, 0};

    private AnotadorPadel() {}         

    public static AnotadorPadel getInstance() {
        if (anotador == null) {
        	anotador	= new AnotadorPadel();
        }
        return anotador;
    }

    public void puntoPara(int pareja) {
    	
        if (puntos[pareja] == 3) {   
            games[pareja]++;
            puntos[0] = 0;
            puntos[1] = 0;
            System.out.println("¡Game para " + parejas[pareja] + "!");
        } else {
            puntos[pareja]++;
        }
    }

    public void mostrar() {
        System.out.printf("%s: %d games (%s) | %s: %d games (%s)%n",
                parejas[0], games[0], VALORES[puntos[0]],
                parejas[1], games[1], VALORES[puntos[1]]);
    }
}