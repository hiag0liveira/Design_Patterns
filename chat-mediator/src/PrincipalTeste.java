
public class PrincipalTeste {

	public static void main(String[] args) {
		ChatMediator chat = new ChatMediatorImplementacao(null);
		Usuario u1 = new UsuarioImplementacao("Antonio", chat);
		Usuario u2 = new UsuarioImplementacao("Bianca", chat);
		Usuario u3 = new UsuarioImplementacao("Carlos", chat);
		Usuario u4 = new UsuarioImplementacao("Daniel", chat);
		Usuario u5 = new UsuarioImplementacao("Julia", chat);
		chat.adicionarUsuario(u1);
		chat.adicionarUsuario(u2);
		chat.adicionarUsuario(u3);
		chat.adicionarUsuario(u4);
		chat.adicionarUsuario(u5);
		
		
		u1.enviarMensagem("Bom dia!!!");
	}

}
