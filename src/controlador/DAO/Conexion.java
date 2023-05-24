/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.DAO;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import java.util.Set;
/**
 *
 * @author linux
 */
public class Conexion {
    private XStream xstream;
    public static String URL="data/";
    public void conectar(){
       xstream = new XStream  (new JettisonMappedXmlDriver());
       xstream.setMode(XStream.NO_REFERENCES);
       
    }

    public XStream getXstream() {
        if(xstream==null)
            conectar();
        return xstream;
    }

    public void setXstream(XStream xstream) {
        this.xstream = xstream;
    }
    
}
