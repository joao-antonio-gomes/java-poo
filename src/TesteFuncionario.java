public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("João");
        g1.setSalario(1000);

        System.out.println(g1.getNome());
        System.out.println(g1.getBonificacao());
    }
}
