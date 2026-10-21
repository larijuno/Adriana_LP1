//A senha correta é 1234.
//Entrada: Senha digitada.
//Processamento: Comparar com a senha cadastrada.
//Saída: "Acesso permitido" ou "Acesso negado".

public class Login {

    private final String senhaCadastrada = "1234";

    boolean autenticar(String senha) {
        return senhaCadastrada.equals(senha);
    }
}
