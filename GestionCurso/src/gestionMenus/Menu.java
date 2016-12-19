/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionMenus;

import gestioncurso.Modulo;

/**
 *
 * @author Profesor
 */
public class Menu {
    
    public static int opcion;
    
    public static void pintaMenu(){
        System.out.println("");
        System.out.println("");
        System.out.println("1. Guardar Módulo");
        System.out.println("2. Buscar Módulo");
        System.out.println("3. Ver todos los módulos");
        System.out.println("4. Salir");
        System.out.println("");
    }
    
     public static void pintaMenu(int opcion){
        System.out.println("");
        System.out.println("**************");
        System.out.println("**************");
        System.out.println("Dime una opción");
    }
     
     public static void pintaMenu(String opcion){
        System.out.println("");
        System.out.println("**************");
        System.out.println("**************");
        System.out.println("Con letra");
    }
    
}
