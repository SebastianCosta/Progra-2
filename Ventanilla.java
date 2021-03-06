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
public class Ventanilla<T> {
    //Atributos

    /**
     *Esta clase sirve para que herenden otras ventanillas
     */
    public static int numero = 0 ; 
    private int num_atendidos;
    private boolean estado;
    private int     indent ;
    private Usuario atendiendo ;
    private Lista<T> lista_usuarios;
    private Lista<T> lista_discapacitados;
    private Lista<T> lista_adultos_mayores;
    private Lista<T> lista_embarazadas;
    private Lista<T> lista_regulares;

    
    
    //Metodos
    //Constructores
    //Ventanilla para la cola de prioridad

    /**
     *
     * @param discapacitados
     * @param adultos_mayores
     * @param embarazadas
     * @param regulares
     * @param tipo_ventanilla
     * @param identificador
     */
    public Ventanilla(Lista<T> discapacitados,Lista<T> adultos_mayores,Lista<T> embarazadas,Lista<T> regulares,String tipo_ventanilla, int identificador){
       super();
       this.lista_discapacitados = discapacitados;
       this.lista_adultos_mayores =  adultos_mayores;
       this.lista_embarazadas = embarazadas;
       this.lista_regulares = regulares;
       this.indent = identificador;
       Lista<T> lista_vacia = new Lista();
       this.lista_usuarios = lista_vacia;   
       this.lista_usuarios.agregar_final((T) lista_discapacitados);
       this.lista_usuarios.agregar_final((T) lista_adultos_mayores);
       this.lista_usuarios.agregar_final((T) lista_embarazadas);
       this.lista_usuarios.agregar_final((T) lista_regulares);
       this.estado = true;
    }
    
    
    //Ventailla con heap

    /**
     *
     * @param usuarios
     */
    public Ventanilla(Lista<T> usuarios){
        this.lista_usuarios = usuarios;
    }
    
    //Atendender

    /**
     *
     */
    public void atender(){
        if (this.estado == true){
            //Incrementa el numero de usuarios atendidos
            this.num_atendidos++;
            
            //Inspecciona que las listas no estan vacias
            if (lista_discapacitados.esVacia() != true){
                
                //Elimina al usuario de la lista
                atendiendo = (Usuario) lista_discapacitados.elim_final();
                
                //Indica al usuario que se esta atendiendo
                this.atendiendo = atendiendo;
                
            }
            
            else if (this.lista_adultos_mayores.esVacia() != true){
                atendiendo = (Usuario) lista_adultos_mayores.elim_final();
                this.atendiendo = atendiendo;
            }
            
            else if(this.lista_embarazadas.esVacia() != true){
                atendiendo = (Usuario) lista_embarazadas.elim_final();
                this.atendiendo = atendiendo;
            }
            else if(this.lista_regulares.esVacia() != true){
                atendiendo = (Usuario) lista_regulares.elim_final();
                this.atendiendo = atendiendo;
            }
            
            }
        //Fin del if
        else{
            this.num_atendidos--;
            System.out.print("Error, ventanilla ocupada");
        }
        }
    
    //Anteder y liberars

    /**
     *
     */
   public void liberar(){
       this.num_atendidos++;
       if (this.estado == false){
           this.estado = true;
           
       }
       System.out.print("Error, ventanilla libre");
   }
   
    /**
     *
     * @return
     */
    public boolean liberarAtender(){
        return true;
    }  

    /**
     *
     * @return
     */
    public static int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public static void setNumero(int numero) {
        Ventanilla.numero = numero;
    }

    /**
     *
     * @return
     */
    public int getNum_atendidos() {
        return num_atendidos;
    }

    /**
     *
     * @param num_atendidos
     */
    public void setNum_atendidos(int num_atendidos) {
        this.num_atendidos = num_atendidos;
    }

    /**
     *
     * @return
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public Usuario getAtendiendo() {
        return atendiendo;
    }

    /**
     *
     * @param atendiendo
     */
    public void setAtendiendo(Usuario atendiendo) {
        this.atendiendo = atendiendo;
    }

    /**
     *
     * @return
     */
    public Lista<T> getLista_usuarios() {
        return lista_usuarios;
    }

    /**
     *
     * @param lista_usuarios
     */
    public void setLista_usuarios(Lista<T> lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
    }

    /**
     *
     * @return
     */
    public Lista<T> getLista_discapacitados() {
        return lista_discapacitados;
    }

    /**
     *
     * @param lista_discapacitados
     */
    public void setLista_discapacitados(Lista<T> lista_discapacitados) {
        this.lista_discapacitados = lista_discapacitados;
    }

    /**
     *
     * @return
     */
    public Lista<T> getLista_adultos_mayores() {
        return lista_adultos_mayores;
    }

    /**
     *
     * @param lista_adultos_mayores
     */
    public void setLista_adultos_mayores(Lista<T> lista_adultos_mayores) {
        this.lista_adultos_mayores = lista_adultos_mayores;
    }

    /**
     *
     * @return
     */
    public Lista<T> getLista_embarazadas() {
        return lista_embarazadas;
    }

    /**
     *
     * @param lista_embarazadas
     */
    public void setLista_embarazadas(Lista<T> lista_embarazadas) {
        this.lista_embarazadas = lista_embarazadas;
    }

    /**
     *
     * @return
     */
    public Lista<T> getLista_regulares() {
        return lista_regulares;
    }

    /**
     *
     * @param lista_regulares
     */
    public void setLista_regulares(Lista<T> lista_regulares) {
        this.lista_regulares = lista_regulares;
    }
   
   
   
}
