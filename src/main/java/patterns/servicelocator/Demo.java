package patterns.servicelocator;

import java.util.ServiceLoader;

public class Demo {

    public static void main(String[] args) {

        // Falta criar um arquivo de config pra chamar a classe desejada
        ServiceLoader<Humano> hum = ServiceLoader.load(Humano.class);
        Humano hum2 = hum.iterator().next();
        String nome = hum2.getNome();
        System.out.println(nome);
    }
}
