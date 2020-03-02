package categories;

import java.util.List;

public class NumberCategory {
    public NumberCategory() {
    }

    public int calculateScoreForNumber(List<Integer> rolls, int number) {
        return rolls.stream()
                .filter(roll -> numberMatches(roll, number))
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static boolean numberMatches(Integer number, int matchingNumber) {
        return number == matchingNumber;
    }
}