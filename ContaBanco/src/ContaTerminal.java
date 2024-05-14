import java.util.Locale;
import java.util.Scanner;
// Importação da classe scanner.

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibição das mensagens para o usuário.
        // Obtenção dos valores digitados no terminal pelo método scanner.
        System.out.println( "Qual o número da conta?");
        int numeroConta = scanner.nextInt();

        System.out.println( "Qual o número da agência?");
        String numeroAgencia = scanner.next();

        scanner.nextLine();
        System.out.println( "Qual o nome do cliente?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Qual o saldo do cliente?");
        float saldoConta = scanner.nextFloat();

        scanner.close();

        // Exibição de mensagem de conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");

    }
}
