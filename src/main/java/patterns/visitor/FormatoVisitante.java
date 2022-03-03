package patterns.visitor;

public interface FormatoVisitante {
    void visitarTitulo(String t);

    void visitarSubTitulo(String t);

    void visitarParagrafo(String t);

    void visitarTabela();

    void visitarTabelaCabecalho(String... t);

    void visitarTabelaLinha(Object... t);

    void visitarTabelaFim();

    void visitarImagem(String t);

    Object getResultado();
}
