package transportadora.service.frete;

import transportadora.service.Frete;

public class JadLog implements Frete {

	@Override
	public double calcularPreco(int distancia) {
		return distancia * 2.3 + 6;
	}

}
