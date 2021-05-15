/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import accesoDatos.BarcosDAO;
import java.util.List;
import objetosNegocios.Barco;

/**
 *
 * @author miran
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hola="A2345";
        if(hola.matches("^[0-9]*$")){
            System.out.println("Yes");
        }else{
            System.out.println("YESN't");
        }
    }
    
    

}
