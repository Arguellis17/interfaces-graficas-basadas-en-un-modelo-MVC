package model;

public class Operacion {

    private int numA;
    private int numB;
    private int resultado;

    public Operacion(){
        
    }
    public Operacion(int numA, int numB) {

        this.numA = numA;
        this.numB = numB;

    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getResultado() {

        return resultado;
    }

    // Operaciones de la calculadora
    public int sumar() {

        resultado = numA + numB;

        return resultado;
    }

    public int restar() {

        resultado = numA - numB;

        return resultado;

    }

    public int multiplicar() {

        resultado = numA * numB;

        return resultado;

    }

    public int dividir() {

        resultado = numA / numB;

        return resultado;

    }

}
