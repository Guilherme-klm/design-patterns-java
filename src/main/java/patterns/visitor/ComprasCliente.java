package patterns.visitor;

import java.util.List;

public class ComprasCliente implements Relatorio {

    private Cliente c;
    private List<Item> items;

    public ComprasCliente(Cliente c, List<Item> items) {
        this.c = c;
        this.items = items;
    }

    @Override
    public Object gerarRelatorio(FormatoVisitante fv) {
        fv.visitarTitulo(c.getNome());
        fv.visitarParagrafo(c.getCpf());
        fv.visitarParagrafo(c.getDataCadastro());
        fv.visitarTabela();
        fv.visitarTabelaCabecalho("Produto", "Data", "Valor");
        for (Item i : items) {
            fv.visitarTabelaLinha(i.getProduto(), i.getDataCompra(), i.getValor());
        }
        fv.visitarTabelaFim();
        return fv.getResultado();
    }
}
