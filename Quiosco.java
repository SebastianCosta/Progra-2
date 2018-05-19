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
public class Quiosco<T> {    
    // Cola de discapacitados
    private Lista<T> discapacitados;
    // Cola de adulto_mayor
    private Lista<T> adulto_mayor;
    // Cola de embarazada
    private Lista<T> embarazada;
    // Cola de regulares
    private Lista<T> regulares;
    //El usuario va a ser el nodo
    private Lista<T> usuarios;
    
    public Quiosco(){
     this.adulto_mayor = new Lista<T>();
     this.discapacitados = new Lista<T>(); 
     this.embarazada = new Lista<T>();
     this.regulares = new Lista<T>();
     this.usuarios = new Lista<T>();
    }
    
    // Variable que asigna el número consecutivo en el boleto de No Perecederos
    public int codigo_np = -1;
    
    // Variable que asigna el número consecutivo en el boleto de Perecederos
    public int codigo_p = -1;
    
     // Variable que asigna el número consecutivo en el boleto de No Perecederos
    public static int cant_np = 0;
    
    // Variable que asigna el número consecutivo en el boleto de Perecederos
     public static int cant_p = 0;
     
     // cantidad de boletos dispensados para discapacitados
     public static int cant_D = 0;
     
     //cantidad de boletos dispensados para adultos mayores
     public static int cant_M = 0;
     
     //cantidad de boletos dispensados para mujeres embarazadas
     public static int cant_E = 0;
     
     //cantidad de boletos dispensados para regulares
     public static int cant_R = 0;
    
    public void registrar_usuario(String pnombre, String pemail, String ptipoU, String ptipoP){
        Usuario nuevo_Usuario = new Usuario(pnombre, pemail, ptipoU, ptipoP);
        
        if (nuevo_Usuario.getTipoP().equals("Perecedero")){
            nuevo_Usuario.setTipoP("P");
            this.codigo_p ++;
            cant_p ++;
            if (this.codigo_np >100){ 
                this.codigo_np = 0;
            }
            
            switch (nuevo_Usuario.getTipoU()) {
                case "Discapacitados":
                    {
                        nuevo_Usuario.setTipoU("D");
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_p);
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados.agregar_inicio((T) nuevo_Boleto);
                        nuevo_Boleto.imprimir();
                        cant_D++;
                        break;
                    }
                case "Adulto mayor":
                    {
                        nuevo_Usuario.setTipoU("M");
                        nuevo_Usuario.setTipoU("M");
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_p);
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados.agregar_inicio((T) nuevo_Boleto);
                        nuevo_Boleto.imprimir();
                        cant_M++;
                        break;
                    }
                case "Mujer embarazada":
                    {
                        nuevo_Usuario.setTipoU("E");
                        nuevo_Usuario.setTipoU("E");
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_p);
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados.agregar_inicio((T) nuevo_Boleto);
                        nuevo_Boleto.imprimir();
                        cant_E++;
                        break;
                    }
                case "Regular":
                    {
                        nuevo_Usuario.setTipoU("R");
                        nuevo_Usuario.setTipoU("R");
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_p);
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados.agregar_inicio((T) nuevo_Boleto);
                        nuevo_Boleto.imprimir();
                        cant_R++;
                        break;
                    }
                default:
                    System.out.print("Error");
                    break;
            }
   
    }
        else if (nuevo_Usuario.getTipoP().equals("No perecedero")){
            nuevo_Usuario.setTipoP("NP");
            this.codigo_np ++;
            cant_np ++;
            if (this.codigo_np >100){ 
                this.codigo_np = 0;
            }
            
            switch (nuevo_Usuario.getTipoU()) {
                case "Discapacitados":
                    {
                        nuevo_Usuario.setTipoU("D");
                        nuevo_Usuario.setTipoU("D");
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_np);
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados.agregar_inicio((T) nuevo_Boleto);
                        nuevo_Boleto.imprimir();
                        cant_D++;
                        break;
                    }
                case "Adulto mayor":
                    {
                        nuevo_Usuario.setTipoU("M");
                        nuevo_Usuario.setTipoU("M");
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_np);
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados.agregar_inicio((T) nuevo_Boleto);
                        nuevo_Boleto.imprimir();
                        cant_M++;
                        break;
                    }
                case "Mujer embarazada":
                    {
                        nuevo_Usuario.setTipoU("E");
                        nuevo_Usuario.setTipoU("E");
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_np);
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados.agregar_inicio((T) nuevo_Boleto);
                        nuevo_Boleto.imprimir();
                        cant_E++;
                        break;
                    }
                case "Regular":
                    {
                        nuevo_Usuario.setTipoU("R");
                        nuevo_Usuario.setTipoU("R");
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_np);
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados.agregar_inicio((T) nuevo_Boleto);
                        nuevo_Boleto.imprimir();
                        cant_R++;
                        break;
                    }
                default:
                    System.out.print("Error");
                    break;
            }
            
        }
    }
    
    public Lista<T> getDiscapacitados() {
        return discapacitados;
    }

    public void setDiscapacitados(Lista<T> discapacitados) {
        this.discapacitados = discapacitados;
    }

    public Lista<T> getAdulto_mayor() {
        return adulto_mayor;
    }

    public void setAdulto_mayor(Lista<T> adulto_mayor) {
        this.adulto_mayor = adulto_mayor;
    }

    public Lista<T> getEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(Lista<T> embarazada) {
        this.embarazada = embarazada;
    }

    public Lista<T> getRegulares() {
        return regulares;
    }

    public void setRegulares(Lista<T> regulares) {
        this.regulares = regulares;
    }

    public Lista<T> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Lista<T> usuarios) {
        this.usuarios = usuarios;
    }
    
    
}
