import categories.Category;
import categories.NumberCategory;
import categories.PairCategory;
import categories.TwoPairCategory;
import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class YahtzeeTest {

    private Yahtzee yahtzee;

    @BeforeEach
    void createYahtzee() {
        yahtzee = new Yahtzee();
    }

    @ParameterizedTest(name = "roll {0} in category {1} gives score {2}")
    @MethodSource("rollsCategoriesAndOutcomes")
    void oneOneInCategoryOnes_Score1(List<Integer> rolls, Category category, int expectedScore) {
        assertRollsInCategoryGiveScore(rolls, expectedScore, category);
    }

    private static Stream<Arguments> rollsCategoriesAndOutcomes() {
        return Stream.of(
                // rolls, category, expectedScore
                Arguments.of(asList(1, 2, 3, 4, 5), new NumberCategory(1), 1),
                Arguments.of(asList(1, 1, 3, 4, 5), new NumberCategory(1), 1 + 1),
                Arguments.of(asList(1, 2, 3, 4, 5), new NumberCategory(2), 2),
                Arguments.of(asList(1, 1, 2, 3, 4), new PairCategory(), 1 + 1),
                Arguments.of(asList(1, 2, 3, 4, 5), new PairCategory(), 0),
                Arguments.of(asList(1, 1, 2, 2, 5), new TwoPairCategory(), 1+1+2+2)
        );
    }

    private AbstractIntegerAssert<?> assertRollsInCategoryGiveScore(List<Integer> rolls, int score, Category category) {
        return assertThat(yahtzee.score(rolls, category)).isEqualTo(score);
    }
}
