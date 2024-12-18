// 1 - Pacote
package fundamentos;

import java.util.Scanner;

public class Medidas {
    static Scanner scanner = new Scanner(System.in);

    // 3.2 - Métodos (faz e não retorna)
    public static void main(String[] args) {
        String opcao;
        int area = 0; // receber o resultado dos cálculos de áreas

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = scanner.nextLine(); // leitura da opção
        switch (opcao) {
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                // ToDo: calcular área do retangulo
                break;
            default:
                System.out.println("Opcao Invalida: " + opcao);
        }

        if (area > 0) {
            System.out.println("A area e de: " + area + "m2");
        }
    }


    public static int calcularAreaDoQuadrado() {
        int tamanhoLado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        tamanhoLado = scanner.nextInt();
        return tamanhoLado * tamanhoLado; // retorna a área do quadrado
    }
}
