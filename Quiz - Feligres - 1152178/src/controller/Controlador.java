package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Estado;
import vista.SagradaFamilia;
import modelo.Feligres;

public class Controlador implements ActionListener {

    // Atributos a usar
    private SagradaFamilia formulario = null;
    private Feligres feligres;
    // Lista que nos permita agregar feligreces
    private ArrayList<Feligres> lista = null; 
    
    // Constructor del controlador
    public Controlador(SagradaFamilia formulario, Feligres feligres, ArrayList<Feligres> lista) {
        this.formulario = formulario;
        this.feligres = feligres;
        this.lista = new ArrayList<>();
        // Apunta hacia el metodo
        actionListener(this);
    }
    // Inicializamos el controlador con este metodo
    private void actionListener(ActionListener controlador) {
        // Conectando el controlador a los botones
        formulario.btnLimpiar.addActionListener(controlador);
        formulario.btnGuardar.addActionListener(controlador);
        formulario.btnPagarDiezmo.addActionListener(controlador);
        formulario.btnMostrarDatos.addActionListener(controlador);

    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getActionCommand().contentEquals("Limpiar")) {
            // Modificamos los datos(txt) del feligres con un set donde estos sean vacios ""
            formulario.txtCedula.setText("");
            formulario.txtNombre.setText("");
            formulario.txtDireccion.setText("");
            formulario.txtTelefono.setText("");
            formulario.txtEstrato.setText("");
            formulario.txtEstado.setText("");
            
            formulario.areaResultado.setText("");
        } else if (evento.getActionCommand().contentEquals("Guardar")) {
            // Le decimos al usuario que se a guardado el feligres
            JOptionPane.showMessageDialog(null, "Se guardo al feligres correctamente");
            // Obtenmos los datos del feligres pasados por los text fields
            String cedula = formulario.txtCedula.getText();
            String nombre = formulario.txtNombre.getText();
            String direccion = formulario.txtDireccion.getText();
            String telefono = formulario.txtTelefono.getText();
            int estrato = Integer.parseInt(formulario.txtEstrato.getText());
            //String estado = formulario.txtEstado.getText(); -> No es necesario obtener el estado, ya que segun el enunciado este empieza siempre como deudor

            // Creamos un objeto llamado feligres y le pasamos nuestros parametros obtenidos de los text fields
            // En el mismo constructor, indicamos que el estado es deudor
            Feligres feligresNuevo = new Feligres(cedula, nombre, direccion, telefono, estrato, Estado.DEUDOR);
            // Una vez, crerado el feligres con los datos del text fields. Lo añadimos a nuestra lista de feligreces, y a medida que el usuario quiera agregar mas se iran agregando en nuestra lista
            lista.add(feligresNuevo);

        } else if (evento.getActionCommand().equals("Mostrar Datos")) {
            //System.out.println("Mostrando listado:");
            // Para buscar a un feligres, debemos de obtener la cedula que a sido ingresada en el text field ya que es unica para un feligres
            String cedula = formulario.txtCedula.getText();
            // Una vez obtengamos la cedula, recorremos nuestra lista de feligreces
            for (int i = 0; i < lista.size(); i++) {
                // Una vez recorrida, preguntamos si hay algun feligres con el numero de cedula que estemos buscando
                if (cedula.equals(lista.get(i).getCedula())) {
                    // Aqui se imprime en consola
//                    System.out.println("\nFeligres " + (i + 1) + ":");
//                    System.out.println("Cedula: " + lista.get(i).getCedula());
//                    System.out.println("Nombre: " + lista.get(i).getNombre());
//                    System.out.println("Direccion: " + lista.get(i).getDireccion());
//                    System.out.println("Estrato: " + lista.get(i).getEstrato());
//                    System.out.println("Estado: " + lista.get(i).getEstado());

                    // Si el feligres a sido encontrado, asignamos sus datos en los text fields correspondientes
                    formulario.txtNombre.setText(lista.get(i).getNombre());
                    formulario.txtDireccion.setText(lista.get(i).getDireccion());
                    formulario.txtTelefono.setText(lista.get(i).getTelefono());
                    formulario.txtEstrato.setText(String.valueOf(lista.get(i).getEstrato()));
                    formulario.txtEstado.setText(String.valueOf(lista.get(i).getEstado()));
                    // Llamamos al metodo mostrar datos de la clase feligres, y lo pasamos al text area
                    formulario.areaResultado.setText(lista.get(i).mostrar());
                    

                }
            }
        } else if (evento.getActionCommand().equals("Pagar Diezmo")) {
            //System.out.println("Funciona");
            // Para pagar un diezmo, necesitamos saber a quien se le va a pagar. Para ello, tenemos que tener su cedula
            String cedula = formulario.txtCedula.getText();
            // Creamos un feligres que sera el que debamos encontrar
            Feligres feligresBuscado = null;
            // Recorremos la lista
            for (int i = 0; i < lista.size(); i++) {
                // Volvemos a preguntar quien tiene esa cedula
                if (cedula.equalsIgnoreCase(lista.get(i).getCedula())) {
                    // El feligres que contenga esa cedula, sera el feligres que estemos buscando
                    feligresBuscado = lista.get(i);

                }
            }
            // Operamos con nuestro feligres buscado
            feligresBuscado.pagarDiezmo();

        }
    }

}
