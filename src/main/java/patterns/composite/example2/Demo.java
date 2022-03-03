package patterns.composite.example2;

public class Demo {
    public static void main(String[] args) {
        TrechoSimples ts1 = new TrechoSimples("Sao Paulo", "Brasilia", 500);
        TrechoSimples ts2 = new TrechoSimples("Brasilia", "Recife", 300);
        TrechoSimples ts3 = new TrechoSimples("Recife", "Natal", 500);
        TrechoComposto tc1 = new TrechoComposto(ts2, ts3, 30);
        TrechoComposto tc2 = new TrechoComposto(ts1, tc1, 50);
        System.out.println(tc2.getOrigem());
        System.out.println(tc2.getDestino());
        System.out.println(tc2.getPreco());
    }
}
