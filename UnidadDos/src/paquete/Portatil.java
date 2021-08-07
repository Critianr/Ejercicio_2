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
public Portatil(int extraBatery, int extraCharger){
    super();
    this.extraBatery = extraBatery;
    this.extraCharger = extraCharger;
   }

   public double calcularPrecio(){
    // totalg = extraBatery + extraCharger;
       return super.calcularPrecio() + extraBatery + extraCharger;
  
           
   }
}


