/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author ezepl
 */
public final class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void mostrarAlimento() {
       System.out.println("El caballo " + this.nombre + " tiene " + this.edad+ " años. Es de raza " + this.raza+ " y  le gusta mucho comer " + this.alimento);
    }  
}
