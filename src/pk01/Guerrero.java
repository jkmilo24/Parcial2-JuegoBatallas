
package pk01;

import java.util.List;

public class Guerrero extends Criatura {
    private String armaNombre;
    private List<Arma> armas;

    public Guerrero(String nombre, int salud, int fuerza, String armaNombre, List<Arma> armas) {
        super(nombre, salud, fuerza);
        this.armaNombre = armaNombre;
        this.armas = armas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        for (Arma arma : armas) {
            daño += arma.getDañoAdicional();
        }
        System.out.println(nombre + " ataca con " + armaNombre + " usando varias armas, causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }
}
