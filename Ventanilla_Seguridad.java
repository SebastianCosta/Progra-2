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
 */
public class Ventanilla_Seguridad extends Ventanilla{
    
    /**
     *
     * @param discapacitados
     * @param adultos_mayores
     * @param embarazadas
     * @param regulares
     * @param tipo_ventanilla
     * @param identificador
     */
    public Ventanilla_Seguridad(Lista discapacitados, Lista adultos_mayores, Lista embarazadas, Lista regulares,String tipo_ventanilla, int identificador) {
        super(discapacitados, adultos_mayores, embarazadas, regulares, tipo_ventanilla, identificador);
    }
    
}
