import java.util.*;

public class GeneradorPreguntas {
    public static void main(String[] args) {
        Map<String, List<String>> temas = new HashMap<>();
        temas.put("java", List.of(
            "¿Qué es una variable?",
            "¿Para qué sirve un bucle for?",
            "¿Qué diferencia hay entre int y double?"
        ));

        Scanner sc = new Scanner(System.in);
        System.out.print("Tema: ");
        String tema = sc.nextLine().toLowerCase();

        if (temas.containsKey(tema)) {
            for (String p : temas.get(tema)) {
                System.out.println("- " + p);
            }
        } else {
            System.out.println("No tengo ese tema todavía.");
        }
    }
}