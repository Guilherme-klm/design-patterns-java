package patterns.chainofresponsibility.example2;

public class PosProcessadorNulo extends PosProcessador {

    @Override
    protected byte[] processar(byte[] bytes) {
        return null;
    }
}
