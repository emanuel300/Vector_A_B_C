package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double resultado = 0;

        System.out.print("Quantos valores vai ter cada vetor: ");
        int n = ler.nextInt();
        double[] vetA = new double[n];
        double[] vetB = new double[n];
        double[] vetC = new double[n];

        System.out.println();

        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < vetA.length; i++){
            System.out.print("Numero: ");
            vetA[i] = ler.nextDouble();
        }

        System.out.println();

        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < vetB.length; i++){
            System.out.print("Numero: ");
            vetB[i] = ler.nextDouble();
        }

        System.out.println();

        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < vetC.length; i++){
            resultado = vetA[i] + vetB[i];
            System.out.println(resultado);
        }




        ler.close();

    }
}
