package patterns.adapter;

public class Demo {

    public static void main(String[] args) {

        SMS sms = new SMS();
        sms.setDestino("TU");
        sms.setOrigem("EU");
        sms.setTexto("SAKFJLK3J49I2304923KFOSPDKFLSVM93J485J234903K1240923KROPSDKFOSPJFGOIWESDFKLJWFOIEJ895J423985K432OIK5RWLGWSO");

        EnviaSMS enviaSMS = new EnviaSMS();
        EnviaSMSDiferenciado enviaSMSDiferenciado = new EnviaSMSDiferenciado();

        SMSAdapter adapter = new SMSAdapter(enviaSMS);
        adapter.sendSMS(sms);

        SMSAdapter adapter2 = new SMSAdapter(enviaSMSDiferenciado);
        adapter2.sendSMS(sms);
    }
}
