/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author Charli
 */
public class Conceptosbasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubmarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        //Tarea: teminar objetos miAkura y miMustang <-------------------------------------------------
        
        Automovil miAkura = new Automovil();
        miAkura.setMarca("Akura");
        miAkura.setSubmarca("NSX");
        miAkura.setModelo(2013);
        miAkura.setColor(Color.gray);
        System.out.println(miAkura);
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubmarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println(miMustang);
        
    }
    
}
