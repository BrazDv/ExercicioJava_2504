import java.util.Scanner;
import java.util.Stack;

public class ExerciciosPilhaEFila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha o exercício a ser executado:");
            System.out.println("1. Exercício 1 - Pilha");
            System.out.println("2. Exercício 2 - Fila");
            System.out.println("3. Exercício 3 - Cartas de Baralho");
            System.out.println("0. Sair");

            String entrada = scanner.nextLine();

            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido!");
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    executarExercicioPilha(scanner);
                    break;
                case 2:
                    executarExercicioFila(scanner);
                    break;
                case 3:
                    executarExercicioCartasBaralho(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void executarExercicioPilha(Scanner scanner) {
        Stack<Integer> pilha = new Stack<>();

        System.out.println("Insira três números na pilha:");
        for (int i = 0; i < 3; i++) {
            int numero = Integer.parseInt(scanner.nextLine());
            pilha.push(numero);
        }

        System.out.println("Removendo elementos da pilha:");
        while (!pilha.isEmpty()) {
            int elementoRemovido = pilha.pop();
            System.out.println("Elemento removido: " + elementoRemovido);
        }
    }

    public static void executarExercicioFila(Scanner scanner) {
        // Implementação do exercício 2 - Fila
    }

    public static void executarExercicioCartasBaralho(Scanner scanner) {
        Stack<String> baralho = new Stack<>();

        String[] naipes = {"Espadas", "Copas", "Ouros", "Paus"};

        System.out.println("Insira as cartas de baralho (1 a 13, J, Q, K):");
        for (String naipe : naipes) {
            for (int i = 1; i <= 13; i++) {
                String carta = "";
                if (i == 1) {
                    carta = "A";
                } else if (i >= 2 && i <= 10) {
                    carta = String.valueOf(i);
                } else if (i == 11) {
                    carta = "J";
                } else if (i == 12) {
                    carta = "Q";
                } else if (i == 13) {
                    carta = "K";
                }
                carta += " de " + naipe;
                baralho.push(carta);
            }
        }

        System.out.println("Retirando cartas de baralho:");
        while (!baralho.isEmpty()) {
            String cartaRemovida = baralho.pop();
            System.out.println("Carta removida: " + cartaRemovida);
        }
    }
}
