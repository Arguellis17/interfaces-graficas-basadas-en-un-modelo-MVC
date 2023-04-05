package modelo;

import java.util.ArrayList;

public class Alumno {

    // Atributos de la clase Alumno(GUI)
    private String codigo;
    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private String telefono;

    public Alumno() {

    }

    public Alumno(String codigo, String nombre, int edad, String genero, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    // Verificar que cumple los requisitos
    public String verBeneficio(int edad) {

        String mensaje = "";
        String obtenerGenero = genero;
        int obtenerEdad = edad;
        String f = "Femenino";
        
        if (f.equalsIgnoreCase(obtenerGenero)) {
            if (obtenerEdad >= 18) {

                mensaje = "La estudiante cuenta con un beneficio en su matricula al ser mayor de edad";
            } else {
                mensaje = "La estudiante no cuenta con algun beneficio en su matricula";
            }
        } else if (!f.equalsIgnoreCase(obtenerGenero)) {
            mensaje = "El estudiante al ser varon no cuenta con algun beneficio en su matricula";
        }

        return mensaje;
    }
    // El usuario busca un alumno
    public Alumno buscarAlumno(ArrayList<Alumno> lista, String codigo) {
        // Recorrer el la lista de alumnos
        for (int i = 0; i < lista.size(); i++) {
            // Se crea un alumno que sea igual a uno de los alumnos almacenados dentro de la lista
            Alumno alumno = lista.get(i);
            // Se pregunta a ese alumno si su codigo es igual al que el usuario esta  buscando
            if (alumno.getCodigo().equals(codigo)) {
                return alumno;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "Alumno" +
               "\nCodigo: " + codigo + 
                "\nNombre: " + nombre + 
                "\nEdad: " + edad + 
                "\nGenero: " + genero + 
                "\nDireccion: " + direccion + 
                "\nTelefono: " + telefono;
        
        
    }

}
