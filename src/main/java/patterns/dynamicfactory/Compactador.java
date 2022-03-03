package patterns.dynamicfactory;

import java.io.IOException;

public class Compactador implements PosProcessador {

    @Override
    public byte[] processar(byte[] bytes) throws IOException {
        return new byte[0];
    }
}
