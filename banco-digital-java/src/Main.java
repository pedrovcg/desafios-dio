public class Main {

    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");


        Conta cc = new ContaCorrente(pedro);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(pedro);

        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}
