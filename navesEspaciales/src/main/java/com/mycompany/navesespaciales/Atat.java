/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navesespaciales;

/**
 *
 * @author JOHN JAIRO
 */
public class Atat extends NavesEspaciales{
    public Atat (){
        super(0,0,0,0);
    }
    public Atat(int capacidad, int consumo, int cantidad, double  distancia) {
         super(capacidad,consumo, cantidad, distancia);
    }
    
    @Override
    public double calCombustibleTotal(){

    double total= distancia*(consumo-(consumo*0.25))*cantidad;
        return total;
    }
    
}
