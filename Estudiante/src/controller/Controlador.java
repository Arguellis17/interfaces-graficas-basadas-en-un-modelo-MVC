package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Estudiante;
import vista.VerEstudiante;

public class Controlador implements ActionListener {

    private Estudiante estudiante = null;
    private VerEstudiante verEstudiante = null;

    public Controlador(Estudiante estudiante, VerEstudiante verEstudiante) {
        super();
        this.estudiante = estudiante;
        this.verEstudiante = verEstudiante;
        actionListener(this); // Recordar que esto se inicializa en un metodo a parte, por eso el this

    }

    private void actionListener(ActionListener controlador) {
        verEstudiante.btnAgregar.addActionListener(controlador);
        verEstudiante.btnMostrar.addActionListener(controlador);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        try {
            if (evento.getActionCommand().contentEquals("Agregar")) {
                System.out.println("Agregado");
                String codigo = this.verEstudiante.txtCodigo.getText();
                String nombre = this.verEstudiante.txtNombre.getText();
                String apellido = this.verEstudiante.txtApellido.getText();
                String direccion = this.verEstudiante.txtDireccion.getText();
                String telefono = this.verEstudiante.txtTelefono.getText();

                estudiante.setCodigo(codigo);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);
                estudiante.setDireccion(direccion);
                estudiante.setTelefono(telefono);

            } else if (evento.getActionCommand().contentEquals("Mostrar")) {
                System.out.println("Mostrando");
                System.out.println(estudiante.toString());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
