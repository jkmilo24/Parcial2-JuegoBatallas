package pk01;

import java.util.List;

public class Dragon extends Criatura implements Volador {
    private String escamas;
    private List<Arma> armas;

    public Dragon(String nombre, int salud, int fuerza, String escamas, List<Arma> armas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
        this.armas = armas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        for (Arma arma : armas) {
            daño += arma.getDañoAdicional();
        }
        System.out.println(nombre + " lanza fuego potenciado por sus armas causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " ha recibido " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando entre las nubes.");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " aterriza con un rugido.");
    }
}