package pk01;
//Clase abstracta Criatura que define el comportamiento común de todas las criaturas.
 // Es la base para Dragón, Guerrero y Mago.
    public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;
    
    // Constructor base para inicializar nombre, salud y fuerza de la criatura.
    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }
    //Método abstracto que cada criatura implementa según su estilo de ataque.
    public abstract void atacar(Criatura objetivo);
    //Reduce la salud de la criatura en función del daño recibido.
    public abstract void defender(int daño);
    // Devuelve verdadero si la criatura aún tiene salud positiva.

    public boolean estaViva() {
        return salud > 0;
    }

    public String getNombre() {
        return nombre;
    }
}
