
package principal;

import controller.Controlador;
import model.Operacion;
import vista.VerCalculadora;

public class Principal {
    
    public static void main(String[] args) {
        
        VerCalculadora ver = new VerCalculadora();
        Operacion op = new Operacion();
        Controlador con = new Controlador(op, ver);
        
        
    }
}
