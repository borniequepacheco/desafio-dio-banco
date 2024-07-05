public class Main {
    public static void main(String[] args) {
        Cliente client = new Cliente();
        client.setNome("Jose da Silva");

        Conta cc = new ContaCorrente(client);
        cc.depositar(75);

        Conta poupanca = new ContaPoupanca(client);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
