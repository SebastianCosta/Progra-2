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
public class Ventanilla_perecederos<T> extends Ventanilla {
    public static int clientes_atendidos_perecederos = 0;
    public int perecederos_atendido = 0;
    
    public Ventanilla_perecederos(Lista<T> discapacitados, Lista<T> adultos_mayores, Lista<T> embarazadas, Lista<T> regulares,String tipo_ventanilla, int identificador) {
       super(discapacitados, adultos_mayores, embarazadas, regulares, tipo_ventanilla, identificador);
        clientes_atendidos_perecederos ++;
    }
    
}
