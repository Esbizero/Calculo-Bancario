import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da Agencia: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite a Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome (Nome Cliente): ");
        String nomecliente = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o saldo da sua conta: ");
        float saldo = scanner.nextFloat();
        scanner.nextLine();


        ContaTerminal contaTerminal = new ContaTerminal(numeroAgencia, agencia, nomecliente, saldo);

        contaTerminal.menu();
    }
}
