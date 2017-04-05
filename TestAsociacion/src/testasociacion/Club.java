/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testasociacion;

import java.util.ArrayList;

/**
 *
 * @author tatan
 */
public class Club {
    private String nombre;
    private String actividad;
    // atributo de asociacion
    private Amigo secretario;
    private Amigo tesorero;
    private ArrayList <Amigo> colaboradores ;

    public Club(String nombre, String actividad, Amigo secretario, Amigo tesorero, ArrayList<Amigo> colaboradores) {
        this.nombre = nombre;//nombre del club
        this.actividad = actividad;//actividad del club
        this.secretario = secretario;//secretario 
        this.tesorero = tesorero;//tesorero
        this.colaboradores = colaboradores;//
    }
public Club() {
        this.nombre = "club seba";//nombre del club
        this.actividad = "anda a Laaaar";//actividad del club
        this.secretario = new Amigo("Stark",20,this);//secretario 
        this.tesorero = new Amigo("Seba",21,this);//tesorero
        this.colaboradores = new ArrayList<Amigo>();//
    }

    public void insartador(Amigo colaborador){
        this.colaboradores.add(colaborador);
        colaborador.setCoordinado(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
   
    
    
    
}
