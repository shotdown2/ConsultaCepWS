
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objetoPostalPK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objetoPostalPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoEtiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plpNu" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoPostalPK", propOrder = {
    "codigoEtiqueta",
    "plpNu"
})
public class ObjetoPostalPK {

    protected String codigoEtiqueta;
    protected long plpNu;

    /**
     * Gets the value of the codigoEtiqueta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEtiqueta() {
        return codigoEtiqueta;
    }

    /**
     * Sets the value of the codigoEtiqueta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEtiqueta(String value) {
        this.codigoEtiqueta = value;
    }

    /**
     * Gets the value of the plpNu property.
     * 
     */
    public long getPlpNu() {
        return plpNu;
    }

    /**
     * Sets the value of the plpNu property.
     * 
     */
    public void setPlpNu(long value) {
        this.plpNu = value;
    }

}
