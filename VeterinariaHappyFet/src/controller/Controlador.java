
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Mascota;
import view.Veterinaria;
import model.Servicio;
import model.Size;

public class Controlador implements ActionListener {
    
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
    
    public void actionListener(ActionListener controlador){
        
        // Conectando los controles
        formulario.btnCalcularServicio.addActionListener(controlador);
        formulario.btnGuardar.addActionListener(controlador);
        formulario.btnMostrarDatos.addActionListener(controlador);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
