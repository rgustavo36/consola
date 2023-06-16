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
import javax.swing.*;
import java.util.*;
import java.lang.Comparable;

public class caso {
    public static void main(String[]args){
        Scanner cn=new Scanner(System.in);
        String pc,so,version,anuncio,trabajo,op;
        char salir='n';
        do{
            
            System.out.println("========MENU OPCIONES========");
            System.out.println("1.-PC");
            System.out.println("2.-S.O.");
            System.out.println("3.-VERSION");
            System.out.println("4.-ANUNCIO");
            System.out.println("5.-TRABAJO");
            System.out.println("0.-SALIR");
            System.out.println("");
            
            System.out.println("INGRESE OPCION: ");
            op=cn.next();
        
            switch(op){
                case "1":
                    System.out.print("Que S.O utiliza: ");
                    so=cn.next();
                    System.out.println(so.compareTo(so));
                    break;
                case "2":
                    System.out.print("");
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    System.out.println("Desea Salir..?");
                    salir='S';
                    break;
            }
        }while(salir!='s');
        
        
    }
}
