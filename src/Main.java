import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jogo eldenRing = new Jogo("Elden Ring", "PC", "10/08/2026", 10, "Muito difícil");

        System.out.println(eldenRing.getNome());
        System.out.println(eldenRing.getPlataforma());
        System.out.println(eldenRing.getNota());
    }
}