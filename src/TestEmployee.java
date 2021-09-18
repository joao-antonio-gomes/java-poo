public class TestEmployee {
    public static void main(String[] args) {
        Manager g1 = new Manager();
        g1.setName("João");
        g1.setPayment(1000);

        System.out.println(g1.getName());
        System.out.println(g1.getBonification());
    }
}
