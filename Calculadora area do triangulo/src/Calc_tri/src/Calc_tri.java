import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Calc_tri {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.printf("Qual é seu nome ? ");
        String nome = s.next();
        s = new Scanner(System.in);
        System.out.printf("Qual a base do triangulo ? " );
        float baseTriangulo = s.nextInt();
        s = new Scanner(System.in);
        System.out.printf("Qual a altura do triangulo ?");
        float alturaTriangulo = s.nextInt();

        float areaTotal = baseTriangulo*alturaTriangulo/2;

        System.out.print(nome);
        System.out.print(baseTriangulo);
        System.out.print(alturaTriangulo);
        System.out.printf("Área do triangulo = " + areaTotal);

    }
}