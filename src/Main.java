public class Main {
    public static void main(String[] args) {
        enum Planeta {
            MERCURIO, VENUS, TERRA, MARTE,
            JUPITER, SATURNO, URANO, NETUNO, PLUTAO;
        }
        System.out.println(Planeta.JUPITER.name());
    }
}
