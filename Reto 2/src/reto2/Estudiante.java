/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author JUAN PABLO
 */
public class Estudiante {
    
    protected String nombre;
    protected int edad;
    protected String programa;
    protected String tipo_etnia;
    
    public Estudiante(String nom, int ed, String pro, String etnia){
        nombre = nom;
        edad = ed;
        programa = pro;
        tipo_etnia = etnia;
    }
    
    @Override
    public String toString(){
        return "\tNombre: " + nombre + 
               "\n\tEdad: " + edad +
               "\n\tPrograma: " + programa +
               "\n\tEtnia: " + tipo_etnia + "\n";
    }
}
