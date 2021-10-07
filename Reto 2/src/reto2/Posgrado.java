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
public class Posgrado extends Estudiante{
    
    private String modalidad;
    
    public Posgrado(String nom, int ed, String pro, String etnia, String mod) {
        super(nom, ed, pro, etnia);
        modalidad = mod;
    }
    
    @Override
    public String toString(){
        return "\tEstudiante Posgrado" +
               "\n\tNombre: " + nombre + 
               "\n\tEdad: " + edad + " años"+
               "\n\tPrograma: " + programa +
               "\n\tEtnia: " + tipo_etnia +
               "\n\tModalidad: " + modalidad;
    }
    
}
