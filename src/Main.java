public class Main {

    public static void main(String[] args) {

        Cliente Manoel = new Cliente();
        Manoel.setNome("Manoel");

        Conta cc = new contaCorrente(Manoel);
        Conta cp = new contaPoupanca(Manoel);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
    
}
