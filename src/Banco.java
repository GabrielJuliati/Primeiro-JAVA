import java.util.Scanner;
import java.text.DecimalFormat;

public class Banco {
    public static void main(String[] args) {

        String cliente = "Gabriel de Castro Juliati";
        String tipoDaConta = "Corrente";
        double saldo = 2500.00;
        int opcao;
        double dinheiro;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("----------------------------------------------------");
        System.out.println("\nNome do cliente: " + cliente);
        System.out.println("Tipo da conta: " + tipoDaConta);
        System.out.println("Saldo: " + df.format(saldo));
        System.out.println("\n----------------------------------------------------");

        do {
            System.out.println("""
                    \n>> Digite sua opção <<
                    1 - Consultar saldo
                    2 - Transferir valor
                    3 - Receber Valor
                    4 - Sair
                    """);
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saldo: " + df.format(saldo));
                    break;
                case 2:
                    System.out.println("Qual a quantia para ser realizada a transferencia?");
                    dinheiro = scanner.nextDouble();

                    if (dinheiro > saldo){
                        System.out.println("Sem saldo suficiente.");
                    }else if (dinheiro < 0){
                        System.out.println("Digite um valor valido para a transferencia.");
                    }else{
                        saldo -= dinheiro;
                        System.out.println("Transferencia realizada com sucesso.");
                    }
                    break;
                case 3:
                    System.out.println("Qual a quantia de valor a receber?");
                    dinheiro = scanner.nextDouble();
                    saldo += dinheiro;
                    System.out.println("Valor recebido.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Digite uma opção valida.");
                    break;
            }

        }while(opcao != 4);{
            System.out.println("Saindo da aplicação...");
            System.out.println("Logout realizado com sucesso.");
        }
    }
}