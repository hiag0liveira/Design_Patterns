package transportadora;

import java.util.Scanner;
import transportadora.service.Frete;
import transportadora.service.TipoFrete;

public class Exemplo {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Informe a distância: ");
			int distancia = entrada.nextInt();
			System.out.println("Qual o tipo de frete \n (1) Normal\n (2) Sedex\n (3) GFL\n (4) JadLog");
			int opcaoFrete = entrada.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
			
			Frete frete = tipoFrete.obterFrete();
			double preco = frete.calcularPreco(distancia);
			System.out.printf("O valor total é de R$%.2f", preco);
		}
	}
	
}
