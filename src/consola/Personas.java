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
public class Personas {
    private String _nombre;
    private int _edad;
    private double _peso;
    private double _altura;
    
    public Personas(){}
    
    public Personas(String n, int e, double p, double a){
        this._nombre=n;
        this._edad=e;
        this._peso=p;
        this._altura=a;
    }
    
    //METODOS GET Y SET
    public String getNombre(){
        return _nombre;
    }
    public void setNombre(String n){
        this._nombre=n;
    }
    
    public int getEdad(){
        return _edad;
    }
    public void setEdad(int e){
        this._edad=e;
    }
    
    public double getPeso(){
        return _peso;
    }
    public void setPeso(double p){
        this._peso=p;
    }
    
    public double getAltura(){
        return _altura;
    }
    public void setAltura(double a){
        this._altura=a;
    }
    
    @Override
    public String toString(){
        return "Persona{"+"Nombre="+_nombre+", Edad="+_edad+", Peso="+_peso+", Altura="+_altura;
    }
}
