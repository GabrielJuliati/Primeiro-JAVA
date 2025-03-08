import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double nota =0;
        double media = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite uma nota para esse filme ou -1 para encerrar");
            nota = leitura.nextDouble();
            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Media de avaliações: " + media/totalDeNotas);
    }
}
