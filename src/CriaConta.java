import java.util.Calendar;
import java.util.Date;

public class CriaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1212, 31251);
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        conta1.setTitular(pessoa1);

        Conta conta2 = new Conta(1212, 31252);
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Marcela");
        conta2.setTitular(pessoa2);

        System.out.println(Conta.getTotalDeContas());
    }
}
