package paquete;

public class PrecioTotal {
    private double totalPCs, totalLaptops, totalDesktops;
    
    private Computador listaComputadores[];
        
    public PrecioTotal() {
        this.totalPCs=0.0;
        this.totalDesktops=0.0;
        this.totalLaptops=0.0;       
    }
    public PrecioTotal(Computador listaComputadores[]) {
        this.totalDesktops=0.0;
        this.totalLaptops=0.0;
        this.totalPCs=0.0;       

        this.listaComputadores = listaComputadores;
  
    }
    public void mostrarTotales() {
        for(Computador el: listaComputadores){
            if(el instanceof Computador){
                totalPCs = totalPCs + el.calcularPrecio();
            }if(el instanceof Portatil){
                totalLaptops = totalLaptops + el.calcularPrecio();
            }if(el instanceof Escritorio){
                totalDesktops = totalDesktops + el.calcularPrecio();
            }
        }
        
        System.out.println("El precio total de los computadores es de " + totalPCs);
        System.out.println("La suma del precio de loçs Laptops es de " + totalLaptops);
        System.out.println("La suma del precio de los Desktops es de " + totalDesktops);
        }
       }
