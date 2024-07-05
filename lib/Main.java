public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jose da Silva");

        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(75);

        Conta poupanca = new ContaPoupanca(cliente1);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
