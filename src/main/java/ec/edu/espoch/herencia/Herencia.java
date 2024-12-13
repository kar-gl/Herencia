/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.herencia;

import ec.edu.espoch.herencia.clases.Coordinador;
import ec.edu.espoch.herencia.clases.Estudiante;
import ec.edu.espoch.herencia.clases.Profesor;



/**
 *
 * @author SO-LAB1-PC14
 */
public class Herencia {

    public static void main(String[] args) {
    Estudiante objEstudiante= new Estudiante("001","Karen","Analuisa","1727384685","Femenino", 19 );
        System.out.println(objEstudiante.toString());

  Profesor objProfesor= new Profesor("001","Ing.Software","Karen","Analuisa","1727384685","Femenino", 19 );
        System.out.println(objProfesor.toString());
        
  Coordinador objCoordinador= new Coordinador("001","Ing.Software","Coordinador.TI","Karen","Analuisa","1727384685","Femenino", 19 );
        System.out.println(objCoordinador.toString());
    }
  
}
  
    
    

   
    

   

