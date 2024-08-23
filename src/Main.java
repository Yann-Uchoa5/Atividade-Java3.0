import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo[] retangulos = new Retangulo[5];


        for (int i = 0; i < retangulos.length; i++) {
            System.out.print("Digite a largura do retângulo " + (i + 1) + ": ");
            double largura = scanner.nextDouble();
            System.out.print("Digite a altura do retângulo " + (i + 1) + ": ");
            double altura = scanner.nextDouble();

            retangulos[i] = new Retangulo(largura, altura);
        }


        System.out.println("\nInformações dos retângulos:");
        for (Retangulo retangulo : retangulos) {
            retangulo.MostrarInformacao();
        }


        Arrays.sort(retangulos, Comparator.comparingDouble(Retangulo::CalculoArea));


        System.out.println("\nRetângulos ordenados por área crescente:");
        for (Retangulo retangulo : retangulos) {
            retangulo.MostrarInformacao();
        }


        Retangulo[] novoVetor = new Retangulo[10];


        for (int i = 0; i < retangulos.length; i++) {
            novoVetor[i] = retangulos[i];
        }


        for (int i = retangulos.length; i < novoVetor.length; i++) {
            System.out.print("Digite a largura do novo retângulo " + (i + 1) + ": ");
            double largura = scanner.nextDouble();
            System.out.print("Digite a altura do novo retângulo " + (i + 1) + ": ");
            double altura = scanner.nextDouble();

            novoVetor[i] = new Retangulo(largura, altura);
        }


        System.out.println("\nInformações de todos os retângulos após a expansão do vetor:");
        for (Retangulo retangulo : novoVetor) {
            retangulo.MostrarInformacao();
        }

        scanner.close();
    }
}