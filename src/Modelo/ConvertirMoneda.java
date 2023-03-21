/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.TipoMoneda.*;

/**
 *
 * @author gherrada22
 * @Linkedin gherrada22
 * @Github gherrada22
 */
public class ConvertirMoneda {

    public double convertirSolesADolares(double soles) {
        double dolares = soles / Moneda.DOLAR.getTipoCambio();
        return dolares;
    }

    public double convertirDolaresASoles(double dolares) {
        double soles = dolares * Moneda.DOLAR.getTipoCambio();
        return soles;
    }

    public double convertirSolesAEuros(double soles) {
        double euros = soles / Moneda.EURO.getTipoCambio();
        return euros;
    }

    public double convertirEurosASoles(double euros) {
        double soles = euros * Moneda.EURO.getTipoCambio();
        return soles;
    }

    public double convertirSolesALibrasEsterlinas(double soles) {
        double librasEsterlinas = soles / Moneda.LIBRA_ESTERLINA.getTipoCambio();
        return librasEsterlinas;
    }

    public double convertirLibrasEsterlinasASoles(double librasEsterlinas) {
        double soles = librasEsterlinas * Moneda.LIBRA_ESTERLINA.getTipoCambio();
        return soles;
    }

    public double convertirSolesAYenJapones(double soles) {
        double yenJapones = soles / Moneda.YEN_JAPONES.getTipoCambio();
        return yenJapones;
    }

    public double convertirYenJaponesASoles(double yenJapones) {
        double soles = yenJapones * Moneda.YEN_JAPONES.getTipoCambio();
        return soles;
    }

    public double convertirSolesAWonSulCoreano(double soles) {
        double wonSulCoreano = soles / Moneda.WON_SULCOREANO.getTipoCambio();
        return wonSulCoreano;
    }

    public double convertirWonSulCoreanoASoles(double wonSulCoreano) {
        double soles = wonSulCoreano * Moneda.WON_SULCOREANO.getTipoCambio();
        return soles;
    }

}
