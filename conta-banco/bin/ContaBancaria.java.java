public class ContaBancaria  {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).UseLocale(Locale.US); 

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.next();
        
        System.out.println("Por favor digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Usuário: ");
        Double conta = scanner.nextDouble();

        System.out.println("Saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá + nome +, \n Obrigado por criar uma conta em nosso banco. \n Sua agência é + agencia + . \n conta + conta +  . \n Seu saldo é [Saldo] e já está disponível para saque");
    
    
    
    
    
    
    }


    
}

    

