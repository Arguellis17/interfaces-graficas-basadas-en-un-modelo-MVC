package model;

import java.util.ArrayList;

public class Mascota {

    // Atributos
    private String codigo;
    private String nombre;
    private String raza;
    private Size tamanio;

    // Se agrega un constructor vacio que nos permita trabajar con la mascota en el controlador y la clase principal
    public Mascota() {

    }
    // Constructor con parametros que sera trabajado en el controlador
    public Mascota(String codigo, String nombre, String raza, Size tamanio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
    }

    // Metodos consultores 
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Size getTamanio() {
        return tamanio;
    }

    public void setTamanio(Size tamanio) {
        this.tamanio = tamanio;
    }

    // Metodo to String que nos servira para mostrar los datos de la mascota en el text area en forma de String ;)
    @Override
    public String toString() {
        return "Mascota: "
                + "\nCodigo: " + codigo
                + "\nNombre: " + nombre
                + "\nRaza: " + raza
                + "\nTamaño: " + tamanio;
    }
    
    // Metodo para buscar a la mascota, utilizado en el boton de mostrar listado
    // Se pide, una lista de mascotas y el codigo de esa mascota
    public Mascota buscarMascota(ArrayList<Mascota> lista, String codigo) {
        // Recorremos la lista de mascotas
        for (int i = 0; i < lista.size(); i++) {
            // Se crea una mascota que sea igual a uno de las mascotas almacenadas dentro de la lista
            Mascota mascota = lista.get(i);
            // Se pregunta a esa mascota si su codigo es igual al que el usuario esta  buscando
            if (mascota.getCodigo().equals(codigo)) {
            // Si esa mascota tiene el mismo codigo que el usuario esta buscando, muestra esa mascota al usuario
                return mascota;
            }

        }
        // Si no es asi, no devolver nada
        return null;
    }

}
