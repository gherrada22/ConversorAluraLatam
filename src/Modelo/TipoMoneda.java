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
 *
 */
public class TipoMoneda {

    public enum Moneda {
        DOLAR(3.81),
        EURO(4.02),
        LIBRA_ESTERLINA(4.51),
        YEN_JAPONES(0.028),
        WON_SULCOREANO(0.0029);

        private final double tipoCambio;

        Moneda(double tipoCambio) {
            this.tipoCambio = tipoCambio;
        }

        public double getTipoCambio() {
            return tipoCambio;
        }
    }
}
