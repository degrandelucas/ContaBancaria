import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner leituraDados = new Scanner(System.in);

        System.out.println("Olá, iremos confirmar seus dados!");
        System.out.print("Digite seu nome: ");
        String nome = leituraDados.next(); 
        System.out.print("Digite seu último sobrenome: ");
        String ultimoNome = leituraDados.next(); 
        System.out.print("Digite sua agência: ");
        int agencia = leituraDados.nextInt(); 
        System.out.print("Digite sua conta: ");
        int conta = leituraDados.nextInt(); 
        System.out.print("Digite seu valor em conta (depósito): ");
        double saldo = leituraDados.nextDouble(); 
        System.out.println("--------------------------------------");
        System.out.println("Olá " + nome + " " + ultimoNome + ", sua agência-conta "+ agencia+"-"+conta+", possui o saldo de R$ "+ saldo +".");
    }
}
