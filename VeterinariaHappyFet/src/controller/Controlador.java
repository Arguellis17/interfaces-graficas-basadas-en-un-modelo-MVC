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
public class Controlador implements ActionListener {

    private Veterinaria formulario = null;
    private Mascota mascota;
    private ArrayList<Mascota> lista = null;
    private Size tamanio; // Variable que guarda el tamaño de la mascota de la clase enum que es size

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

            String codigoBusqueda = formulario.txtCodigo.getText();

            Mascota mascotaBuscada = null;
            for (int i = 0; i < lista.size(); i++) {
                if (codigoBusqueda.equalsIgnoreCase(lista.get(i).getCodigo())) {

                    mascotaBuscada = lista.get(i);

                }
            }

            // Aquí puedes obtener el valor de los checkbox seleccionados
            int valorTotalServicio = 0;
            if (formulario.chkBanioCompleto.isSelected()) {
                valorTotalServicio += mascotaBuscada.getTamanio().getPrecioBañoCompleto();
            }
            if (formulario.chkVacunas.isSelected()) {
                valorTotalServicio += mascotaBuscada.getTamanio().getPrecioAplicacionVacunas();
            }
            if (formulario.chkCortePelo.isSelected()) {
                valorTotalServicio += mascotaBuscada.getTamanio().getPrecioCortePelo();
            }
            if (formulario.chkCorteUñas.isSelected()) {
                valorTotalServicio += mascotaBuscada.getTamanio().getPrecioCorteUñas();
            }

            // Imprimir el valor total en el JTextArea
            formulario.txtAreaResultado.setText("El valor total del servicio es: $" + valorTotalServicio);

        } else if (evento.getActionCommand().contentEquals("Mostrar Datos")) {

            System.out.println("Estoy funcionando en mostrar datos");
            String codigoBusqueda = formulario.txtCodigo.getText();
            // Creamos una mascota que debemos buscar igualada a vacia, pues aun no sabemos quien es
            Mascota mascotaEncontrada = null;
            // Recorrer la lista para encontrarlo
            for (int i = 0; i < lista.size(); i++) {
                // Preguntar si alguna mascota tiene el mismo codigo
                if (codigoBusqueda.equals(lista.get(i).getCodigo())) {
                    // Si es asi, nuestra mascota a buscar sera esa
                    Mascota mascotaBuscar = lista.get(i);
                    // La mascota encontrada sera igual al la mascota buscada y llamamos al metodo
                    mascotaEncontrada = mascotaBuscar.buscarMascota(lista, codigoBusqueda);

                    String codigoEncontrado = mascotaEncontrada.getCodigo();
                    String nombreEncontrado = mascotaEncontrada.getNombre();
                    String razaEncontrada = mascotaEncontrada.getRaza();
                    String tamanioEncontrado = String.valueOf(mascotaEncontrada.getTamanio());

                    formulario.txtCodigo.setText(codigoEncontrado);
                    formulario.txtNombre.setText(nombreEncontrado);
                    formulario.txtRaza.setText(razaEncontrada);
                    formulario.txtTamaño.setText(tamanioEncontrado);

                }
            }

        } else if (evento.getActionCommand()
                .contentEquals("Guardar")) {

            JOptionPane.showMessageDialog(null, "Se guardo a tu mascota correctamente");
            // Obtenmos lo que hay en los text fields y lo asignamos a nuestra variable

            String codigo = formulario.txtCodigo.getText();
            String nombre = formulario.txtNombre.getText();
            String raza = formulario.txtRaza.getText();
            // Obtenemos el texto ingresado por el usuario
            String tamanioTexto = formulario.txtTamaño.getText();

            // Convertimos el texto en un valor de tipo Size
            if (tamanioTexto.equalsIgnoreCase("PEQUEÑO")) {
                tamanio = Size.PEQUEÑO;
            } else if (tamanioTexto.equalsIgnoreCase("MEDIANO")) {
                tamanio = Size.MEDIANO;
            } else if (tamanioTexto.equalsIgnoreCase("GRANDE")) {
                tamanio = Size.GRANDE;
            }

            // Creamos un objeto llamado alumno y le pasamos nuestros parametros
            Mascota mascotaNueva = new Mascota(codigo, nombre, raza, tamanio);
            // Agregamos al alumno
            lista.add(mascotaNueva);

        }
    }

//    @Override
//    public void itemStateChanged(ItemEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
