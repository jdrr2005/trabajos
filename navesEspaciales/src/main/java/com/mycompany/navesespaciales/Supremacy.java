/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navesespaciales;

/**
 *
 * @author JOHN JAIRO
 */
public class Supremacy extends NavesEspaciales{
    private int navesTransportadas;

    public int getNavesTransportadas() {
        return navesTransportadas;
    }

    public void setNavesTransportadas(int navesTransportadas) {
        this.navesTransportadas = navesTransportadas;
    }
    public Supremacy () {
         super(0,0,0,0);
    }
    
    public Supremacy(int navesTransportadas,int capacidad, int consumo, int cantidad, double distancia) {
        super(capacidad, consumo, cantidad, distancia );
        this.navesTransportadas = navesTransportadas;
    }

    @Override
    public double calCombustibleTotal(){
        double combustible=distancia*consumo*cantidad+(0.1*navesTransportadas);
        return combustible;
    }
}

