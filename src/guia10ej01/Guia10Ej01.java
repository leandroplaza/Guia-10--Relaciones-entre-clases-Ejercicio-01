/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author ezepl
 */
public class Guia10Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1=new Perro("Lucky", "asado",9, "caniche" );
        perro1.mostrarAlimento();
        Animal perro2=new Perro("pocho", "milanesas",3, "callejero" );
        perro2.mostrarAlimento();
        Animal caballo1= new Caballo ("Horse", "pasto", 14, "pura sangre");
        caballo1.mostrarAlimento();
        Animal gato1= new Gato("Micha", "alimento",6,"siames");
        gato1.mostrarAlimento();
    }
    
}
