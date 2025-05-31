import java.util.Scanner;

public class ContaTerminal {

    //Variaveis
    private Scanner scanner = new Scanner(System.in);
    private String opcao;
    private int numeroAgencia;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    // Construtor
    ContaTerminal(int numeroAgencia, String agencia, String nomeCliente, float saldo) {
        this.numeroAgencia = numeroAgencia;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    //Método Get e set
    public int getnumeroAgencia() {
        return numeroAgencia;
    }


    public void setnumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }


    public String getAgencia() {
        return agencia;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public float getSaldo() {
        return saldo;
    }


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }



    //Métodos

    public void menu() {
        System.out.println("Selecione alguma opção: \n");
        System.out.println("[1] Status conta");
        System.out.println("[2] Sacar saldo");
        System.out.println("[3] Depositar saldo");
        System.out.println("[4] Sair ");
        opcao = scanner.next();

        switch (opcao) {
            case "1":
                status();
                break;

            case "2":
                sacarSaldo();
                break;

            case "3":
                depositarSaldo();
                break;


            case "4":
                break;
        }
    }

    public void status() {
        System.out.println("Status da Conta\n");
        System.out.println("numeroAgencia: " +numeroAgencia);
        System.out.println("Agencia: "+agencia);
        System.out.println("Nome Cliente: " +nomeCliente);
        System.out.println("Saldo: "+saldo);

        System.out.println("Voltar ao menu? [S] [N]");
        opcao = scanner.next();
        if (opcao.equals("S")) {
            menu();
        }
        
    }

    public float sacarSaldo() {
        System.out.println("Digite o valor para sacar: ");
        float saldoSaca = scanner.nextFloat();
        if(saldoSaca >saldo) {
            System.out.println("Erro, saldo insuficiente para sacar\nSaldo atual: "+saldo);
            menu();
        }

        System.out.println("Saldo sacado: "+saldoSaca);
        saldo = saldo - saldoSaca;
        System.out.println("Saldo atual: "+saldo);
        System.out.println("\nVoltar ao menu? [S] [N]");
        opcao = scanner.next();
        if (opcao.equals("S")) {
            menu();
            return saldo;
        }
        return saldo;
    }


    public float depositarSaldo() {
        System.out.println("digite o valor para deposito: ");
        float deposito = scanner.nextFloat();
        saldo += deposito;
        System.out.println("\nVoltar ao menu? [S] [N]");
        opcao = scanner.next();
        if (opcao.equals("S")) {
            menu();
            return saldo;
        }
        return saldo;
    }
    
}