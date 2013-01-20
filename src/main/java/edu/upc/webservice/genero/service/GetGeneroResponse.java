
package edu.upc.webservice.genero.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGeneroResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGeneroResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getGenero" type="{http://service.genero.webservice.upc.edu/}genero" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeneroResponse", propOrder = {
    "getGenero"
})
public class GetGeneroResponse {

    protected Genero getGenero;

    /**
     * Gets the value of the getGenero property.
     * 
     * @return
     *     possible object is
     *     {@link Genero }
     *     
     */
    public Genero getGetGenero() {
        return getGenero;
    }

    /**
     * Sets the value of the getGenero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Genero }
     *     
     */
    public void setGetGenero(Genero value) {
        this.getGenero = value;
    }

}
