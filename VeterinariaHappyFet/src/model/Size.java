
package model;

public enum Size {
    
    // Nota: En los enum, un punto y coma en el ultimo elemento declarado determinada donde terminar las enumeraciones. Actua como un break D:
    // Dandole valor a los enum
    PEQUEÑO(15000, 5000, 5000, 2000),
    MEDIANO(25000, 5000, 10000, 4000),
    GRANDE(30000, 5000, 15000, 6000);

    // Valor que depende del tamaño, es decir de los enum
    private int precioBañoCompleto;
    private int precioAplicacionVacunas;
    private int precioCortePelo;
    private int precioCorteUñas;
    

    // Constructor
    Size(int precioBañoCompleto, int precioAplicacionVacunas, int precioCortePelo, int precioCorteUñas) {
        this.precioBañoCompleto = precioBañoCompleto;
        this.precioAplicacionVacunas = precioAplicacionVacunas;
        this.precioCortePelo = precioCortePelo;
        this.precioCorteUñas = precioCorteUñas;
    }

    // Getters para los precios de los servicios adicionales
    public int getPrecioBañoCompleto() {
        return precioBañoCompleto;
    }

    public int getPrecioAplicacionVacunas() {
        return precioAplicacionVacunas;
    }

    public int getPrecioCortePelo() {
        return precioCortePelo;
    }

    public int getPrecioCorteUñas() {
        return precioCorteUñas;
    }
}


