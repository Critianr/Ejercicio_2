package paquete;

public class Portatil extends Computador {
    public static int EXTRABATERY=100000, EXTRACHARGER=80000;
    private int extraBatery;
    private int extraCharger;
public Portatil() {
    super();
    this.extraBatery = EXTRABATERY;
    this.extraCharger = EXTRACHARGER;    
}
public Portatil(int extraBatery){
    this.extraBatery = extraBatery;
    this.extraCharger = EXTRACHARGER;
   }
   public Portatil(int extraBatery, int extraCharger) {
    this.extraBatery = extraBatery;
    this.extraCharger = extraCharger;    
}
   public double calcularPrecio(){
       return super.calcularPrecio() + extraBatery + extraCharger;
  
           
   }
}


