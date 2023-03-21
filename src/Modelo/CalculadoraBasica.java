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
public class CalculadoraBasica {

    private double memoria;

    public CalculadoraBasica() {
        memoria = 0;

    }

    public void sumar(double numero) {
        memoria += numero;
    }

    public void restar(double numero) {
        memoria -= numero;
    }

    public void multiplicar(double numero) {
        if (memoria == 0) {
            memoria = numero;
        } else {
            memoria *= numero;
        }
    }

    public void dividir(double numero) {
        if (memoria == 0) {
            memoria = numero;
        } else {
            memoria /= numero;
        }
    }

    public void limpiar() {
        memoria = 0;
    }

    public double getMemoria() {
        return memoria;
    }

}
