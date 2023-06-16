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
public class Arreglo_03 {
    public static void main(String[]args){
        Scanner n=new Scanner(System.in);
        int[]num=new int[6];
        int i, mayor=0,menor=0;
        
        System.out.println("MAYOR Y MENOR DE MULTIPLOS DE 3 Y 5");
        for(i=0;i<num.length;i++){
            System.out.print("pos["+i+"]= ");
            num[i]=n.nextInt();
        }
        for(i=0;i<num.length;i++){
            if(num[i]%3==0){
                if(num[i]>mayor){
                    mayor=num[i];
                }
            }
            if(num[i]%5==0){
                if(menor<num[i]){
                    menor=num[i];
                }
            }
            
        }
        
        System.out.println("Numero Multiplo de 3 Menor: "+mayor);
        System.out.println("Numero Multiplo de 5 Mayor: "+menor);
    }
}
