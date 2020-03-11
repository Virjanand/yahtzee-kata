package categories;

import java.util.List;

public class NumberCategory implements Category{

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

    @Override
    public String toString() {
        return "Number(" + number + ")";
    }
}