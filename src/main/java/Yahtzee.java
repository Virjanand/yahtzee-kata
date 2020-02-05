import java.util.List;

public class Yahtzee {
    private static boolean ones(Integer number) {
        return number == 1;
    }

    public int score(List<Integer> rolls, String category) {
        return rolls.stream()
                .filter(Yahtzee::ones)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
