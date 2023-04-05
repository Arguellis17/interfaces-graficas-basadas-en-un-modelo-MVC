
package modelo;

public class Operacion {
    
    private Double dinero;
    private Double moneda;
    
    private Double resultado;

    public Operacion(){
        
    }
    public Operacion(Double dinero, Double moneda, Double resultado) {
        this.dinero = dinero;
        this.moneda = moneda;
        this.resultado = resultado;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    public Double getMoneda() {
        return moneda;
    }

    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    public void convertirPesoDolar(){
        
        resultado = dinero * moneda;
    }
    
    public void convertirPeso(){
        
        resultado = dinero / moneda;
        
    }
}
