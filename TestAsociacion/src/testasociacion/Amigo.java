/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testasociacion;

/**
 *
 * @author tatan
 */
public class Amigo {
    private String nombre;
    private int edad;
    // atributos de asosiacion
    private Club coordinado;

    public Amigo(String nombre, int edad, Club coordinado) {
        this.nombre = nombre;
        this.edad = edad;
        this.coordinado = coordinado;
    }
    public Amigo (String nombre , int edad){
        this.nombre= nombre;
        this.edad=edad;
    }

    public Club getCoordinado() {
        return coordinado;
    }

    public void setCoordinado(Club coordinado) {
        this.coordinado = coordinado;
    }

   
    
    
    
}
