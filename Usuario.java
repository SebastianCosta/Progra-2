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
    
    //Metodos
    public Usuario (String pnombre, String pemail, String ptipoU, String ptipoP){
        this.email = pemail;
        this.nombre = pnombre;
        this.tipoP = ptipoP;
        this.tipoU = ptipoU;
    }
    

    //Getts an setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoU() {
        return tipoU;
    }

    public void setTipoU(String tipoU) {
        this.tipoU = tipoU;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }
    
   
   
   
    
}
