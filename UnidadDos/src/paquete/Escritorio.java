package paquete;

public class Escritorio extends Computador{
    public static int CAMARA = 80000;
    public static int KEYBOARD = 160000;
    
    private int camara;
    private int keyboard;
    
    public Escritorio(){
        super();
        this.camara = CAMARA;
        this.keyboard = KEYBOARD;
    }

    public Escritorio(int camara, int keyboard){
        super();
        this.camara = camara;
        this.keyboard = keyboard;
    }
    public double calcularPrecio(){
        // totalg = camara + keyboard;
        // System.out.println("total escritorio " + totalg);
        return super.calcularPrecio() + camara + keyboard;
    }
}
