/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenericos;

/**
 *
 * @author edmayen
 */
public class ManejoGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creamos una instancia de ClaseGenerica para Integer
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
        objetoInt.obtenerTipo();
        
        //creamos una instancia de claseGenerica para String
        //se puede utilizar la inferencia del tipo del lado derecho
        ClaseGenerica<String> objetoStr=new ClaseGenerica<>("Prueba");
        objetoStr.obtenerTipo();
        
        //los genericos no puden ser aplicados a tipos primitivos 
        //por lo que esto marcaria un error de compilacion
        //ClaseGenerica<int> intPrimitivo=new ClaseGenerica<int>(88);
        
        
    }
    
}
