/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navesespaciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JOHN JAIRO
 */
public abstract class  NavesEspaciales {
  
    protected String tipo;
    protected int capacidad;
    protected double consumo;
    protected int cantidad;
    protected double distancia;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public NavesEspaciales ( int capacidad, double consumo, int cantidad, double distancia) {
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.cantidad = cantidad;
        this.distancia=distancia;
    }
   public double calCombustibleTotal(){
    double combustible=consumo*cantidad*distancia;
    return combustible;
    }  
}
