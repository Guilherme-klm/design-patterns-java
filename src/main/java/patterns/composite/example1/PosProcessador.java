package patterns.composite.example1;

import java.io.IOException;

public interface PosProcessador {

    byte[] processar(byte[] bytes) throws IOException;
}
