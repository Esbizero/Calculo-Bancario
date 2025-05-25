public class ContaTerminal {
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

    public void status() {
        System.out.println("Status da Conta\n");
        System.out.println("numeroAgencia: " +numeroAgencia);
        System.out.println("Agencia: "+agencia);
        System.out.println("Nome Cliente: " +nomeCliente);
        System.out.println("Saldo: "+saldo);
    }

    
}