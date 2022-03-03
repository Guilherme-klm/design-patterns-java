package patterns.chainofresponsibility.example2;

public class Demo {

    public static void main(String[] args) {
        PosProcessador posProcessador = new Criptografador(5);

        posProcessador.next(new Compactador());
        posProcessador.next(new Criptografador(10));
        posProcessador.next(new Compactador());
        posProcessador.next(new Compactador());
    }
}
