
//Exemplo de implementação do Factory Method

public class Main {

	public static void main(String args[]) {
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Carlos";
		String sexo = "M";
		factory.getPessoa(nome, sexo);
	}
}


/*
 * Acima criou-se uma factory com os dados acima. Baseado na condição “sexo”
 * temos a criação do objeto Homem que faz a saudação correta. Veja que toda a
 * parte de decisão, ou a sujeira, fica tudo na fábrica para que ela possa
 * decidir o que fazer.
 */