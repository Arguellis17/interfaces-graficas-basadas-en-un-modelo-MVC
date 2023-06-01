
package principal;

import controller.BibliotecaController;
import java.util.ArrayList;
import model.Libro;
import view.BibliotecaView;

public class Biblioteca {
    
    public static void main(String[] args) {
        
        // Creacion de los objetos
        BibliotecaView verBiblioteca = new BibliotecaView();
        Libro libro = new Libro();
        ArrayList<Libro> listadoLibro = new ArrayList();
        // Llamando al controlador
        BibliotecaController control = new BibliotecaController(verBiblioteca, libro, listadoLibro);
    }
    
}
