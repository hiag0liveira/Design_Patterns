
/*Segue abaixo um exemplo de implementação em Java utilizando o Padrão Factory Method. 
Inicialmente define-se abaixo os produtos abstratos e concretos que serão usados pela factory.
*/

public abstract class Pessoa {

	public String nome;
	public String sexo;

}

class Homem extends Pessoa {

	public Homem(String nome) {
		this.nome = nome;
		System.out.println("Olá Senhor " + this.nome);
	}
}

class Mulher extends Pessoa {

	public Mulher(String nome) {
		this.nome = nome;
		System.out.println("Olá Senhora " + this.nome);
	}

}

/*
 * Acima temos a implementação da primeira parte do padrão Factory Method. Nesse
 * exemplo criou-se os Produtos (abstratos e concretos) que executam a decisão
 * tomada na factory.
 * 
 * Em tempo de execução não sabemos quem será chamado, ao invés de termos if’s e
 * else’s no cliente, temos toda a lógica de decisão na factory que é mostrada
 * abaixo.
 */