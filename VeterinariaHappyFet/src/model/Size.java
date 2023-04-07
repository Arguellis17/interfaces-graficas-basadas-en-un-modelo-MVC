
package model;
/*
En Java, un enum es una clase especial que representa un conjunto de constantes con nombre. 
Es similar a una lista de valores fijos y predefinidos, donde cada valor se define como una instancia de 
la clase enum. Los enum permiten definir un conjunto limitado y predefinido de valores que un objeto puede
tomar, lo que ayuda a mejorar la legibilidad, la seguridad y la mantenibilidad del código.

En un enum, cada valor constante se define como un objeto de la propia clase enum, lo que permite definir 
métodos y campos para cada valor constante. Además, los enum pueden tener constructores, métodos y campos
como cualquier otra clase.

En resumen, el enum "Size" permitió definir valores predefinidos para los tamaños de las mascotas y 
simplificó el código necesario para acceder a estos valores en el controlador.
*/
public enum Size {
    
    // Nota: En los enum, un punto y coma en el ultimo elemento declarado determinada donde terminar las enumeraciones. Actua como un break D:
    // Dandole valor a los enum
    PEQUEÑO(15000, 5000, 5000, 2000),
    MEDIANO(25000, 5000, 10000, 4000),
    GRANDE(30000, 5000, 15000, 6000); 
    

    // Valores que dependen del tamaño(enum), estos son datos fijos y variaran segun donde se encuentren
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

    // Estos getters nos permiten acceder al precio de los tamaños (Pequeño, Mediano y Grande)
    // Dependiendo de a que tamaño (enum) llamemos, accedemos al precio de ese tamaño
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


