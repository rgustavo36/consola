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

import com.db4o.ObjectContainer;
import com.db4o.*;
import java.io.File;
public class DB4O {
    public static void main(String[] args){
        
        //SE CREAR UNOS CUANTOS OBJETOS PERSONAS
        Personas p1 =new Personas("Gustavo",39,92,1.73);
        Personas p2=new Personas("Alejandra",34,78,1.68);
        Personas p3=new Personas("Ursula",32,96,1.85);
        Personas p4=new Personas("Alberto",39,85,1.78);
        
        //
        File f=new File("personas.db4o");
        f.delete();
        
        //SE CREA UN OBJETO PARA LA CONEXION 
        ObjectContainer db = Db4oEmbedded.openFile(f.getAbsolutePath());
        
        //GUARDAR LOS OBJETOS 
        db.store(p1);
        db.store(p2);
        db.store(p3);
        db.store(p4);
        
        //FORMA DE RECUPERAR LOS OBJETOS 
        Personas p=new Personas(null,34,0,0);
        ObjectSet<Personas> resultado=db.queryByExample(p);
        while(resultado.hasNext()){
            System.out.println(resultado.next());
        }
        db.close();
    }
}
