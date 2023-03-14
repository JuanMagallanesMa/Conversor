/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luis magallanes
 */
public class LogicaDivisas {
    private double Moneda=0;
    private double Resultado=0;
    private String Cambio="";
    public LogicaDivisas() {
       
    }

    public String getCambio() {
        return Cambio;
    }

    public void setCambio(String Cambio) {
        this.Cambio = Cambio;
    }
    
    public double getMoneda() {
        return Moneda;
    }

    public void setMoneda(double Moneda) {
        this.Moneda = Moneda;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }
    
    
    private double convertirALibsEster(){
        return this.Resultado=Math.round((this.Moneda*(0.8309/1))*100.0)/100.0; 
    }
    
    private double convertirAEuro( ){
        return this.Resultado=Math.round((this.Moneda*(0.939/1))*100.0)/100.0;
    }
    private double convertirAYen( ){
        return this.Resultado=Math.round((this.Moneda*(135.845/1))*100.0)/100.0;  
    }
    private double convertirAWonS( ){
        return this.Resultado=Math.round((this.Moneda*(1295.78/1))*100.0)/100.0;  
    }
    private double convertirLibsEsterADolar( ){
        return this.Resultado=Math.round((this.Moneda/(0.8309))*100.0)/100.0; 
    }
    
    private double convertirEuroADolar( ){
        return this.Resultado=Math.round((this.Moneda/(0.939))*100.0)/100.0;
    }
    private double convertirYenADolar( ){
        return this.Resultado=Math.round((this.Moneda/(135.845))*100.0)/100.0;  
    }
    private double convertirWonSADolar( ){
        return this.Resultado=Math.round((this.Moneda/(1295.78))*100.0)/100.0;  
    }
    public void convertir(){
        switch (this.Cambio){
            case "Dolar a Libras Esterlinas" -> {
                convertirALibsEster();
            }
            case "Dolar a Euro" -> { 
                convertirAEuro( );                
            }
            case "Dolar a Yen japones" -> { 
                convertirAYen( );
                
            }
            case "Dolar a Won sul-coreano" -> { 
                convertirAWonS( );
            }
            case "Libras Esterlinas a Dolar" -> { 
                convertirLibsEsterADolar( );
            }
            case "Euro a Dolar" -> { 
                convertirEuroADolar( );
            }
            case "Yen japones a Dolar" -> { 
                convertirYenADolar( );
            }
            case "Won sul-coreano a Dolar" -> { 
                convertirWonSADolar( );
                
            }
                
        }
    }
}
