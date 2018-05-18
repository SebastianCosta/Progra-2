/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion_paquetes.capaLogica.estructuras;

/**
 *
 * @author Joan
 * @param <T>
 */
public class ANodoArbol<T>{
    //Atributos
    private int priporidad;
    private T contenido;
    private ANodoArbol<T> cabeza;
    private ANodoArbol<T> izquierdo;
    private ANodoArbol<T> derecho;
    
    //Constructores
    //Sin Parametro
    public ANodoArbol(){
        this.contenido = null;
        this.cabeza = null;
        this.derecho = null;
        this.izquierdo =null;
    }
    
    //Con parametro
      public ANodoArbol(T pcontenido, int pPrioridad){
        this.contenido = pcontenido;
        this.cabeza = null;
        this.izquierdo = null;
        this.derecho = null;
        this.priporidad = pPrioridad;
    }

    public int getPriporidad() {
        return priporidad;
    }

    public void setPriporidad(int priporidad) {
        this.priporidad = priporidad;
    }
    
   
    public ANodoArbol<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(ANodoArbol<T> cabeza) {
        this.cabeza = cabeza;
    }
    
    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public ANodoArbol<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(ANodoArbol<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public ANodoArbol<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(ANodoArbol<T> derecho) {
        this.derecho = derecho;
    }
    
}
