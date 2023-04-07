package model;

import java.util.ArrayList;

public class Mascota {

    // Atributos
    private String codigo;
    private String nombre;
    private String raza;
    private Size tamanio;

    public Mascota() {

    }

    public Mascota(String codigo, String nombre, String raza, Size tamanio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
    }

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


    @Override
    public String toString() {
        return "Mascota: "
                + "\nCodigo: " + codigo
                + "\nNombre: " + nombre
                + "\nRaza: " + raza
                + "\nTamaño: " + tamanio;
    }
    
    public Mascota buscarMascota(ArrayList<Mascota> lista, String codigo) {
        // Recorrer el la lista de mascotas
        for (int i = 0; i < lista.size(); i++) {
            // Se crea una mascota que sea igual a uno de las mascotas almacenadas dentro de la lista
            Mascota mascota = lista.get(i);
            // Se pregunta a esa mascota si su codigo es igual al que el usuario esta  buscando
            if (mascota.getCodigo().equals(codigo)) {
                return mascota;
            }

        }
        return null;
    }

}
