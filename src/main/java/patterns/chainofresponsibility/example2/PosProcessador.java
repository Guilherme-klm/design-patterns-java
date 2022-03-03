package patterns.chainofresponsibility.example2;

import java.io.IOException;

public abstract class PosProcessador {

    private PosProcessador proximo;

    public PosProcessador next (PosProcessador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public byte[] processarCadeira(byte[] bytes) throws IOException {
        bytes = processar(bytes);
        return proximo.processarCadeira(bytes);
    }

    protected abstract byte[] processar(byte[] bytes) throws IOException;
}
