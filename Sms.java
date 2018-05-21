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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
import javax.swing.JOptionPane;

/**
 *Clase para enviar un mensaje de texto 
 * a el usuario 
 */
public class Sms{
    public Sms(){
        
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
}
