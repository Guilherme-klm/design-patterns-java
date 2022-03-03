package patterns.nullobject;

public class PessoaNull extends Pessoa {

    @Override
    public String getNome() {
        return "sem nome";
    }

    @Override
    public String getSobreNome() {
        return "sem sobre nome";
    }

    @Override
    public int getIdade() {
        return 0;
    }
}
