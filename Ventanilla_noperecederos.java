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
public class Ventanilla_noperecederos<T> extends Ventanilla {
    
    /**
     *
     */
    public static int clientes_atendidos_noperecederos = 0;

    /**
     *
     */
    public int noperecederos_atendido = 0;
    
    /**
     *
     * @param discapacitados
     * @param adultos_mayores
     * @param embarazadas
     * @param regulares
     * @param tipo_ventanilla
     * @param identificador
     */
    public Ventanilla_noperecederos(Lista<T> discapacitados, Lista<T> adultos_mayores, Lista<T> embarazadas, Lista<T> regulares,String tipo_ventanilla, int identificador) {
        super(discapacitados, adultos_mayores, embarazadas, regulares, tipo_ventanilla, identificador);
        clientes_atendidos_noperecederos ++;
    }
    
}
    

