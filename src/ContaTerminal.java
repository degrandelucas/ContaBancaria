import java.util.Scanner;
/**
 * A classe ContaTerminal simula a abertura de uma conta bancária via terminal de console.
 * A aplicação solicita ao usuário informações básicas como nome, sobrenome, agência, número da conta e saldo inicial.
 * Após coletar os dados, a aplicação exibe uma mensagem de confirmação.
 * @author Lucas Degrande
 * @version 1.0
 * @since 2024-08-25
 */
public class ContaTerminal {

    /**
     * O método principal (main) que executa a aplicação.
     * Solicita e lê os dados do usuário, em seguida, exibe uma mensagem de confirmação.
     *
     * @param args Argumentos da linha de comando (não são utilizados neste programa).
     */
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
