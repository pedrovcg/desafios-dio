import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner terminal = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número inteiro");
        int num1 = terminal.nextInt();

        System.out.println("Digite o segundo número inteiro");
        int num2 = terminal.nextInt();

        try {
            //chamando o método
            contar(num1, num2);

        } catch (ParametrosInvalidosException e) {   
            // Mensagem de erro para exceções
            System.out.println("O segundo número deve ser maior que o primeiro");

        }
    }

    static void contar (int num1, int num2) throws ParametrosInvalidosException {

        if (num1 > num2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = num2 - num1;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo " + i);
        }
    }
}
