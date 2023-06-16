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
import java.util.Scanner;


public class principal {   
    public static float calificacion(float eTeorico, float ePracticas, boolean pConvalidad){
        
        if(eTeorico > 7F){
            System.out.println("Error rango Examen Teorico");
            return -1;
        }else if(ePracticas > 3F || ePracticas < 0F){
            System.out.println("Error rango Examen Practico");
            return -1;
        }else{
            if(eTeorico <= 3.5F){
                if(pConvalidad){
                    return eTeorico+1.5F;
                }else{
                    return eTeorico+ePracticas;
                }
            }
        }   
        return eTeorico;
    }
    public static void main(String[] args){
          Scanner e = new Scanner(System.in);
          float et, ep;
        
          
          System.out.println("Ingrese Teorico: ");
          et=e.nextFloat();
          System.out.println("Ingrese Practica: ");
          ep=e.nextFloat();
          
          
          calificacion(et, ep, true);
          
    }
    
}
