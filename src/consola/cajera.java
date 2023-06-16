/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

/**
 *
 * @author Administrador
 */
public class cajera extends Thread{
    private String nombre;
    private cliente cliente;
    private long initial;
    
    //METODO GET Y SET
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String no){
        this.nombre=no;
    }
    //CONSTRUCTOR
    public cajera(String cajera){
        this.nombre=cajera;
    }
    
    public cajera(String cajera, cliente c, long time){
        this.nombre=cajera;
        this.cliente=c;
        this.initial=time;
    }
    
    /*--------------------------------------------
    -------------------------------------------------
    -------------------------------------------------*/
   
    public void procesarCompra(cliente cliente, long tiemStamp){
        System.out.println("La Cajera " + this.nombre + 
                    "COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()+
                    " EN EL TIEMPO: " + (System.currentTimeMillis() - tiemStamp) / 1000 +
                    " Seg");
        
        for(int i = 0; i < cliente.getCarroCompra().length;i++){
            this.esperaXsegundo(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto "+ (i +1) +
                    "->Tiempo: " + (System.currentTimeMillis() - tiemStamp) / 1000 +
                    " seg");
        }
        
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " +
                cliente.getNombre() + " EN EL TIEMPO:  " +
                (System.currentTimeMillis() - tiemStamp) / 1000 +
                " seg");
    }
    
    @Override
    public void run(){
        System.out.println("la cajera " + this.nombre +
                    "COMIENZA A PROCEASR LA COMPRA DEL CLIENTE " + this.cliente.getNombre()+ 
                    " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initial)/1000 + 
                    " SEG");
        
        for(int i = 0; i < this.cliente.getCarroCompra().length; i++){
            this.esperaXsegundo(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto "+ (i + 1)+
                    "->Tiempo: "+ (System.currentTimeMillis()-this.initial)/1000 +
                    " SEG");
        }
        
        System.out.println("La Cajera: " + this.nombre +" HA TERMINADO DE PROCESAR "+
                    this.cliente.getNombre() + " EN EL TIEMPO: " +
                    (System.currentTimeMillis() - this.initial)/1000 +
                    " SEG");
    }
    public void esperaXsegundo(int segundo){
        try {
            Thread.sleep(segundo * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
        
    
}
