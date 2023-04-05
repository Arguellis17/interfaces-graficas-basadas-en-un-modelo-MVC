package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Operacion;
import vista.VerCalculadora;

public class Controlador implements ActionListener {

    private Operacion operacion = null;
    private VerCalculadora verCalculadora = null;

    public Controlador(Operacion operacion, VerCalculadora verCalculadora) {
        this.operacion = operacion;
        this.verCalculadora = verCalculadora;
        // Apunta hacia el metodo
        actionListener(this);
    }

    private void actionListener(ActionListener controlador) {
        // Conectando el controlador a los botones
        verCalculadora.btnSumar.addActionListener(controlador);
        verCalculadora.btnRestar.addActionListener(controlador);
        verCalculadora.btnMultiplicar.addActionListener(controlador);
        verCalculadora.btnDividir.addActionListener(controlador);
        verCalculadora.btnLimpiar.addActionListener(controlador);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getActionCommand().contentEquals("Limpiar")) {
            System.out.println("Estoy funcionando en limpiar");
            // Obtener lo que hay en la variable dinero
            verCalculadora.txtNumA.setText("");
            verCalculadora.txtNumB.setText("");
            verCalculadora.txtResultado.setText("");
        } else if (evento.getActionCommand().contentEquals("Sumar")) {

            String mensajeInvalido = "";
            if (this.verCalculadora.txtNumA.getText().equals(mensajeInvalido) || this.verCalculadora.txtNumB.getText().equals(mensajeInvalido)) {

                JOptionPane.showMessageDialog(null, "Error. Por favor ingresa un valor valido", "Calculadora hecha por Juan :)", 0);
            } else {
                int numA = Integer.parseInt(verCalculadora.txtNumA.getText());
                int numB = Integer.parseInt(verCalculadora.txtNumB.getText());
                operacion.setNumA(numA);
                operacion.setNumB(numB);

                String resultado = String.valueOf(operacion.sumar());
                verCalculadora.txtResultado.setText(resultado);

            }
        } else if (evento.getActionCommand().contentEquals("Restar")) {

            String mensajeInvalido = "";
            if (this.verCalculadora.txtNumA.getText().equals(mensajeInvalido) || this.verCalculadora.txtNumB.getText().equals(mensajeInvalido)) {

                JOptionPane.showMessageDialog(null, "Error. Por favor ingresa un valor valido", "Calculadora hecha por Juan :)", 0);
            } else {
                int numA = Integer.parseInt(verCalculadora.txtNumA.getText());
                int numB = Integer.parseInt(verCalculadora.txtNumB.getText());
                operacion.setNumA(numA);
                operacion.setNumB(numB);

                String resultado = String.valueOf(operacion.restar());
                verCalculadora.txtResultado.setText(resultado);
            }
        } else if (evento.getActionCommand().contentEquals("Multiplicar")) {

            String mensajeInvalido = "";
            if (this.verCalculadora.txtNumA.getText().equals(mensajeInvalido) || this.verCalculadora.txtNumB.getText().equals(mensajeInvalido)) {

                JOptionPane.showMessageDialog(null, "Error. Por favor ingresa un valor valido", "Calculadora hecha por Juan :)", 0);
            } else {
                int numA = Integer.parseInt(verCalculadora.txtNumA.getText());
                int numB = Integer.parseInt(verCalculadora.txtNumB.getText());
                operacion.setNumA(numA);
                operacion.setNumB(numB);

                String resultado = String.valueOf(operacion.multiplicar());
                verCalculadora.txtResultado.setText(resultado);

            }
        } else if (evento.getActionCommand().contentEquals("Dividir")) {

            String mensajeInvalido = "";
            if (this.verCalculadora.txtNumA.getText().equals(mensajeInvalido) || this.verCalculadora.txtNumB.getText().equals(mensajeInvalido)) {

                JOptionPane.showMessageDialog(null, "Error. Por favor ingresa un valor valido", "Calculadora hecha por Juan :)", 0);
            } else {
                int numA = Integer.parseInt(verCalculadora.txtNumA.getText());
                int numB = Integer.parseInt(verCalculadora.txtNumB.getText());
                operacion.setNumA(numA);
                operacion.setNumB(numB);

                String resultado = String.valueOf(operacion.dividir());
                verCalculadora.txtResultado.setText(resultado);
            }
        }

    }

}
