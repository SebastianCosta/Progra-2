/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion_paquetes.capaLogica.logicaNegocios;

/**
 *
 * @author Joan
 */
public class Boleto {
    //Atributos de la clase 
    private String tipo;   
    private String usuario;
    private int    numero;
    private int    prioridad;

    /**
     *Constructor
     * @param tipo
     * @param usuario
     * @param numero
     * @param prioridad
     */
    public Boleto(String tipo, String usuario, int numero, int prioridad) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.numero = numero;
        this.prioridad = prioridad;
    }
    
    //Getts y Settes

    /**
     *
     * @return
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     *
     * @param prioridad
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     *
     */
    public void imprimir() {
        System.out.println("Boleto:" + tipo+ "-" + usuario+ "-" + numero);
    }
    
}
