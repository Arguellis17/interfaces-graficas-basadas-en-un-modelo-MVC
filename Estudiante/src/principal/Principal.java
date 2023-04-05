package principal;

import controller.Controlador;
import model.Estudiante;
import vista.VerEstudiante;

public class Principal {

    public static void main(String[] args) {

        VerEstudiante v = new VerEstudiante();
        Estudiante e = new Estudiante();
        Controlador c = new Controlador(e, v);
    }
}
