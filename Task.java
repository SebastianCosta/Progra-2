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
import Administracion_paquetes.capaLogica.logicaNegocios.Usuario;

/**
 *Clase Task que determina la prioridad de cada objeto 
 * y almacena el objeto 
 * 
 */
public class Task{
    private Usuario job;
    private int priority;
    
    /** Constructor **/
    /**
     * Metodo constructor de la clase 
     * @param job
     * @param priority 
     */
    public Task(Usuario job, int priority){
        this.job = job;
        this.priority = priority; 
    }
    /**
     * realiza el string de la clase
     */
    public String toString() {
        return "Job Name : "+ job +"\nPriority : "+ priority;
    }
    /**
     * Para optener el task 
     * @return un objeto de tipo Usuario 
     */
    public Usuario getTask(){
        return this.job;
    }   
    /**
     * Busca la prioridad 
     * @return la prioridad 
     */
    public int getPrioridad(){
        return this.priority;
    }
    /**
     * Busca el usuario 
     * @return el atributo job 
     */
    public Usuario getUsuario(){
        return this.job;
    }
}
