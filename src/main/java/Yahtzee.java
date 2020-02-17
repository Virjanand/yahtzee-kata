import java.util.List;

public class Yahtzee {
    private static boolean ones(Integer number) {
        return number == 1;
    }

    public int score(List<Integer> rolls, String category) {
        if (category.equals("Twos")) {
            return rolls.stream()
                    .filter(Yahtzee::twos)
                    .mapToInt(Integer::intValue)
                    .sum();

        }

        return rolls.stream()
                .filter(Yahtzee::ones)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static boolean twos(Integer number) {
        return number == 2;
    }
}
