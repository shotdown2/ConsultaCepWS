
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicoSigep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicoSigep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="categoriaServico" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}categoriaServico" minOccurs="0"/&gt;
 *         &lt;element name="chancela" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}chancelaMaster" minOccurs="0"/&gt;
 *         &lt;element name="exigeDimensoes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="exigeValorCobrar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="imitm" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pagamentoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remessaAgrupada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="servicoERP" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}servicoERP" minOccurs="0"/&gt;
 *         &lt;element name="ssiCoCodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicoSigep", propOrder = {
    "categoriaServico",
    "chancela",
    "exigeDimensoes",
    "exigeValorCobrar",
    "imitm",
    "pagamentoEntrega",
    "remessaAgrupada",
    "servico",
    "servicoERP",
    "ssiCoCodigoPostal"
})
public class ServicoSigep {

    @XmlSchemaType(name = "string")
    protected CategoriaServico categoriaServico;
    protected ChancelaMaster chancela;
    protected Boolean exigeDimensoes;
    protected Boolean exigeValorCobrar;
    protected long imitm;
    protected String pagamentoEntrega;
    protected String remessaAgrupada;
    protected long servico;
    protected ServicoERP servicoERP;
    protected String ssiCoCodigoPostal;

    /**
     * Gets the value of the categoriaServico property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaServico }
     *     
     */
    public CategoriaServico getCategoriaServico() {
        return categoriaServico;
    }

    /**
     * Sets the value of the categoriaServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaServico }
     *     
     */
    public void setCategoriaServico(CategoriaServico value) {
        this.categoriaServico = value;
    }

    /**
     * Gets the value of the chancela property.
     * 
     * @return
     *     possible object is
     *     {@link ChancelaMaster }
     *     
     */
    public ChancelaMaster getChancela() {
        return chancela;
    }

    /**
     * Sets the value of the chancela property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChancelaMaster }
     *     
     */
    public void setChancela(ChancelaMaster value) {
        this.chancela = value;
    }

    /**
     * Gets the value of the exigeDimensoes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExigeDimensoes() {
        return exigeDimensoes;
    }

    /**
     * Sets the value of the exigeDimensoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExigeDimensoes(Boolean value) {
        this.exigeDimensoes = value;
    }

    /**
     * Gets the value of the exigeValorCobrar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExigeValorCobrar() {
        return exigeValorCobrar;
    }

    /**
     * Sets the value of the exigeValorCobrar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExigeValorCobrar(Boolean value) {
        this.exigeValorCobrar = value;
    }

    /**
     * Gets the value of the imitm property.
     * 
     */
    public long getImitm() {
        return imitm;
    }

    /**
     * Sets the value of the imitm property.
     * 
     */
    public void setImitm(long value) {
        this.imitm = value;
    }

    /**
     * Gets the value of the pagamentoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagamentoEntrega() {
        return pagamentoEntrega;
    }

    /**
     * Sets the value of the pagamentoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagamentoEntrega(String value) {
        this.pagamentoEntrega = value;
    }

    /**
     * Gets the value of the remessaAgrupada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemessaAgrupada() {
        return remessaAgrupada;
    }

    /**
     * Sets the value of the remessaAgrupada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemessaAgrupada(String value) {
        this.remessaAgrupada = value;
    }

    /**
     * Gets the value of the servico property.
     * 
     */
    public long getServico() {
        return servico;
    }

    /**
     * Sets the value of the servico property.
     * 
     */
    public void setServico(long value) {
        this.servico = value;
    }

    /**
     * Gets the value of the servicoERP property.
     * 
     * @return
     *     possible object is
     *     {@link ServicoERP }
     *     
     */
    public ServicoERP getServicoERP() {
        return servicoERP;
    }

    /**
     * Sets the value of the servicoERP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicoERP }
     *     
     */
    public void setServicoERP(ServicoERP value) {
        this.servicoERP = value;
    }

    /**
     * Gets the value of the ssiCoCodigoPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsiCoCodigoPostal() {
        return ssiCoCodigoPostal;
    }

    /**
     * Sets the value of the ssiCoCodigoPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsiCoCodigoPostal(String value) {
        this.ssiCoCodigoPostal = value;
    }

}
