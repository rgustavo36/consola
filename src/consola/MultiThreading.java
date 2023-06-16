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
public class MultiThreading implements  Runnable{
    
    private cliente cliente;
    private cajera cajera;
    private long initial;
    
    public MultiThreading(cliente cliente, cajera cajera, long initial){
        this.cajera=cajera;
        this.cliente=cliente;
        this.initial=initial;
    }
    
    public static void main(String[] args){
       cliente cliente1 = new cliente("Cliente 1", new int[]{2,2,1,5,2,3});
       cliente cliente2 = new cliente("Cliente 2", new int[]{1,3,5,1,1});
      
       //tiermpo inicial de referencia
       long initial = System.currentTimeMillis();
       cajera cajera1=new cajera("Cajera 1");
       cajera cajera2=new cajera("cajera 2");
       //cajera cajera1 = new cajera("Cajera 1", cliente1, initial);
       //cajera cajera2 = new cajera("Cajera 2", cliente2, initial);
       
       Runnable proceso1 = new MultiThreading(cliente1, cajera1, initial);
       Runnable proceso2 = new MultiThreading(cliente2, cajera2, initial);
       
       //cajera1.procesarCompra(cliente1, initial);
       //cajera2.procesarCompra(cliente2, initial);
       //cajera1.start();
       //cajera2.start();
       new Thread(proceso1).start();
       new Thread(proceso2).start();
    }
    @Override
    public void run(){
        this.cajera.procesarCompra(this.cliente, this.initial);
    }
}
