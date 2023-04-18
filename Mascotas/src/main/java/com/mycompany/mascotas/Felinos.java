/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mascotas;

/**
 *
 * @author JOHN JAIRO
 */
public class Felinos extends Mascotas{
    private boolean toxoplas;

    public boolean isToxoplas() {
        return toxoplas;
    }

    public void setToxoplas(boolean toxoplas) {
        this.toxoplas = toxoplas;
    }
    
    
    public Felinos(String nombre, String raza, String color, int edad, boolean toxoplas) {
        super(nombre, raza, color, edad);
        this.toxoplas = toxoplas;
    }
    
}
