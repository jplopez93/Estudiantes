
package reto2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JUAN PABLO
 */
public class Registro {
    
    private final ArrayList <Estudiante> estudiantes;
    private final Scanner sc;
    
    public Registro(){
        estudiantes = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    
    public void procesarComandos(){
        
        String comando;
        String [] separado; 
        int opcion = 0;
        int edad;
        int numero_creditos;
        String modalidad;
        
        do{
            comando= sc.nextLine();
            separado = comando.split("&");
            opcion = Integer.parseInt(separado[0]);
            switch(opcion){
            
                case 1:
                    if (separado[1].equals("Pregrado")){
                        edad = Integer.parseInt(separado[3]);
                        numero_creditos = Integer.parseInt(separado[6]);
                        Estudiante estudiante = new Pregrado(separado[2],edad,separado[4],separado[5],numero_creditos);
                        estudiantes.add(estudiante);
                        break;
                    }else{
                        edad = Integer.parseInt(separado[3]);
                        modalidad = separado[6];
                        Estudiante estudiante = new Posgrado(separado[2],edad,separado[4],separado[5],modalidad);
                        estudiantes.add(estudiante);
                        break;
                    }
                

                case 2: 
                    System.out.println("***Listado de estudiantes***");
                    for (Estudiante estudiante : estudiantes){
                        System.out.println(estudiante);
                    }
                    break;
                    
                case 3:
                    break;  
            }
            
        }while(opcion != 3);
    }
    
    public static void main(String [] args){
        Registro registro = new Registro();
        registro.procesarComandos();
    }
}