import java.util.List;

public class Yahtzee {
    public int score(List<Integer> rolls, String category) {
        if (category.equals("Twos")) {
            return rolls.stream()
                    .filter(number -> numberMatches(number, 2))
                    .mapToInt(Integer::intValue)
                    .sum();

        }

        return rolls.stream()
                .filter(number -> numberMatches(number, 1))
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static boolean numberMatches(Integer number, int matchingNumber) {
        return number == matchingNumber;
    }

}
