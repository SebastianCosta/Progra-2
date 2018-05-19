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

public class Administracion <T> {
    private Quiosco quios = null; 
    
    public Administracion(Quiosco pquios){
        this.quios = pquios;
    }
    
    //Estadisticas de la clase
    public void imp_clie_aten_tipo_paquetes(){
        int cant_np = Quiosco.cant_np;
        int cant_p = Quiosco.cant_p;
        int cant_D = Quiosco.cant_D;
        int cant_M = Quiosco.cant_M;
        int cant_E = Quiosco.cant_E;
        int cant_R = Quiosco.cant_R;
        System.out.print("Cantidad total de producto no perecederos:"+cant_np+"\n"+"Cantidad total de producto perecederos:"+cant_p+"\n"+"Cantidad de boletos dispensados tipo discapacitados:"+cant_D+"\n"+"Cantidad de boletos dispensados tipo adulto mayor:"+cant_M+"\n"+"Cantidad de boletos dispensados tipo mujer embarazada:"+cant_E+"\n"+"Cantidad de boletos dispensados tipo regular:"+cant_R);
        
    }
    
    

    public Quiosco getQuios() {
        return quios;
    }

    public void setQuios(Quiosco quios) {
        this.quios = quios;
    }
    
    
}
