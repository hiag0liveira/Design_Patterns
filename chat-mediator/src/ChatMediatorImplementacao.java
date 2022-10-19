import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImplementacao implements ChatMediator{

	private List<Usuario> usuarios;
	
	public ChatMediatorImplementacao(List<Usuario> usuarios) {
		this.usuarios = new ArrayList<Usuario>();
	}

	@Override
	public void enviarMensagemParaTodos(String mensagem, Usuario user) {
		for(Usuario u: this.usuarios) {
			if(u != user) {
				u.receberMensagem(mensagem);
			}
		}
	}

	@Override
	public void adicionarUsuario(Usuario user) {
		usuarios.add(user);
	
	}

}
