import java.util.Locale;
import java.util.Scanner;

public class TerminalConta{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        int numero = scanner.nextInt();

        System.out.println("Seu saldo");
        double saldo = scanner.nextDouble();

    // imprimindo os dados:
    System.out.println("Olá," + nome + " obrigado por criar uma conta em nosso Banco. Sua agencia é " + agencia + ", conta "  + numero + ", e seu saldo " + saldo + " já esta disponivél para saque.");


        
}
}