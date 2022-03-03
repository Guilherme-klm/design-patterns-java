package patterns.bridge;

import java.util.Map;

public class GeradorPropriedadesCriptografado extends GeradorArquivo {

    public GeradorPropriedadesCriptografado(PosProcessador posProcessador) {
        super(posProcessador);
    }

    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();
        for (String prop : propriedades.keySet()) {
            propFileBuilder.append(prop + "=" + propriedades.get(prop) + "\n");
        }
        return propFileBuilder.toString();
    }
}
