package categories;

import java.util.List;

public class NumberCategory {

    private int number;

    public NumberCategory(int number) {
        this.number = number;
    }

    public int calculateScoreForNumber(List<Integer> rolls) {
        return rolls.stream()
                .filter(this::rollMatchesNumber)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private boolean rollMatchesNumber(Integer roll) {
        return roll == number;
    }
}