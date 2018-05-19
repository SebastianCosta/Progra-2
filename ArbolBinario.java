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
    
    // Eliminar un nodo del arbol
    public boolean eliminar(T buscar){
        ANodoArbol aux = raiz;
        ANodoArbol padre = raiz;
        boolean esHijoIzq = true;
        while(aux.getContenido() != buscar){
            padre = aux;
            if(buscar != aux.getContenido()){
                esHijoIzq = true;
                aux = aux.getIzquierdo();
            }else{
                esHijoIzq = false;
                aux = aux.getDerecho();
            }
            if(aux == null){
                return false;
            }
        }// Fin del While
        if(aux.getIzquierdo() == null && aux.getDerecho() == null){
            if(aux == raiz){
                raiz = null;
            } else if (esHijoIzq){
                padre.setIzquierdo(null);
            }else{
                padre.setDerecho(null);
            }
            
            } else if (aux.getDerecho() == null){
                if(aux == raiz){
                raiz = aux.getIzquierdo();
            } else if (esHijoIzq){
                padre.setIzquierdo(aux.getIzquierdo());
            }else{
                padre.setDerecho(aux.getIzquierdo());
            }
                
            }else if(aux.getIzquierdo() == null){
                if(aux == raiz){
                raiz = aux.getDerecho();
            } else if (esHijoIzq){
                padre.setIzquierdo(aux.getDerecho());
            }else{
                padre.setDerecho(aux.getIzquierdo());
            }
            }else{
                ANodoArbol nuevo = reemplazar(aux);
                if(aux == raiz){
                    raiz = nuevo;
                }else if (esHijoIzq){
                    padre.setIzquierdo(nuevo);
                }else{
                    padre.setDerecho(nuevo);
                }
                nuevo.setIzquierdo(aux.getIzquierdo());
            }
        return true;
    }
    
    // Metodo reemplazar
    public ANodoArbol reemplazar(ANodoArbol preemplazo){
        ANodoArbol reemplazo_Padre = preemplazo;
        ANodoArbol reemplazo = preemplazo;
        ANodoArbol aux =preemplazo.getDerecho();
        while(aux != null){
            reemplazo_Padre = preemplazo;
            reemplazo = aux;
            aux = aux.getIzquierdo();
        }
        if (reemplazo != preemplazo.getDerecho()){
            reemplazo_Padre.setIzquierdo(reemplazo.getDerecho());
            reemplazo.setDerecho(preemplazo.getDerecho());
        }
        System.out.println("El Nodo Reemplazo: " + reemplazo);
        return reemplazo.getCabeza();
        
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
