package patterns.dynamicfactory;

public class GeradorArquivoXML extends GeradorArquivo {

    private PosProcessador posProcessador;

    @Override
    public void setPosProcessador(PosProcessador posProcessador) {
        this.posProcessador = posProcessador;
    }
}
