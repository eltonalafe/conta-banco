import java.util.Scanner;

public class ContaTerminal {
    private String nome;
    private String numeroConta;
    private String agencia;
    private double saldo;

    
    public ContaTerminal(String nome, String numeroConta, String agencia, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    
    public void exibirDetalhesDaConta() {
        System.out.println("Conta Criada com Sucesso:");
        System.out.println("Nome: " + nome);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Seu Saldo e: R$" + saldo);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o número da conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Informe a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Informe o saldo:");
        double saldo = scanner.nextDouble();

        // Criar uma instância da ContaTerminal com os dados fornecidos pelo usuario
        ContaTerminal conta = new ContaTerminal(nome, numeroConta, agencia, saldo);

        conta.exibirDetalhesDaConta();
        scanner.close();
    
    }
}