package patterns.observer.example3;

public class Demo {

    public static void main(String[] args) {
        PessoaService service = new PessoaService();
        service.addPessoa("Guilherme");
        service.addPessoa("Nydia");
        service.addPessoa("Guilherme");
        service.addPessoa("Andrea");
    }
}
