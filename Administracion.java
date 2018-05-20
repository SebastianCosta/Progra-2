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
    
    public int ventanillas_percederos = 0;
    public int ventanillas_nopercederos = 0;
    public int ventanillas_seguridad = 0;
    private Lista<T> lista_ventanillas_pere = new Lista<T>();
    private Lista<T> lista_ventanillas_nopere = new Lista<T>();
    private Lista<T> lista_ventanillas_seguridad = new Lista<T>();
    private Quiosco quios = null; 
    
    
    public Administracion(Quiosco pquios){
        this.quios = pquios;
    }
    
    public void crear_vent_perecederos(int i){
        int cont = 0;
        while(i> cont){
            this.ventanillas_percederos ++;
            Ventanilla_perecederos ventana = new Ventanilla_perecederos(quios.getDiscapacitados_p(),quios.getAdulto_mayor_p(),quios.getEmbarazada_p(),quios.getRegulares_p(),"Perecederos",this.ventanillas_percederos);
            lista_ventanillas_pere.agregar_final((T) ventana);
        }
    }
    
    public void crear_vent_noperecederos(int i){
          int cont = 0;
        while(i> cont){
            this.ventanillas_nopercederos ++;
            Ventanilla_perecederos ventana = new Ventanilla_perecederos(quios.getDiscapacitados_np(),quios.getAdulto_mayor_np(),quios.getEmbarazada_np(),quios.getRegulares_np(),"No perecederos",this.ventanillas_nopercederos);
            lista_ventanillas_nopere.agregar_final((T) ventana);
        }
    }
    
    public void crear_vent_seguridad(int i){
          int cont = 0;
        while(i> cont){
            this.ventanillas_percederos ++;
            Ventanilla_perecederos ventana = new Ventanilla_perecederos(quios.getDiscapacitados_p(),quios.getAdulto_mayor_p(),quios.getEmbarazada_p(),quios.getRegulares_p(),"Perecederos",this.ventanillas_percederos);
            lista_ventanillas_pere.agregar_final((T) ventana);
        }
    }
    
    //Estadisticas de la clase
    //Estadisticas de los boletos dispensados
    public void imp_clie_aten_tipo_paquetes(){
        int cant_np = Quiosco.cant_np;
        int cant_p = Quiosco.cant_p;
        int cant_D = Quiosco.cant_D;
        int cant_M = Quiosco.cant_M;
        int cant_E = Quiosco.cant_E;
        int cant_R = Quiosco.cant_R;
        System.out.print("Cantidad total de producto no perecederos:"+cant_np+"\n"+"Cantidad total de producto perecederos:"+cant_p+"\n"+"Cantidad de boletos dispensados tipo discapacitados:"+cant_D+"\n"+"Cantidad de boletos dispensados tipo adulto mayor:"+cant_M+"\n"+"Cantidad de boletos dispensados tipo mujer embarazada:"+cant_E+"\n"+"Cantidad de boletos dispensados tipo regular:"+cant_R);
        
    }
    
    //Estadisticas de las ventanillas creadas
    public void ver_estado_colas_pere( T identificador){
        
        // Cantidad de ventanillas totales
        int cant_vent = Ventanilla.numero;
        
        // Cantidad de ventanillas perecederas
        int cant_vent_pere = Ventanilla_perecederos.numero;
        
        // Clientes atendidos no perecederos
        int cant_vent_nopere = Ventanilla_noperecederos.numero;
        
        // Clientes atendidos  perecederos
        int cant_atendidos_perecederos = Ventanilla_perecederos.clientes_atendidos_perecederos;
        
        // Clientes atendidos no perecederos
        int cant_atendidos_noperecederos = Ventanilla_noperecederos.clientes_atendidos_noperecederos;
        
        int cont = 0;
        while(this.lista_ventanillas_pere.getCabeza() != null){
            
        }
        
        
    }
    
    
    
    public Quiosco getQuios() {
        return quios;
    }

    public void setQuios(Quiosco quios) {
        this.quios = quios;
    }
    
    
}
