package patterns.observer.example1;

public class AcoesLogger implements Observador {

    @Override
    public void mudancaQuantidade(String acao, Integer qtd) {
        System.out.println("Alterada a quantidade da ação" + acao + " para " + qtd);
    }
}
