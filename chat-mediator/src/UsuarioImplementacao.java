
public class UsuarioImplementacao extends Usuario {

	public UsuarioImplementacao(String nome, ChatMediator mediator) {
		super(nome, mediator);
	}

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println(super.nome + "- Enviando mensagem: " + mensagem);
		super.mediator.enviarMensagemParaTodos(mensagem, this);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println(super.nome + "- Recebendo mensagem: " + mensagem);
	}
}
