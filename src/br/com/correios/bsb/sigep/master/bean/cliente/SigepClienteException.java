
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5-jbossorg-1
 * 2018-10-17T11:12:43.994-03:00
 * Generated source version: 3.2.5-jbossorg-1
 */

@WebFault(name = "SigepClienteException", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
public class SigepClienteException extends java.lang.Exception {

    private java.lang.String sigepClienteException;

    public SigepClienteException() {
        super();
    }

    public SigepClienteException(String message) {
        super(message);
    }

    public SigepClienteException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SigepClienteException(String message, java.lang.String sigepClienteException) {
        super(message);
        this.sigepClienteException = sigepClienteException;
    }

    public SigepClienteException(String message, java.lang.String sigepClienteException, java.lang.Throwable cause) {
        super(message, cause);
        this.sigepClienteException = sigepClienteException;
    }

    public java.lang.String getFaultInfo() {
        return this.sigepClienteException;
    }
}
