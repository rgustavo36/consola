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
import java.util.*;
import javax.swing.*;
public class nmayorArreglo {
    public static void main(String[] args){
        Scanner en=new Scanner(System.in);
        int[] numero=new int[5];
        int i,j,caja,mayor=0;
        int posicion=0;
        System.out.println("LECTURA DE ELEMENTOS DE UN ARRAY");
        for(i=0;i<numero.length;i++){
            System.out.print("posicion [" + i + "]= ");
            numero[i]=en.nextInt();
        }
        for(i=0;i<numero.length;i++){
            if(numero[i]>mayor)
                mayor=numero[i];
                posicion=numero[i];
            
        }
        System.out.println("=======================");
        System.out.println("posicion ["+posicion+"]"
              + " El Numero Mayor es: "+ mayor);
    }
}
