
package principal;

import java.util.ArrayList;
import vista.SagradaFamilia;
import modelo.Feligres;
import controller.Controlador;


public class Principal {
    
    public static void main(String[] args) {
        
        SagradaFamilia ver = new SagradaFamilia();
        Feligres  feligres = new Feligres();
        // El controlador no solo recibe un feligres, si no que recibe una lista de alumnos donde se almacena el objeto
        ArrayList<Feligres> lista = new ArrayList<>(); 
        Controlador c = new Controlador(ver, feligres,lista);
    }
}
