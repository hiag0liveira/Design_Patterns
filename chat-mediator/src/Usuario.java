
public abstract class Usuario {
	
	protected String nome;
	protected ChatMediator mediator;
	
	public Usuario(String nome, ChatMediator mediator) {
		this.nome = nome;
		this.mediator = mediator;
	}
	
	public abstract void enviarMensagem(String mensagem);
	
	public abstract void receberMensagem(String mensagem);
	
	
}
