public class Conta {
    private double saldo;
    private int agencia = 42;
    private int numero;
    private Pessoa titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public static int getTotalDeContas() {
        return total;
    }

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("O saldo da conta do " + this.getTitular().getNome() +
                " é de R$ " + this.getSaldo());
    }

    public boolean saca(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            valor = this.saldo - valor;
            this.saldo = valor;
            return true;
        }
        return false;
    }
    
    public boolean transfere(Conta contaDestino, double valor) {
        if (this.saca(valor)) {
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }
}
