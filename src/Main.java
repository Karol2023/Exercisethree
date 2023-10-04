import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static double obliczSrednia(List<Integer> listaLiczb) {
        OptionalDouble srednia = listaLiczb.stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        return srednia.orElse(0.0); // Domyślnie zwracamy 0.0, jeśli lista jest pusta
    }

    public static void main(String[] args) {
        List<Integer> listaLiczb = List.of(1, 2, 3, 4, 5);
        double srednia = obliczSrednia(listaLiczb);
        System.out.println("Średnia: " + srednia);
    }
}