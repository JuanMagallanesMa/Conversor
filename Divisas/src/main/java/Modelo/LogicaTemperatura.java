/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luis magallanes
 */
public class LogicaTemperatura {
    
    private double Temperatura;
    private double Resultado;
    private String nombreTemp;
    
    public LogicaTemperatura() {
        
    }

    public String getNombreTemp() {
        return nombreTemp;
    }

    public void setNombreTemp(String nombreTemp) {
        this.nombreTemp = nombreTemp;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double Temperatura) {
        
        
        this.Temperatura = Temperatura;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }
    
    private double celsiusAFahren(){
        return this.Resultado=Math.round(((this.Temperatura*1.8)+32)*100.0)/100.0;
    }
    private double celsiusAKelvin(){
        return this.Resultado=Math.round((this.Temperatura+273.15)*100.0)/100.0;
    }
    private double fahrenACelsius(){
        return this.Resultado=Math.round(((this.Temperatura-32)/1.8)*100.0)/100.0;
    }
    
    private double fahrenAKelvin(){
        return this.Resultado=Math.round(((this.Temperatura-32)/1.8)+273.15*100.0)/100.0;
    }
    private double kelvinACelsius(){
        return this.Resultado=Math.round((this.Temperatura-273.15)*100.0)/100.0;
    }
    private double kelvinAFahren (){
        return this.Resultado=Math.round((((this.Temperatura-273.15)*1.8)+32)*100.0)/100.0;
    }
    public void convertir(){
        switch(this.nombreTemp){
            case "Celsius a Fahrenheit" -> {celsiusAFahren();}
            case "Celsius a Kelvin" -> {celsiusAKelvin();}
            case "Fahrenheit a Celsius" -> {fahrenACelsius();}
            case "Fahrenheit a Kelvin" -> {fahrenAKelvin();}
            case "Kelvin a Celsius" -> {kelvinACelsius();}
            case "Kelvin a Fahrenheit" -> {kelvinAFahren ();}
        }
    }
}
