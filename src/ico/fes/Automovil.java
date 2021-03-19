/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author Charli
 */
public class Automovil {
    private String marca;
    private String submarca;
    private int modelo; 
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String submarca, int modelo, Color color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        System.out.println("Metiendo el coche al taller de pintura ... "); // no afecta al cliente la implementación de un objeto
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + "\n submarca=" + submarca + "\n modelo=" + modelo + "\n color=" + color + '}';
    }
    
    
    
}
