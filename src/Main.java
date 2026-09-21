import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double resultado = 0;
        int opcao;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(leia.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite apenas o número.");
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                    try {
                        System.out.print("Digite o primeiro número: ");
                        double num1 = Double.parseDouble(leia.nextLine().trim());

                        System.out.print("Digite o segundo número: ");
                        double num2 = Double.parseDouble(leia.nextLine().trim());

                        if (opcao == 1) {
                            resultado = num1 + num2;
                            System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, resultado);
                        } else if (opcao == 2) {
                            resultado = num1 - num2;
                            System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, resultado);
                        } else if (opcao == 3) {
                            resultado = num1 * num2;
                            System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, resultado);
                        } else if (opcao == 4) {
                            if (num2 == 0) {
                                System.out.println("Erro: não é possível dividir por zero!");
                            } else {
                                resultado = num1 / num2;
                                System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, resultado);
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: digite apenas números válidos.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                case -1:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}