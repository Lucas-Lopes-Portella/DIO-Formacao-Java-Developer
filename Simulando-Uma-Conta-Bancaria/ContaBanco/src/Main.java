
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
    criarConta();
    }

    public static ContaTerminal criarConta() throws IOException {

        Scanner sc = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();


        System.out.println("----------Conta Bancária----------\n");
        System.out.println("Por favor, digite o número da agência: ");
        contaTerminal.setAgencia(sc.next());
        System.out.println("Por favor, digite o número da conta: ");
        contaTerminal.setNumero(sc.nextInt());
        System.out.println("Informe o seu nome: ");
        contaTerminal.setNomeCliente(sc.next());
        System.out.println("Informe o seu saldo atual: ");
        contaTerminal.setSaldo(sc.nextDouble());
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s "
                            + "conta %d e seu saldo R$ %.2f já está disponível para saque.",contaTerminal.getNomeCliente(), contaTerminal.getAgencia(), contaTerminal.getNumero(), contaTerminal.getSaldo());

        sc.close();
        return null;
    }
}