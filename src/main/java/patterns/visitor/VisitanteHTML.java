package patterns.visitor;

public class VisitanteHTML implements FormatoVisitante {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visitarTitulo(String t) {
        sb.append(t);
    }

    @Override
    public void visitarSubTitulo(String t) {
        sb.append(t);
    }

    @Override
    public void visitarParagrafo(String t) {
        sb.append(t);
    }

    @Override
    public void visitarTabela() {
        sb.append("<table>");
    }

    @Override
    public void visitarTabelaCabecalho(String... t) {
        for (String s : t) {
            sb.append(s);
        }
    }

    @Override
    public void visitarTabelaLinha(Object... t) {
        for (Object s : t) {
            sb.append(s);
        }
    }

    @Override
    public void visitarTabelaFim() {
        sb.append("</table>");
    }

    @Override
    public void visitarImagem(String t) {
        sb.append(t);
    }

    @Override
    public Object getResultado() {
        return sb.toString();
    }
}
