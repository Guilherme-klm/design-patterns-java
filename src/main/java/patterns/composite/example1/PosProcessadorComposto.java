package patterns.composite.example1;

import java.io.IOException;
import java.util.List;

public class PosProcessadorComposto implements PosProcessador {

    private List<PosProcessador> processadors;

    public PosProcessadorComposto(List<PosProcessador> processadors) {
        this.processadors = processadors;
    }

    @Override
    public byte[] processar(byte[] bytes) throws IOException {
        for(var p : processadors) {
            bytes = p.processar(bytes);
        }
        return bytes;
    }
}
