package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Alumno;
import vista.Formulario;

public class Controlador implements ActionListener {

    private Formulario formulario = null;
    private Alumno alumno;
    private ArrayList<Alumno> lista = null;

    public Controlador(Formulario formulario, Alumno alumno, ArrayList<Alumno> lista) {
        this.formulario = formulario;
        this.alumno = alumno;
        this.lista = new ArrayList<>();

        // Apunta hacia el metodo
        actionListener(this);
    }

    private void actionListener(ActionListener controlador) {
        // Conectando el controlador a los botones
        formulario.btnLimpiar.addActionListener(controlador);
        formulario.btnGuardar.addActionListener(controlador);
        formulario.btnBeneficio.addActionListener(controlador);
        formulario.btnMostrar.addActionListener(controlador);
        formulario.btnBuscar.addActionListener(controlador);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getActionCommand().contentEquals("Limpiar")) {
            System.out.println("Estoy funcionando en limpiar");
            // Obtener lo que hay en la variable dinero
            formulario.txtCodigo.setText("");
            formulario.txtNombre.setText("");
            formulario.txtEdad.setText("");
            formulario.txtGenero.setText("");
            formulario.txtDireccion.setText("");
            formulario.txtTelefono.setText("");

        } else if (evento.getActionCommand().contentEquals("Beneficio")) {
            // Se hace una conversion a doble ya que el text field recibe un String
            System.out.println("Estoy funcionando en beneficio");
            String codigo = formulario.txtCodigo.getText();
            Alumno alumnoBuscado = null;
            for (int i = 0; i < lista.size(); i++) {
                if (codigo.equalsIgnoreCase(lista.get(i).getCodigo())) {

                    alumnoBuscado = lista.get(i);

                }
            }
            JOptionPane.showMessageDialog(null, alumnoBuscado.verBeneficio(alumnoBuscado.getEdad()));

        } else if (evento.getActionCommand()
                .contentEquals("Guardar")) {

            JOptionPane.showMessageDialog(null, "Se guardo al estudiante correctamente");
            // Obtenmos lo que hay en los text fields y lo asignamos a nuestra variable

            String codigo = formulario.txtCodigo.getText();
            String nombre = formulario.txtNombre.getText();
            int edad = Integer.parseInt(formulario.txtEdad.getText());
            String genero = formulario.txtGenero.getText();
            String direccion = formulario.txtDireccion.getText();
            String telefono = formulario.txtTelefono.getText();

            // Creamos un objeto llamado alumno y le pasamos nuestros parametros
            Alumno alumnoNuevo = new Alumno(codigo, nombre, edad, genero, direccion, telefono);
            // Agregamos al alumno
            lista.add(alumnoNuevo);

        } else if (evento.getActionCommand().contentEquals("Buscar")) {
            // Obtener el codigo ingresado por el usuario
            System.out.println("Estoy funcionando");
            // Toma el codigo a buscar
            String codigoBusqueda = formulario.txtCodigoBusqueda.getText();
            // Creamos un alumno que debemos buscar
            Alumno alumnoEncontrado = null;
            // Recorrer la lista para encontrarlo
            for (int i = 0; i < lista.size(); i++) {
                // Preguntar si algun estudiante tiene el mismo codigo
                if (codigoBusqueda.equals(lista.get(i).getCodigo())) {
                    // Si es asi, nuestro alumno a buscar sera ese
                    Alumno alumnoBuscar = lista.get(i);
                    // El alumno encontrado sera igual al alumno buscado y llamamos al metodo
                    alumnoEncontrado = alumnoBuscar.buscarAlumno(lista, codigoBusqueda);

                    String codigoEncontrado = alumnoEncontrado.getCodigo();
                    String nombreEncontrado = alumnoEncontrado.getNombre();
                    int edadEncontrada = alumnoEncontrado.getEdad();
                    String generoEncontrado = alumnoEncontrado.getGenero();
                    String direccionEncontrada = alumnoEncontrado.getDireccion();
                    String telefonoEncontrado = alumnoEncontrado.getTelefono();

                    formulario.txtCodigo.setText(codigoEncontrado);
                    formulario.txtNombre.setText(nombreEncontrado);
                    formulario.txtEdad.setText(String.valueOf(edadEncontrada));
                    formulario.txtGenero.setText(generoEncontrado);
                    formulario.txtDireccion.setText(direccionEncontrada);
                    formulario.txtTelefono.setText(telefonoEncontrado);
                }
            }
        } else if (evento.getActionCommand().contentEquals("Mostrar Listado")) {

            // System.out.println("Estoy funcionando en mostrar listado");
            System.out.println("Mostrando listado:");

            for (int i = 0; i < lista.size(); i++) {

                System.out.println("\nAlumno " + (i + 1) + ":");
                System.out.println("Código: " + lista.get(i).getCodigo());
                System.out.println("Nombre: " + lista.get(i).getNombre());
                System.out.println("Edad: " + lista.get(i).getEdad());
                System.out.println("Género: " + lista.get(i).getGenero());
                System.out.println("Dirección: " + lista.get(i).getDireccion());
                System.out.println("Teléfono: " + lista.get(i).getTelefono());
                
                formulario.areaLista.setText(lista.get(i).toString());
            }

        }
    }

}
