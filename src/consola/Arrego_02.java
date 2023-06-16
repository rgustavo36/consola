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

public class Arrego_02 {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int[]num=new int[6];
        int i, mayor=0;
        System.out.println("NUMERO MAYOR");
        for(i=0;i<num.length;i++){
            System.out.print("pos["+i+"]= ");
            num[i]=n.nextInt();
        }
        for(i=0;i<num.length;i++){
            if(num[i]>mayor){
                mayor=num[i];
            }
        }
        System.out.println("Numero mayor: "+mayor);
    }
}
