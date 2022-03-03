package patterns.chainofresponsibility.example1;

public abstract class RecuperadorArquivo {

    private RecuperadorArquivo proximo;

    public RecuperadorArquivo(RecuperadorArquivo proximo) {
        this.proximo = proximo;
    }

    public Arquivo recuperar(String name) {
        var a= recuperarArquivo(name);
        if (a == null || !a.isValido())
            return chamarProximo(name);
        else
            return a;
    }

    protected Arquivo chamarProximo(String name) {
        if (proximo == null) {
            throw new RuntimeException("Não foi possivel recuperar o arquivo: ");
        }
        return proximo.recuperar(name);
    }

    protected abstract Arquivo recuperarArquivo(String name);
}
