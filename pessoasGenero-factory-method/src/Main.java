
//Exemplo de implementa��o do Factory Method

public class Main {

	public static void main(String args[]) {
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Carlos";
		String sexo = "M";
		factory.getPessoa(nome, sexo);
	}
}


/*
 * Acima criou-se uma factory com os dados acima. Baseado na condi��o �sexo�
 * temos a cria��o do objeto Homem que faz a sauda��o correta. Veja que toda a
 * parte de decis�o, ou a sujeira, fica tudo na f�brica para que ela possa
 * decidir o que fazer.
 */