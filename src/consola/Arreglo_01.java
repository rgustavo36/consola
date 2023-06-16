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

public class Arreglo_01 {
    public static void main(String[]args){
        Scanner n=new Scanner(System.in);
        int[] num=new int[6];
        int i, suma=0, producto=0;
        System.out.println("SUMA DE PARES Y PRODUCTO");
        for(i=0;i<num.length;i++){
            System.out.print("pos["+i+"]= ");
            num[i]=n.nextInt();
        }
        for(i=0;i<num.length;i++){
            if(num[i]%2==0){
                suma=suma+num[i];
            }
            if(num[i]%5==0){
                producto=producto+num[i];
            }
        }
        
        System.out.println("SUMA DE PARES: "+suma);
        System.out.println("PRODUCTO DE NUMERO MULTIPLO 5: "+producto);
    }
}
