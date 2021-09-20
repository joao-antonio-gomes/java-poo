package br.com.bytebank.bank.modelo.Employee;

public class VideoEditor extends Employee {

    public void editingVideo() {
        System.out.println("I'm editing a video");
    }

    @Override
    public double getBonus() {
        return 200;
    }
}
