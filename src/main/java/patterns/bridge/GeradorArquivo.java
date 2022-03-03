package patterns.bridge;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {

    private PosProcessador posProcessador;

    public GeradorArquivo (PosProcessador posProcessador) {
        this.posProcessador = posProcessador;
    }

    public final void geradorArquivo(String nome, Map<String, Object> propriedades) throws IOException {
        String conteudo = gerarConteudo(propriedades);
        byte[] bytes = conteudo.getBytes();
        bytes = posProcessador.processar(bytes);
        FileOutputStream fileOutputStream = new FileOutputStream(nome);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    protected abstract String gerarConteudo(Map<String, Object> propriedades);
}
