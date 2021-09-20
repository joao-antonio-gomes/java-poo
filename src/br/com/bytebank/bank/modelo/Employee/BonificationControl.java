package br.com.bytebank.bank.modelo.Employee;

public class BonificationControl {
    private double total;

    public void registerBonus(Employee employee) {
        this.total += employee.getBonus();
    }

    public double getTotal() {
        return total;
    }
}
