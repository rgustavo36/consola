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
import java.lang.*;
import java.util.*;
public class compareTO {
    public static void main(String[]args){
        String s1="Java";
        String s2="java";
        
        //comparando dos string
        int s=s1.compareTo(s2);
        System.out.println(s);
        System.out.println("============");
        s=s2.compareTo(s1);
        System.out.println(s);
        System.out.println("============");
        s2="Java";
        s=s1.compareTo(s2);
        System.out.println(s);
        /*if(s<0){
            System.out.println("\""+s1+"\""+" is lexicograficamnente high "+ "\""+s2+"\"");
        }else if(s==0){
            
        }*/
    }
}
