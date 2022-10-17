package transportadora.service.frete;

import transportadora.service.Frete;

public class GFL implements Frete {

	@Override
	public double calcularPreco(int distancia) {
		return distancia * 1 + 6;

	}

}
