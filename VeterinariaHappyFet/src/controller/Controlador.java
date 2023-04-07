package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Mascota;
import view.Veterinaria;
import model.Servicio;
import model.Size;

// Para poder usar un checkbox, es necesario añadir un item listener de la clase awt
public class Controlador implements ActionListener, ItemListener {

    private Veterinaria formulario = null;
    private Mascota mascota;
    // Lista que nos permita agregar mascotas
    private ArrayList<Mascota> lista = null;

    public Controlador(Veterinaria formulario, Mascota mascota, ArrayList<Mascota> lista) {
        this.mascota = mascota;
        this.formulario = formulario;
        this.lista = new ArrayList();

        actionListener(this);

    }

    public void actionListener(ActionListener controlador) {

        // Conectando los controles
        formulario.btnCalcularServicio.addActionListener(controlador);
        formulario.btnGuardar.addActionListener(controlador);
        formulario.btnMostrarDatos.addActionListener(controlador);
        formulario.btnLimpiar.addActionListener(controlador);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getActionCommand().contentEquals("Limpiar")) {
            System.out.println("Estoy funcionando en limpiar");
            // Obtener lo que hay en la variable dinero
            formulario.txtCodigo.setText("");
            formulario.txtNombre.setText("");
            formulario.txtRaza.setText("");
            formulario.txtTamaño.setText("");

        } else if (evento.getActionCommand().contentEquals("Calcular Servicio")) {
            // Se hace una conversion a doble ya que el text field recibe un String
            System.out.println("Estoy funcionando en beneficio");
            String codigo = formulario.txtCodigo.getText();
//            Alumno alumnoBuscado = null;
//            for (int i = 0; i < lista.size(); i++) {
//                if (codigo.equalsIgnoreCase(lista.get(i).getCodigo())) {
//
//                    alumnoBuscado = lista.get(i);
//
//                }
//            }
//            JOptionPane.showMessageDialog(null, alumnoBuscado.verBeneficio(alumnoBuscado.getEdad()));

        } else if (evento.getActionCommand().contentEquals("Mostrar Datos")) {
            System.out.println("Estoy funcionando en mostrar datos");

        } else if (evento.getActionCommand()
                .contentEquals("Guardar")) {
            System.out.println("Estoy funcionando en guardar datos");

        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
