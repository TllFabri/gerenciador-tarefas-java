import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogo> jogos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n--- Catálogo de Jogos Zerados ---");
            System.out.println("1 - Adicionar jogo");
            System.out.println("2 - Listar jogos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o "enter" pendente no buffer

            if (opcao == 1) {
                System.out.print("Nome do jogo: ");
                String nome = scanner.nextLine();

                System.out.print("Plataforma: ");
                String plataforma = scanner.nextLine();

                System.out.print("Data que zerou (dd/mm/aaaa): ");
                String dataZerado = scanner.nextLine();

                System.out.print("Nota (0 a 10): ");
                int nota = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Dificuldade: ");
                String dificuldade = scanner.nextLine();

                Jogo novoJogo = new Jogo(nome, plataforma, dataZerado, nota, dificuldade);
                jogos.add(novoJogo);

                System.out.println("Jogo adicionado com sucesso!");

            } else if (opcao == 2) {
                if (jogos.isEmpty()) {
                    System.out.println("Nenhum jogo cadastrado ainda.");
                } else {
                    System.out.println("\n--- Jogos Zerados ---");
                    for (Jogo jogo : jogos) {
                        System.out.println(jogo.getNome() + " - " + jogo.getPlataforma()
                                + " - nota " + jogo.getNota() + " - " + jogo.getDificuldade()
                                + " - zerado em " + jogo.getDataZerado());
                    }
                }
            }

        } while (opcao != 0);

        System.out.println("Encerrando o programa. Até mais!");
        scanner.close();
    }
}