package model;

public class Mascota {

    // Atributos
    private String codigo;
    private String nombre;
    private String raza;
    private String tamanio;

    public Mascota() {

    }

    public Mascota(String codigo, String nombre, String raza, String tamanio) {
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

    public String getTamanio() {
        return tamanio;
    }

    public void setTamaño(String tamanio) {
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

}
