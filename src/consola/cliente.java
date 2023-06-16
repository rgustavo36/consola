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
public class cliente {
    
    private String nombre;    
    private int[] carroCompra;
    
   
     //METODO GET Y SET
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String no){
        this.nombre=no;
    }
    
    public int[] getCarroCompra(){
        return carroCompra;
    }
    public void setCarroCompra(int[] carro){
        this.carroCompra=carro;
    }
    
    
    //CONSTRUCTOR
    public cliente(String cliente, int[] ca){
        this.nombre=cliente;
        this.carroCompra=ca;
    }
    
}
