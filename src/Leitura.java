import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de laçamento do filme");
        int anoDeLançamento = leitura.nextInt();

        System.out.println("Digite uma nota para esse filme");
        double nota = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLançamento);
        System.out.println(nota);
    }
}
