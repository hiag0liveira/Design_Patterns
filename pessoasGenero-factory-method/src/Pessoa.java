
/*Segue abaixo um exemplo de implementa��o em Java utilizando o Padr�o Factory Method. 
Inicialmente define-se abaixo os produtos abstratos e concretos que ser�o usados pela factory.
*/

public abstract class Pessoa {

	public String nome;
	public String sexo;

}

class Homem extends Pessoa {

	public Homem(String nome) {
		this.nome = nome;
		System.out.println("Ol� Senhor " + this.nome);
	}
}

class Mulher extends Pessoa {

	public Mulher(String nome) {
		this.nome = nome;
		System.out.println("Ol� Senhora " + this.nome);
	}

}

/*
 * Acima temos a implementa��o da primeira parte do padr�o Factory Method. Nesse
 * exemplo criou-se os Produtos (abstratos e concretos) que executam a decis�o
 * tomada na factory.
 * 
 * Em tempo de execu��o n�o sabemos quem ser� chamado, ao inv�s de termos if�s e
 * else�s no cliente, temos toda a l�gica de decis�o na factory que � mostrada
 * abaixo.
 */