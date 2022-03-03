package patterns.chainofresponsibility.example1;

import java.util.HashMap;
import java.util.Map;

public class RecuperadorCacheMemoria extends RecuperadorArquivo {

    private Map<String, Arquivo> cache = new HashMap<>();

    public RecuperadorCacheMemoria(RecuperadorArquivo proximo) {
        super(proximo);
    }

    @Override
    protected Arquivo recuperarArquivo(String name) {
        if (cache.containsKey(name)) {
            return cache.get(name);
        }
        return null;
    }

    @Override
    protected Arquivo chamarProximo(String name) {
        var a = super.chamarProximo(name);
        cache.put(name, a);
        return a;
    }
}
