
package modelo;

import javax.swing.JOptionPane;



public class Feligres {
    
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private int estrato;
    private Estado estado;

    public  Feligres(){
        
    }
    public Feligres(String cedula, String nombre, String direccion, String telefono, int estrato, Estado estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    // Metodo
    public void pagarDiezmo(){
        
       
        if(estrato == 1){
            JOptionPane.showMessageDialog(null, "Su pago por el valorde $250.000 se realizo con exito");
            setEstado(estado.CUMPLIDO);
        }
        if(estrato == 2 || estrato == 3){
          JOptionPane.showMessageDialog(null, "Su pago por el valor de $1.000.000 se realizo con exito");
            setEstado(estado.CUMPLIDO);
        }
        
    }

    
    public String mostrar() {
        return "Feligres:" +
                "\nCedula: " + cedula + 
                "\nNombre: " + nombre +
                "\nDireccion: " + direccion +
                "\nTelefono: " + telefono + 
                "\nEstrato :" + estrato + 
                "\nEstado: " + estado ;
    }
}
        
        
    
      
      
      
      
      
    
    

