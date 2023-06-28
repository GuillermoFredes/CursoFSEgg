/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.entidades;

/**
 *
 * @author Admin
 */
public class productos {

    private int codigop;
    private int cod_fabricante;
    private String nombrep;
    private double precio;

    public productos() {
    }

    public int getCodigop() {
        return codigop;
    }

    public void setCodigop(int codigop) {
        this.codigop = codigop;
    }

    public int getCod_fabricante() {
        return cod_fabricante;
    }

    public void setCod_fabricante(int cod_fabricante) {
        this.cod_fabricante = cod_fabricante;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public productos(int codigop, int cod_fabricante, String nombrep, double precio) {
        this.codigop = codigop;
        this.cod_fabricante = cod_fabricante;
        this.nombrep = nombrep;
        this.precio = precio;
    }

}
