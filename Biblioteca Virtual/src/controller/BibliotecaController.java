package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Libro;
import view.BibliotecaView;


public class BibliotecaController implements ActionListener {

    // Creacion de los objetos a manipular
    private BibliotecaView formulario = null;
    private Libro libro;
    private ArrayList<Libro> listado = null;

    public BibliotecaController(BibliotecaView formulario, Libro libro, ArrayList<Libro> listado) {
        this.formulario = formulario;
        this.libro = libro;
        this.listado = new ArrayList();

        // Conenctando el controlador al actionListener
        actionListener(this);

    }

    public void actionListener(ActionListener controlador) {

        // Conectando los controles
        formulario.btnAgregar.addActionListener(controlador);
        formulario.btnBuscar.addActionListener(controlador);
        formulario.btnEliminar.addActionListener(controlador);
        formulario.btnSalir.addActionListener(controlador);
        formulario.btnMostrarLibros.addActionListener(controlador);
        formulario.btnLimpiar.addActionListener(controlador);

    }

    // Validando que botones son oprimidos por el usuario
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getActionCommand().contentEquals("AGREGAR")) {

            String titulo = formulario.txtTitulo.getText();
            String autor = formulario.txtAutor.getText();
            String anioPublicacion = formulario.txtAño.getText();

            // Validar campos vacíos
            if (titulo.isEmpty() || autor.isEmpty() || anioPublicacion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos antes de guardar el libro.", "Error: Guardar Libro", JOptionPane.ERROR_MESSAGE);
                return; // No se agrega el libro
            }

            JOptionPane.showMessageDialog(null, "Se ha almacenado el libro en la biblioteca.");

            Libro nuevoLibro = new Libro(titulo, autor, anioPublicacion);
            listado.add(nuevoLibro);

        } else if (evento.getActionCommand().contentEquals("BUSCAR")) {

            // Se obtiene el titulo del libro escrito en el textfield
            String tituloBuscado = formulario.txtTitulo.getText();

            Libro libroEncontrado = null;

            // Validar campos
            if (tituloBuscado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un titulo.", "Advertencia: Buscar Libro", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // Buscar libro
            for (int i = 0; i < listado.size(); i++) {

                if (tituloBuscado.equals(listado.get(i).getTitulo())) {

                    Libro buscarLibro = listado.get(i);

                    libroEncontrado = buscarLibro.buscarLibro(listado, tituloBuscado);

                    String tituloEncontrado = libroEncontrado.getTitulo();
                    String autorEncontrado = libroEncontrado.getAutor();
                    String anioPublicacionEncontrado = libroEncontrado.getAñoPublicacion();

                    formulario.txtTitulo.setText(tituloEncontrado);
                    formulario.txtAutor.setText(autorEncontrado);
                    formulario.txtAño.setText(anioPublicacionEncontrado);

                    formulario.txtAreaRegistroLibros.setText(listado.get(i).toString());

                }
            }
        } else if (evento.getActionCommand().contentEquals("LIMPIAR")) {

            // Se limpian los campos de la GUI
            formulario.txtTitulo.setText("");
            formulario.txtAutor.setText("");
            formulario.txtAño.setText("");

            formulario.txtAreaRegistroLibros.setText("");

        } else if (evento.getActionCommand().contentEquals("SALIR")) {

            // Informar al usuario que esta saliendo de la aplicacion en consola
            System.out.println("Haz salido de la Biblioteca...");
            System.exit(0);

        } else if (evento.getActionCommand().contentEquals("MOSTRAR LIBROS")) {

            StringBuilder registros = new StringBuilder();

            // Validar que hayan libros registrados
            if (listado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, comience a agregar libros a la biblioteca.", "Advertencia: Mostrar Libros", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // En un for, se muestran los libros registrados partiendo del arrayList
            for (Libro libro : listado) {
                registros.append(libro.toString()).append("\n");
            }
            // Mostrar en el textArea
            formulario.txtAreaRegistroLibros.setText(registros.toString());

        } else if (evento.getActionCommand().contentEquals("ELIMINAR")) {

            // Se toma el titulo del libro a eliminar
            String tituloBuscado = formulario.txtTitulo.getText();

            // Validar que se haya ingresado un titulo
            if (tituloBuscado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un titulo.", "Advertencia: Eliminar Libro", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // Si se ingreso, recorrer la lista con el titulo del libro a eliminar, y quitarlo del arrayList
            for (int i = 0; i < listado.size(); i++) {
                if (tituloBuscado.equals(listado.get(i).getTitulo())) {
                    listado.remove(i);
                    break;
                }
            }

            // Limpiar los campos del libro eliminado
            formulario.txtTitulo.setText("");
            formulario.txtAutor.setText("");
            formulario.txtAño.setText("");
            formulario.txtAreaRegistroLibros.setText("");

        }

    }
}
