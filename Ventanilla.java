/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion_paquetes.capaLogica.logicaNegocios;

import Administracion_paquetes.capaLogica.estructuras.Lista;

/**
 *
 * @author Joan
 * @param <T>
 */
public class Ventanilla<T> {
    //Atributos
    public static int numero = 0 ; 
    private int num;
    private String estado;
    private Usuario atendiendo ;
    private Lista<T> lista_usuarios;
    private Lista<T> lista_discapacitados;
    private Lista<T> lista_adultos_mayores;
    private Lista<T> lista_embarazadas;
    private Lista<T> lista_regulares;
    
    //Ventanilla para la cola de prioridad
    public Ventanilla(Lista<T> discapacitados,Lista<T> adultos_mayores,Lista<T> embarazadas,Lista<T> regulares){
       this.lista_discapacitados = discapacitados;
       this.lista_adultos_mayores =  adultos_mayores;
       this.lista_embarazadas = embarazadas;
       this.lista_regulares = regulares;
       Lista<T> lista_vacia = new Lista();
       this.lista_usuarios = lista_vacia;   
    }
    
    //Ventailla con heap
    public Ventanilla(Lista<T> usuarios){
        this.lista_usuarios = usuarios;
    }
   
   
    
    
}
