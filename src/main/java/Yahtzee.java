import java.util.List;

public class Yahtzee {
    public int score(List<Integer> rolls, String category) {
        if (category.equals("Twos")) {
            return calculateScoreForNumber(rolls, 2);
        }
        return calculateScoreForNumber(rolls, 1);
    }

    private int calculateScoreForNumber(List<Integer> rolls, int number) {
        return rolls.stream()
                .filter(roll -> numberMatches(roll, number))
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static boolean numberMatches(Integer number, int matchingNumber) {
        return number == matchingNumber;
    }

}
