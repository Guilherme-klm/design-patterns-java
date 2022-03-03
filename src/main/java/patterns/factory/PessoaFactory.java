package patterns.factory;

public class PessoaFactory {

    public Pessoa criaPessoa(String nome, String sexo) {
        if("M".equals(sexo)) {
            return new Homem(nome);
        }
        if ("F".equals(sexo)) {
            return new Mulher(nome);
        }
        return null;
    }
}
