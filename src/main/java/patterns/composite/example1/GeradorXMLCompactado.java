package patterns.composite.example1;

import patterns.bridge.GeradorArquivo;
import patterns.bridge.PosProcessador;

import java.util.Map;

public class GeradorXMLCompactado extends GeradorArquivo {

    public GeradorXMLCompactado(PosProcessador posProcessador) {
        super(posProcessador);
    }

    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();
        propFileBuilder.append("<properties>");
        for (String prop : propriedades.keySet()) {
            propFileBuilder.append("<"+prop+">" + propriedades.get(prop) + "</"+prop+">");
        }
        propFileBuilder.append("</properties>");
        return propFileBuilder.toString();
    }
}
