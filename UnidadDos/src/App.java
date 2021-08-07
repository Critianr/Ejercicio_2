
// import paquete.Computador;
import paquete.Computador;
import paquete.Escritorio;
import paquete.Portatil;
import paquete.PrecioTotal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, TODOS!");
        // Computador def3 = new Computador(1);
        Computador pcs2[] = new Computador[1];
        pcs2[0] = new Portatil();
        PrecioTotal precioT2 = new PrecioTotal(pcs2);
        precioT2.mostrarTotales();

        Computador pcs3[] = new Computador[2];
        pcs3[0] = new Portatil();
        pcs3[1] = new Escritorio();
        PrecioTotal precioT3 = new PrecioTotal(pcs3);
        precioT3.mostrarTotales();
        
        Computador pcs4[] = new Computador[4];
        pcs4[0] = new Portatil(130000,0);
        pcs4[1] = new Escritorio(55000,0);
        pcs4[2] = new Portatil (106000, 65000);
        pcs4[3] = new Escritorio(68000, 180000);
        PrecioTotal precioT4 = new PrecioTotal(pcs4);
        precioT4.mostrarTotales();


    }

}
/*    public class PrecioTotal {
        double totalPrecios = 0;
        double totalPCs, totalLaptops, totalDesktops;
        int Pc [] = new int [5];
        public void mostrarTotales() {

        System.out.println("El precio total de los computadores es de " + totalPCs);
        System.out.println("La suma del precio de los Laptops es de " + totalLaptops);
        System.out.println("La suma del precio de los Desktops es de " + totalDesktops);
        }
       }
        public class Computador {
            static double PRECIO_BASE, PRECIO_MOUSE, PRECIO_HEADPHONE;
            private double mouse, headphone, precioBase;
            public Computador () {
                this.mouse = PRECIO_MOUSE;
                this.headphone = PRECIO_HEADPHONE;
                this.precioBase = PRECIO_BASE;
            }
        }
   
        // @return precioBase + mouse + headphone;
       
       }
       public class Portatil extends Computador {
        //   * @param extraBatery
        // * @param extraBatery
        // * @param extraCharger
        // * @return super.calcularPrecio() + extraBatery + extraCharger;
  
        // @Override
        public double calcularPrecio() {
        }
       }
       public class Escritorio extends Computador {
        // * @param camera
        // * @param camera
        // * @param keyboard
        /**
        // * @return super.calcularPrecio() + camera + keyboard;
        */
        // @Override
