import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
             //criando o objeto scanner
        try (
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                
            System.out.println("Por favor, digite o número da conta:");
            int conta = scanner.nextInt();
            
            System.out.println("Por favor, digite o número da Agência:");
            int agencia = scanner.nextInt();
            
            System.out.println("Primeiro nome do cliente:");
            String nomeCliente = scanner.next();
            
            System.out.println("Saldo da conta:");
            double saldo = scanner.nextDouble();

             //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: " + conta + " e seu saldo é R$" + saldo + " o qual já está disponível para saque.");
        } 
        
        
    }
}
