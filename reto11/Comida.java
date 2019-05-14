/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto11;

/**
 *
 * @author bisai
 */
public class Comida {
    private int nivelSabor;
    private int nivelPicante;
    public String nombre;
    private String ingredientes [];

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getNivelPicante() {
        return nivelPicante;
    }

    public void setNivelPicante(int nivelPicante) {
        this.nivelPicante = nivelPicante;
    }
}
