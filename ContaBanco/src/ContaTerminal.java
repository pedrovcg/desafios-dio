import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Importar classe Scanner
        //Exibir mensagens para o usuário
        //Obter com o Scanner os valores
        //Exibir a mensagem final

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência desejada:");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, a conta da agência desejada:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo a ser depositado:");
        String saldo = scanner.next();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + " conta " + numeroAgencia + " e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
