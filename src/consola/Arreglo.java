
package consola;

import javax.swing.*;
import java.util.*;

public class Arreglo {
    public static void main(String[] args){
        Scanner lea = new Scanner(System.in);
        Scanner lector=new Scanner(System.in);
        
        int lista[]=new int[5];
        int i, limite;
        
        System.out.print("Ingrese el limite dekl Arreglo: ");
        limite=lector.nextInt();
        for(i=0;i<limite;i++){
            System.out.print("x["+(i+1)+"]= ");
            lista[i]=lector.nextInt();
        }
        for(i=0;i<limite;i++){
            System.out.println(lista[i]+" ");
        }
    }
}
