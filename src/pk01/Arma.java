package pk01;
 // La clase Arma representa un objeto que puede ser utilizado por criaturas
 //para aumentar su daño en combate. Esta clase es parte del diseño por composición.
public class Arma {
    private String nombre;
    private int dañoAdicional;
    //Constructor para definir el nombre y daño adicional del arma.
    public Arma(String nombre, int dañoAdicional){
        this.nombre = nombre;
        this.dañoAdicional = dañoAdicional;
        //Método que aplica daño adicional al objetivo usando esta arma.
    }
    public int atacarConArma (Criatura objetivo){
        return getDañoAdicional();
       // Devuelve el valor del daño adicional que proporciona esta arma.
    }
    public int getDañoAdicional(){
        return dañoAdicional;
    }
    public String getNombre() {
        return nombre;
    }
}
