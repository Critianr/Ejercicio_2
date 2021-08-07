package paquete;

public class Computador {
    private static double PRECIO_BASE=1500000, PRECIO_MOUSE=60000, PRECIO_HEADPHONE=110000;
    private double mouse, headphone;
    private double precioBase;
    public Computador () {
        this.mouse = PRECIO_MOUSE;
        this.headphone = PRECIO_HEADPHONE;
        this.precioBase = PRECIO_BASE;
    }
    public Computador(double precioBase, double headphone){
            this.mouse = PRECIO_MOUSE;
            this.headphone = headphone;
            this.precioBase = precioBase;
        }
    
  public double calcularPrecio(){
    //    totalg = precioBase + mouse + headphone;
    //   System.out.println("Computador " + totalg);
      return precioBase + mouse + headphone;
  }
}
