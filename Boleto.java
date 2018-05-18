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
    private String tipo;   
    private String usuario;
    private int    numero;

    public Boleto(String tipo, String usuario, int numero) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public void imprimir() {
        System.out.println("Boleto:" + tipo+ "-" + usuario+ "-" + numero);
    }
    
}
