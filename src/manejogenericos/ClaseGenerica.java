/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenericos;

/**
 *
 * @author edmayen
 * @param <T>
 */
public class ClaseGenerica<T> 
{
    //definimos una clase con el operador diamante <>
    T objeto;
    
    //constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto)
    {
        this.objeto=objeto;
    }
    
    public void obtenerTipo()
    {
        System.out.println("El tipo T es: " + objeto.getClass().getName());
    }
}
