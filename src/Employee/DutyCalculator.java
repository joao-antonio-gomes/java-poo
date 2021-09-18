package Employee;

public class DutyCalculator {
    private double duty;

    public void register(Dutiable dutiable) {
        this.duty += dutiable.getDutyValue();
    }

    public double getDuty() {
        return this.duty;
    }
}
