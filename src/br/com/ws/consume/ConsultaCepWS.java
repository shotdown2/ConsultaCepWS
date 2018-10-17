package br.com.ws.consume;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;

public class ConsultaCepWS {

	public static void main(String[] args) {

		try {
			AtendeClienteService service = new AtendeClienteService();
			AtendeCliente port = service.getAtendeClientePort();

			EnderecoERP result = port.consultaCEP("20530000");
			System.out.println(result.getEnd());
			System.out.println(result.getBairro());
			System.out.println(result.getCidade());
		} catch (SQLException_Exception e) {

			e.printStackTrace();
		} catch (SigepClienteException e) {

			e.printStackTrace();
		}

	}

}
