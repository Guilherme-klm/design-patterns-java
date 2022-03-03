package patterns.staticfactorymethod;

import patterns.dynamicfactory.PosProcessador;

public class Criptografador implements PosProcessador {

    @Override
    public byte[] processar(byte[] bytes) {
        byte[] newBytes = new byte[bytes.length];
        for (int i=0; i < bytes.length; i++) {
            newBytes[i] = (byte) ((bytes[i] + 1) % Byte.MAX_VALUE);
        }
        return newBytes;
    }
}
