/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion_paquetes.capaLogica.estructuras;

/**
 *
 * @author Joan
 */
public class ArbolBinario<T> {
    private T contenido; 
    private ANodoArbol<T> raiz;
    private ANodoArbol<T> padre;
    private ANodoArbol<T> izquierdo;
    private ANodoArbol<T> derecho;
    
    //Constructores
    
    //Arbol Binario Vacio
    public ArbolBinario(){
        this.raiz =  null;
    }
    
    /*
    public ArbolBinario(){
        this.padre = null;
        this.derecho = null;
        this.izquierdo = null;
    }
    */
    
    //Hoja del Arbol Binario 
    public ArbolBinario(T contenido, int prioridad) {
        this.contenido = contenido;
        this.padre = new ANodoArbol(contenido, prioridad);
        this.izquierdo = null;
        this.derecho = null;
    }
    // Verificar si el arbol esta vacio
    public boolean esvacio(){
        boolean vacio = true;
        
        if ( padre != null)
            vacio = false;
        return vacio;
    }
    
    //Insertar un nodo
    public void insertar (T contenido, int prioridad){
        ANodoArbol nuevo = new ANodoArbol(contenido, prioridad);
        if (raiz ==  null){
            raiz = nuevo;
        }else{
            ANodoArbol aux = raiz;
            while(true){
                padre = aux;
                if(prioridad<aux.getPriporidad()){
                    aux = aux.getIzquierdo();
                    if(aux == null){
                        padre.setIzquierdo(nuevo);
                        System.out.print("Insertado");
                        return;
                      
                    }
                }else{
                    aux = aux.getDerecho();
                    if(aux == null){
                        padre.setDerecho(nuevo);
                        System.out.print("Insertado");
                        return;
                    }
                }
        }
    }
    }
        
    //Recorrer el arbol de forma de preOrden    
    public void preOrden(ANodoArbol nodo){
        if(nodo!=null){
            System.out.println(nodo.getContenido());
            preOrden(nodo.getIzquierdo());
            preOrden(nodo.getDerecho());
        }
    }

    
    // Getters and setters de la funcion
    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public ANodoArbol<T> getPadre() {
        return padre;
    }

    public void setPadre(ANodoArbol<T> padre) {
        this.padre = padre;
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

    public ANodoArbol<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(ANodoArbol<T> raiz) {
        this.raiz = raiz;
    }
    
    
}
