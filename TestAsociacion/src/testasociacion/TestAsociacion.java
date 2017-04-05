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
public class TestAsociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Club miclub = new Club();
        miclub.insartador(new Amigo("Alvaro",12));
        miclub.insartador(new Amigo("Mary Poppins",70));
    }
    
}
