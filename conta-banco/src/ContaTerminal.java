import java.util.Scanner;

public class ContaTerminal 
{
        public static void main(String[] args) throws Exception
        {

            Scanner scanner = new Scanner(System.in); 
    
            System.out.println("Digite seu nome completo: ");
            String Nome = scanner.next(); String Sobrenome = scanner.next();
            
            System.out.println("Por favor digite o número da agência: ");
            int Agencia = scanner.nextInt();
    
            System.out.println("Usuário: ");
            String Conta = scanner.next();
    
            System.out.println("Saldo: 3654,00");
    
            System.out.printf("Olá %s %s, Obrigado por criar uma conta em nosso banco. Sua agência é %d, conta %s, Seu saldo já está disponível para saque", Nome, Sobrenome, Agencia, Conta);
        
    
}
        }