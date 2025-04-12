package pk01;

public class Dragon extends Criatura implements Volador {
    private String escamas;
    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }
    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        System.out.println(nombre + " lanza fuego y ataca a " + objetivo.getNombre() + " con " + daño + " de daño.");
        objetivo.defender(daño);
    }
    @Override
    public void defender(int daño) {
        salud -= daño;
    }
    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
    @Override
    public void aterrizar() {
        System.out.println(nombre + " ha aterrizado.");
    }
}