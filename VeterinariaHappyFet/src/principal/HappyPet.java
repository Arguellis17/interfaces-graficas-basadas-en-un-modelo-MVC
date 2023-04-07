package principal;

import controller.Controlador;
import java.util.ArrayList;
import model.Mascota;
import view.Veterinaria;

public class HappyPet {

    public static void main(String[] args) {

        Veterinaria ver = new Veterinaria();
        Mascota m = new Mascota();
        ArrayList<Mascota> lista = new ArrayList();
        Controlador c = new Controlador(ver, m, lista);
    }
}
