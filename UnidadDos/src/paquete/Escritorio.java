package paquete;

public class Escritorio extends Computador{
    public static int CAMARA = 80000;
    public static int KEYBOARD = 160000;
    
    private int camara;
    private int keyboard;
    
    public Escritorio(){
        this.camara = CAMARA;
        this.keyboard = KEYBOARD;
    }

    public Escritorio(int camara){
        this.camara = camara;
        this.keyboard = KEYBOARD;
    }
    public Escritorio(int camara, int keyboard){
        this.camara = camara;
        this.keyboard = keyboard;
    }
    public double calcularPrecio(){

        return super.calcularPrecio() + camara + keyboard;
    }
}
