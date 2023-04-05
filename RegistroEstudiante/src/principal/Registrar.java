
package principal;


import control.Controlador;
import java.util.ArrayList;
import modelo.Alumno;
import vista.Formulario;


public class Registrar {
    
    public static void main(String[] args) {
        
    
        Formulario formulario = new Formulario(); 
        Alumno  alumno = new Alumno();
        // El controlador no solo recibe un alumno, si no que recibe una lista de alumnos donde se almacena el objeto
        ArrayList<Alumno> lista = new ArrayList<>(); 
        Controlador c = new Controlador(formulario, alumno,lista);
    }
}
