/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mascotas;

/**
 *
 * @author JOHN JAIRO
 */
public class Caninos extends Mascotas{
    private int entrenamiento;

    public int getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(int entrenamiento) {
        this.entrenamiento = entrenamiento;
    }
    
    public Caninos(String nombre, String raza, String color, int edad, int entrenamiento) {
        super(nombre, raza, color, edad);
        this.entrenamiento = entrenamiento;
    }
    
    
}
