/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncurso;

import gestionMenus.Menu;

/**
 *
 * @author Profesor
 */
public class GestionCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Modulo[] vModulos = new Modulo[5];
        vModulos[0] = new Modulo();
        vModulos[1]= new Modulo("Programación",200,"Juan Francico");
                
        Menu.pintaMenu("a");
       
    }
    
}
