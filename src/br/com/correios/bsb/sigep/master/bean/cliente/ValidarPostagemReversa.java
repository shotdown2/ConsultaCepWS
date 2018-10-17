
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validarPostagemReversa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validarPostagemReversa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cepDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCartaoPostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coleta" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}coletaReversa" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarPostagemReversa", propOrder = {
    "codAdministrativo",
    "codigoServico",
    "cepDestinatario",
    "idCartaoPostagem",
    "coleta",
    "usuario",
    "senha"
})
public class ValidarPostagemReversa {

    protected String codAdministrativo;
    protected String codigoServico;
    protected String cepDestinatario;
    protected String idCartaoPostagem;
    protected ColetaReversa coleta;
    protected String usuario;
    protected String senha;

    /**
     * Gets the value of the codAdministrativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAdministrativo() {
        return codAdministrativo;
    }

    /**
     * Sets the value of the codAdministrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAdministrativo(String value) {
        this.codAdministrativo = value;
    }

    /**
     * Gets the value of the codigoServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoServico() {
        return codigoServico;
    }

    /**
     * Sets the value of the codigoServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoServico(String value) {
        this.codigoServico = value;
    }

    /**
     * Gets the value of the cepDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepDestinatario() {
        return cepDestinatario;
    }

    /**
     * Sets the value of the cepDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepDestinatario(String value) {
        this.cepDestinatario = value;
    }

    /**
     * Gets the value of the idCartaoPostagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCartaoPostagem() {
        return idCartaoPostagem;
    }

    /**
     * Sets the value of the idCartaoPostagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCartaoPostagem(String value) {
        this.idCartaoPostagem = value;
    }

    /**
     * Gets the value of the coleta property.
     * 
     * @return
     *     possible object is
     *     {@link ColetaReversa }
     *     
     */
    public ColetaReversa getColeta() {
        return coleta;
    }

    /**
     * Sets the value of the coleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColetaReversa }
     *     
     */
    public void setColeta(ColetaReversa value) {
        this.coleta = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

}
