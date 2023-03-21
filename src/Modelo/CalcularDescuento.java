/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class CalcularDescuento {
    
    public double calcular(double valor, double porcentajeDescuento){
        double descuento = valor * (porcentajeDescuento / 100); 
        double resultado = valor - descuento;
        return resultado;
    }
    
    public double cantidadAhorrada(double valor, double porcentajeDescuento){
        double cantidadAhorrada = valor * (porcentajeDescuento / 100);
        return cantidadAhorrada;
    }
    
}
