package pk01;
import java.util.List;
 // Clase Mago que hereda de Criatura e implementa Magico.
 // Utiliza composición para incorporar armas mágicas que aumentan el daño.
public class Mago extends Criatura implements Magico {
    private String hechizos;
    private List<Arma> armas;
    public Mago(String nombre, int salud, int fuerza, String hechizos, List<Arma> armas) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
        this.armas = armas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        for (Arma arma : armas) {
            daño += arma.getDañoAdicional();
        }
        System.out.println(nombre + " lanza el hechizo " + hechizos + " con poder mágico y armas, causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " sufre " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un poderoso hechizo.");
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(nombre + " aprende un nuevo conjuro.");
    }
}