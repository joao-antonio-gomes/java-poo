package Employee;

public class Admin extends EmployeeAuth {

    @Override
    public double getBonus() {
        return 50;
    }
}
