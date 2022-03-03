package patterns.factory;

public class TesteFactory {

    public static void main(String[] args) {
        PessoaFactory factory = new PessoaFactory();
        Pessoa pessoa = factory.criaPessoa("Kips", "F");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getSexo());
    }
}
