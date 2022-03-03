package patterns.nullobject;

public class ProcessaPessoa {

    public static void main(String[] args) {

        var pessoa1 = new Pessoa();
        pessoa1.setNome(null);
        pessoa1.setSobreNome("karam");
        pessoa1.setIdade(21);

        var intanciaPessoa = criaPessoa(pessoa1);

        System.out.println("NOME: " + intanciaPessoa.getNome());
        System.out.println("SOBRENOME: " + intanciaPessoa.getSobreNome());
        System.out.println("IDADE: " + intanciaPessoa.getIdade());

    }

    public static Pessoa criaPessoa(Pessoa pessoa) {
        if (pessoa != null) {
            if (pessoa.getNome() == null) {
                pessoa.setNome(new PessoaNull().getNome());
            }
            if (pessoa.getSobreNome() == null) {
                pessoa.setSobreNome(new PessoaNull().getSobreNome());
            }
            return pessoa;
        }
        return new PessoaNull();
    }
}
