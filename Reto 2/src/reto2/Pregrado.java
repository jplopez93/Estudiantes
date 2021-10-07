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
public class Pregrado extends Estudiante{

    private int cantidad_creditos;
    
    public Pregrado(String nom, int ed, String pro, String etnia, int cantcre) {
        super(nom, ed, pro, etnia);
        this.cantidad_creditos = cantcre;
    }
    
    @Override
    public String toString(){
        return "\tEstudiante Pregrado" +
               "\n\tNombre: " + nombre + 
               "\n\tEdad: " + edad +" años"+
               "\n\tPrograma: " + programa +
               "\n\tEtnia: " + tipo_etnia +
               "\n\tCréditos aprobados: " + cantidad_creditos;
    }
      
}
