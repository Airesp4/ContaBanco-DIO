import java.util.Scanner;

public class ContaTerminal {
    static class Conta {
        private int numeroConta;
        private String agencia;
        private String nomeCliente;
        private Double saldo;

        public Conta(int numeroConta, String agencia, String nomeCliente, Double saldo) {
            this.numeroConta = numeroConta;
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }
    }
    public static void main(String[] args) {
        Conta novaConta = criarUsuario();
        exibirInfo(novaConta);
    }

    static Conta criarUsuario(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite a agência da conta: ");
        String agencia = teclado.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = teclado.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = teclado.nextDouble();
        teclado.nextLine();

        teclado.close();
        return new Conta(numeroConta, agencia, nomeCliente, saldo);
    }

    static void exibirInfo(Conta conta){
        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, "+
        "sua agência é " + conta.agencia + ", conta " + conta.numeroConta + " e seu saldo " + conta.saldo +" já está disponível para saque.");
    }
}
