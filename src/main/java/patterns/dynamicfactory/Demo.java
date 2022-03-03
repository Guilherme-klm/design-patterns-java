package patterns.dynamicfactory;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        FabricaDinamica fabricaDinamica = new FabricaDinamica("prop");

        GeradorArquivo geradorArquivo = fabricaDinamica.criaImplementacao(GeradorArquivo.class);
        geradorArquivo.setPosProcessador(fabricaDinamica.criaImplementacao(PosProcessador.class));
    }
}
