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
public final class  Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void mostrarAlimento() {
        System.out.println("El perro " + this.nombre + " tiene " + this.edad+ " años. Es de raza " + this.raza+ " y  le gusta mucho comer " + this.alimento);
    }
    
}
