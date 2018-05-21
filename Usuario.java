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
public class Usuario {
    //Atributos de la clase Usuario
 
    //Nombre del usuario
    private String nombre;
    //Nombre del correo
    private String email;
    //Tipo de usuario
    private String tipoU;
    //Tipo de paquete
    private String tipoP;
    //Boleto asociado
    private Boleto boleto;
    
    //Numero SMS
    private String numero;
    
    //Prioridad
    private int prioridad;
    
    //Metodos

    /**
     * Constructor de la clase
     * @param pnombre
     * @param pemail
     * @param ptipoU
     * @param ptipoP
     * @param prioridad
     * @param numero
     */
    public Usuario (String pnombre, String pemail, String ptipoU, String ptipoP, int prioridad,String numero){
        this.email = pemail;
        this.nombre = pnombre;
        this.tipoP = ptipoP;
        this.tipoU = ptipoU;
        this.numero = numero;
    }
    
    //Getts an setters

    /**
     *
     * @return
     */

    public String getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
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
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getTipoU() {
        return tipoU;
    }

    /**
     *
     * @param tipoU
     */
    public void setTipoU(String tipoU) {
        this.tipoU = tipoU;
    }

    /**
     *
     * @return
     */
    public String getTipoP() {
        return tipoP;
    }

    /**
     *
     * @param tipoP
     */
    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    /**
     *
     * @return
     */
    public Boleto getBoleto() {
        return boleto;
    }

    /**
     *
     * @param boleto
     */
    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }
    
   
   
   
    
}
