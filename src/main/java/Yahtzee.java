import java.util.List;

public class Yahtzee {
    public int score(List<Integer> rolls) {
        return rolls.stream()
                .filter(number -> number == 1)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
