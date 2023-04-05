
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Operacion;
import vista.Formulario;

public class Controlador implements ActionListener{
    
    private Formulario formulario = null;
    private Operacion operacion = null;

    public Controlador(Formulario formulario, Operacion operacion) {
        this.formulario = formulario;
        this.operacion = operacion;
        
        // Apuntq hacia el metodo. Es decir, no se inicializa en el constructor si no en el metodo
        actionListener(this);
    }

    // Con el this, se apunta a este metodo desde el constructor
    
    private void actionListener(ActionListener controlador) {
        
        System.out.println("a");
        // Conectando el controlador a los botones
        formulario.btnConvertirPeso.addActionListener(controlador);
        formulario.btnConvertirDolar.addActionListener(controlador);
        
        
    }
    // Preguntar que evento esta realizando el usuario
    @Override
    public void actionPerformed(ActionEvent evento){
        
        if(evento.getActionCommand().contentEquals("Convertir a peso")){
            // Obtener lo que hay en la variable dinero
            System.out.println("Funciono en convertir a peso");
            double dinero = Double.parseDouble(formulario.txtDinero.getText());
            operacion.setDinero(dinero);
            operacion.setMoneda(4800.00);
            operacion.convertirPeso();
            formulario.txtResultado.setText(operacion.getResultado().toString());
        }
        else if(evento.getActionCommand().contentEquals("Convertir a dolar")){
            System.out.println("Funciono en convertir a dolar");
           // Se hace una conversion a doble ya que el text field recibe un String
            double dinero = Double.parseDouble(formulario.txtDinero.getText()); 
            operacion.setDinero(dinero); // Como el text Field ya es un doublese puede operar normal
            operacion.setMoneda(4800.00);
            operacion.convertirPesoDolar();
            
            formulario.txtResultado.setText(operacion.getResultado().toString());
        }
        
    }
    
    
}
