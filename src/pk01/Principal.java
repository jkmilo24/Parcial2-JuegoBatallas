package pk01;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Arma espada = new Arma("Espada de Zeus", 8);
        Arma lanza = new Arma("Lanza Rúnica", 5);
        Arma baston = new Arma("Bastón de Fuego", 10);
        Arma garra = new Arma("Garra Bestial", 6);

        Criatura dragon = new Dragon("Chimuelo", 120, 25, "rojas", Arrays.asList(garra, lanza));
        Criatura guerrero = new Guerrero("Kratos", 100, 20, "Espada", Arrays.asList(espada));
        Criatura mago = new Mago("Kadhgar", 80, 15, "Fuego Oscuro", Arrays.asList(baston));

        simularBatalla(dragon, guerrero);
        System.out.println("\n----------------------------\n");
        simularBatalla(mago, dragon);
    }

    public static void simularBatalla(Criatura criatura1, Criatura criatura2) {
        System.out.println("¡Batalla entre " + criatura1.getNombre() + " y " + criatura2.getNombre() + " comienza!\n");

        while (criatura1.estaViva() && criatura2.estaViva()) {
            criatura1.atacar(criatura2);
            if (!criatura2.estaViva()) 
                
            break;

            criatura2.atacar(criatura1);
        }

        System.out.println("\nResultado final:");
        if (criatura1.estaViva()) {
            System.out.println(criatura1.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println(criatura2.getNombre() + " ha ganado la batalla.");
        }
    }
}
