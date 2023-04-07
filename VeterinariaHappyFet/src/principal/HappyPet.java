package principal;

import controller.Controlador;
import java.util.ArrayList;
import model.Mascota;
import view.Veterinaria;

/*

Clase principal, aqui llamamos a nuestro formulario, el contralador y el modelo del negocio
Es necesaria la importacion de estos paquetes y del arrayList, ya que nos permite trabajar con el 
desde el constructor del controlador

*/
public class HappyPet {

    
    public static void main(String[] args) {

        // Llamando a los paquetes MVC
        Veterinaria ver = new Veterinaria();
        Mascota mascota = new Mascota();
        ArrayList<Mascota> lista = new ArrayList();
        Controlador c = new Controlador(ver, mascota, lista);
    }
}
