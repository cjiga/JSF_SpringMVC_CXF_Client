
package edu.upc.webservice.genero.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import edu.upc.webservice.genero.service.impl.GeneroServiceImplService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-01-20T11:27:00.027-05:00
 * Generated source version: 2.7.2
 * 
 */
public final class GeneroService_GeneroServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://impl.service.genero.webservice.upc.edu/", "GeneroServiceImplService");

    private GeneroService_GeneroServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GeneroServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        GeneroServiceImplService ss = new GeneroServiceImplService(wsdlURL, SERVICE_NAME);
        GeneroService port = ss.getGeneroServiceImplPort();  
        
        {
        System.out.println("Invoking save...");
        edu.upc.webservice.genero.service.Genero _save_arg0 = new edu.upc.webservice.genero.service.Genero();
        _save_arg0.setDescripcion("Descripcion1519951051");
        _save_arg0.setEstado(Integer.valueOf(-880589626));
        _save_arg0.setFechaCreacion(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-01-20T11:27:00.069-05:00"));
        _save_arg0.setFechaModificacion(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-01-20T11:27:00.071-05:00"));
        _save_arg0.setIdGenero(Integer.valueOf(-2105675233));
        _save_arg0.setUsuarioCreacion(Integer.valueOf(1667519636));
        _save_arg0.setUsuarioModificacion(Integer.valueOf(-353963782));
        int _save__return = port.save(_save_arg0);
        System.out.println("save.result=" + _save__return);


        }
        {
        System.out.println("Invoking delete...");
        edu.upc.webservice.genero.service.Genero _delete_arg0 = new edu.upc.webservice.genero.service.Genero();
        _delete_arg0.setDescripcion("Descripcion1633935834");
        _delete_arg0.setEstado(Integer.valueOf(1819688350));
        _delete_arg0.setFechaCreacion(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-01-20T11:27:00.075-05:00"));
        _delete_arg0.setFechaModificacion(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-01-20T11:27:00.076-05:00"));
        _delete_arg0.setIdGenero(Integer.valueOf(-1233737787));
        _delete_arg0.setUsuarioCreacion(Integer.valueOf(607011798));
        _delete_arg0.setUsuarioModificacion(Integer.valueOf(844551889));
        int _delete__return = port.delete(_delete_arg0);
        System.out.println("delete.result=" + _delete__return);


        }
        {
        System.out.println("Invoking update...");
        edu.upc.webservice.genero.service.Genero _update_arg0 = new edu.upc.webservice.genero.service.Genero();
        _update_arg0.setDescripcion("Descripcion75700140");
        _update_arg0.setEstado(Integer.valueOf(-14657975));
        _update_arg0.setFechaCreacion(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-01-20T11:27:00.077-05:00"));
        _update_arg0.setFechaModificacion(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2013-01-20T11:27:00.077-05:00"));
        _update_arg0.setIdGenero(Integer.valueOf(-1250770288));
        _update_arg0.setUsuarioCreacion(Integer.valueOf(2118301677));
        _update_arg0.setUsuarioModificacion(Integer.valueOf(1021080793));
        int _update__return = port.update(_update_arg0);
        System.out.println("update.result=" + _update__return);


        }
        {
        System.out.println("Invoking getGenero...");
        java.lang.Integer _getGenero_arg0 = Integer.valueOf(-1720820881);
        edu.upc.webservice.genero.service.Genero _getGenero__return = port.getGenero(_getGenero_arg0);
        System.out.println("getGenero.result=" + _getGenero__return);


        }
        {
        System.out.println("Invoking getAll...");
        java.util.List<edu.upc.webservice.genero.service.Genero> _getAll__return = port.getAll();
        System.out.println("getAll.result=" + _getAll__return);


        }

        System.exit(0);
    }

}
