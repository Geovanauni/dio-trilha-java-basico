import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Bem vindo ao Banco GL.");
        
        System.out.println("Por favor,digite o seu nome:");
        String nomecliente = scanner.next();

        System.out.println("Por favor, digite o numero da conta:");
        int numeroconta = scanner.nextInt();

        System.out.println("Agora, digite o número da agência:");
        String agencia = scanner.next();

        double saldo = 237.50;
        System.out.println("Seu saldo é: " + saldo);

        System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroconta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
