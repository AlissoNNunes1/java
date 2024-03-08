import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = input.nextInt();
        input.nextLine(); 
        System.out.println("Digite o número da Agência:");
        String agencia = input.nextLine();
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = input.nextLine();
        System.out.println("Digite o saldo atual:");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", Obrigado por criar sua conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
