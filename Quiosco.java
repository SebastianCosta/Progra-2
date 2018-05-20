/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion_paquetes.capaLogica.logicaNegocios;
import Administracion_paquetes.capaLogica.estructuras.Lista;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
import javax.swing.JOptionPane;
/**
 *
 * @author Joan
 * @param <T>
 */
public class Quiosco<T> {    
    // Cola de discapacitados
    private Lista<T> discapacitados_p;
    // Cola de adulto_mayor
    private Lista<T> adulto_mayor_p;
    // Cola de embarazada
    private Lista<T> embarazada_p;
    // Cola de regulares
    private Lista<T> regulares_p;
    //El usuario va a ser el nodo
    private Lista<T> usuarios_p;
    
    // Cola de discapacitados
    private Lista<T> discapacitados_np;
    // Cola de adulto_mayor
    private Lista<T> adulto_mayor_np;
    // Cola de embarazada
    private Lista<T> embarazada_np;
    // Cola de regulares
    private Lista<T> regulares_np;
    //El usuario va a ser el nodo
    private Lista<T> usuarios_np;
      
    public Quiosco(){
     this.adulto_mayor_p = new Lista<T>();
     this.discapacitados_p = new Lista<T>(); 
     this.embarazada_p = new Lista<T>();
     this.regulares_p = new Lista<T>();
     this.usuarios_p = new Lista<T>();
     
     this.adulto_mayor_np = new Lista<T>();
     this.discapacitados_np = new Lista<T>(); 
     this.embarazada_np = new Lista<T>();
     this.regulares_np = new Lista<T>();
     this.usuarios_np = new Lista<T>();
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
    
    public void registrar_usuario(String pnombre, String pemail, String ptipoU, String ptipoP,String numero){
        Usuario nuevo_Usuario = new Usuario(pnombre, pemail, ptipoU, ptipoP,0,numero);
        
        if (nuevo_Usuario.getTipoP().equals("Perecedero")){
            nuevo_Usuario.setTipoP("P");
            this.codigo_p ++;
            cant_p ++;
            if (this.codigo_p >100){ 
                this.codigo_p = 0;
            }
            
            switch (nuevo_Usuario.getTipoU()) {
                case "Discapacitados":
                    {
                        nuevo_Usuario.setTipoU("D");
                        nuevo_Usuario.setPrioridad(4);
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_p,nuevo_Usuario.getPrioridad());
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados_p.agregar_inicio((T) nuevo_Boleto);
                        String SMS = nuevo_Boleto.getTipo()+ "-" + nuevo_Boleto.getUsuario()+ "-" + this.codigo_p;
                        enviarMensaje(SMS,nuevo_Usuario.getNumero());
                        nuevo_Boleto.imprimir();
                        cant_D++;
                        break;
                    }
                case "Adulto mayor":
                    {
                        nuevo_Usuario.setTipoU("M");
                        nuevo_Usuario.setPrioridad(3);
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_p,nuevo_Usuario.getPrioridad());
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.adulto_mayor_p.agregar_inicio((T) nuevo_Boleto);
                        String SMS = nuevo_Boleto.getTipo() + nuevo_Boleto.getUsuario() + this.codigo_p;
                        enviarMensaje(SMS,nuevo_Usuario.getNumero());
                        nuevo_Boleto.imprimir();
                        cant_M++;
                        break;
                    }
                case "Mujer embarazada":
                    {
                        nuevo_Usuario.setTipoU("E");
                        nuevo_Usuario.setPrioridad(2);
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_p,nuevo_Usuario.getPrioridad());
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.embarazada_p.agregar_inicio((T) nuevo_Boleto);
                        String SMS = nuevo_Boleto.getTipo() + nuevo_Boleto.getUsuario() + this.codigo_p;
                        enviarMensaje(SMS,nuevo_Usuario.getNumero());
                        nuevo_Boleto.imprimir();
                        cant_E++;
                        break;
                    }
                case "Regular":
                    {
                        nuevo_Usuario.setTipoU("R");
                        nuevo_Usuario.setPrioridad(1);
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_p,nuevo_Usuario.getPrioridad());
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.regulares_p.agregar_inicio((T) nuevo_Boleto);
                        String SMS = nuevo_Boleto.getTipo() + nuevo_Boleto.getUsuario() + this.codigo_p;
                        enviarMensaje(SMS,nuevo_Usuario.getNumero());
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
                        nuevo_Usuario.setPrioridad(4);
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_np,nuevo_Usuario.getPrioridad());
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.discapacitados_np.agregar_inicio((T) nuevo_Boleto);
                        String SMS = nuevo_Boleto.getTipo() + nuevo_Boleto.getUsuario() + this.codigo_np;
                        enviarMensaje(SMS,nuevo_Usuario.getNumero());
                        nuevo_Boleto.imprimir();
                        cant_D++;
                        break;
                    }
                case "Adulto mayor":
                    {
                        nuevo_Usuario.setTipoU("M");
                        nuevo_Usuario.setPrioridad(3);
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_np,nuevo_Usuario.getPrioridad());
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.adulto_mayor_np.agregar_inicio((T) nuevo_Boleto);
                        String SMS = nuevo_Boleto.getTipo() + nuevo_Boleto.getUsuario() + this.codigo_np;
                        enviarMensaje(SMS,nuevo_Usuario.getNumero());
                        nuevo_Boleto.imprimir();
                        cant_M++;
                        break;
                    }
                case "Mujer embarazada":
                    {
                        nuevo_Usuario.setTipoU("E");
                        nuevo_Usuario.setPrioridad(2);
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_np,nuevo_Usuario.getPrioridad());
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.embarazada_np.agregar_inicio((T) nuevo_Boleto);
                        String SMS = nuevo_Boleto.getTipo() + nuevo_Boleto.getUsuario() + this.codigo_np;
                        enviarMensaje(SMS,nuevo_Usuario.getNumero());
                        nuevo_Boleto.imprimir();
                        cant_E++;
                        break;
                    }
                case "Regular":
                    {
                        nuevo_Usuario.setTipoU("R");
                        nuevo_Usuario.setPrioridad(1);
                        Boleto nuevo_Boleto = new Boleto(nuevo_Usuario.getTipoP(),nuevo_Usuario.getTipoU(),this.codigo_np,nuevo_Usuario.getPrioridad());
                        nuevo_Usuario.setBoleto(nuevo_Boleto);
                        this.regulares_np.agregar_inicio((T) nuevo_Boleto);
                        String SMS = nuevo_Boleto.getTipo() + nuevo_Boleto.getUsuario() + this.codigo_np;
                        enviarMensaje(SMS,nuevo_Usuario.getNumero());
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
    /**
     * En esta clase es utiliza el api para enviar un msm 
     * @param tiquete
     * @param numero 
     */
    public  void enviarMensaje(String tiquete, String numero){
        
        try {
            //Info del mensaje
            String apiKey = "apikey=" + "TiMgaDCO7oQ-c6vSvfGGUeHS5IeVsmjJj48HGRbCiS";
            String message = "&message=" + "Courier TEC, su número de tiquete es: " + tiquete ;
            String sender = "&sender=" + "Courier TEC";
            String numbers = "&numbers=" + numero;

            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
            String data = apiKey + numbers + message + sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                    //stringBuffer.append(line);
                    JOptionPane.showMessageDialog(null, "Enviado" );
            }
            rd.close();

            } catch (Exception e) {
                    
    }
        
    }

    public Lista<T> getDiscapacitados_p() {
        return discapacitados_p;
    }

    public void setDiscapacitados_p(Lista<T> discapacitados_p) {
        this.discapacitados_p = discapacitados_p;
    }

    public Lista<T> getAdulto_mayor_p() {
        return adulto_mayor_p;
    }

    public void setAdulto_mayor_p(Lista<T> adulto_mayor_p) {
        this.adulto_mayor_p = adulto_mayor_p;
    }

    public Lista<T> getEmbarazada_p() {
        return embarazada_p;
    }

    public void setEmbarazada_p(Lista<T> embarazada_p) {
        this.embarazada_p = embarazada_p;
    }

    public Lista<T> getRegulares_p() {
        return regulares_p;
    }

    public void setRegulares_p(Lista<T> regulares_p) {
        this.regulares_p = regulares_p;
    }

    public Lista<T> getUsuarios_p() {
        return usuarios_p;
    }

    public void setUsuarios_p(Lista<T> usuarios_p) {
        this.usuarios_p = usuarios_p;
    }

    public Lista<T> getDiscapacitados_np() {
        return discapacitados_np;
    }

    public void setDiscapacitados_np(Lista<T> discapacitados_np) {
        this.discapacitados_np = discapacitados_np;
    }

    public Lista<T> getAdulto_mayor_np() {
        return adulto_mayor_np;
    }

    public void setAdulto_mayor_np(Lista<T> adulto_mayor_np) {
        this.adulto_mayor_np = adulto_mayor_np;
    }

    public Lista<T> getEmbarazada_np() {
        return embarazada_np;
    }

    public void setEmbarazada_np(Lista<T> embarazada_np) {
        this.embarazada_np = embarazada_np;
    }

    public Lista<T> getRegulares_np() {
        return regulares_np;
    }

    public void setRegulares_np(Lista<T> regulares_np) {
        this.regulares_np = regulares_np;
    }

    public Lista<T> getUsuarios_np() {
        return usuarios_np;
    }

    public void setUsuarios_np(Lista<T> usuarios_np) {
        this.usuarios_np = usuarios_np;
    }

    public int getCodigo_np() {
        return codigo_np;
    }

    public void setCodigo_np(int codigo_np) {
        this.codigo_np = codigo_np;
    }

    public int getCodigo_p() {
        return codigo_p;
    }

    public void setCodigo_p(int codigo_p) {
        this.codigo_p = codigo_p;
    }

    public static int getCant_np() {
        return cant_np;
    }

    public static void setCant_np(int cant_np) {
        Quiosco.cant_np = cant_np;
    }

    public static int getCant_p() {
        return cant_p;
    }

    public static void setCant_p(int cant_p) {
        Quiosco.cant_p = cant_p;
    }

    public static int getCant_D() {
        return cant_D;
    }

    public static void setCant_D(int cant_D) {
        Quiosco.cant_D = cant_D;
    }

    public static int getCant_M() {
        return cant_M;
    }

    public static void setCant_M(int cant_M) {
        Quiosco.cant_M = cant_M;
    }

    public static int getCant_E() {
        return cant_E;
    }

    public static void setCant_E(int cant_E) {
        Quiosco.cant_E = cant_E;
    }

    public static int getCant_R() {
        return cant_R;
    }

    public static void setCant_R(int cant_R) {
        Quiosco.cant_R = cant_R;
    }
    
   
    
}
