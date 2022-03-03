package patterns.templatemethod;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainExecutavel {

    public static void main(String[] args) throws IOException {
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("chave", new Object());
        objectMap.put("chave2", new Object());
        objectMap.put("chave3", new Object());

        GeradorXMLCompactado geradorXMLCompactado = new GeradorXMLCompactado();
        geradorXMLCompactado.geradorArquivo("arquivo aleatorio", objectMap);

        GeradorPropriedadesCriptografado propriedadesCriptografado = new GeradorPropriedadesCriptografado(5);
        propriedadesCriptografado.geradorArquivo("arquivo criptografado", objectMap);
    }
}
