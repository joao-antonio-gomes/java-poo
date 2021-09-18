public class TestAccount {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount(111, 111);
        ca.deposit(100);

        DepositAccount da = new DepositAccount(222, 222);
        da.deposit(200);

        System.out.println(ca.getFunds());
        System.out.println(da.getFunds());
    }
}
