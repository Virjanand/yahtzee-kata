import categories.Category;
import categories.NumberCategory;
import categories.PairCategory;
import categories.TwoPairCategory;
import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class YahtzeeTest {

    private Yahtzee yahtzee;

    @BeforeEach
    void createYahtzee() {
        yahtzee = new Yahtzee();
    }

    @Test
    void oneOneInCategoryOnes_Score1() {
        assertRollsInCategoryGiveScore(asList(1, 2, 3, 4, 5), 1, new NumberCategory(1));
    }

    @Test
    void twoOnesInCategoryOnes_Score2() {
        assertRollsInCategoryGiveScore(asList(1, 1, 3, 4, 5), 2, new NumberCategory(1));
    }

    @Test
    void oneTwoInCategoryTwos_Score2() {
        assertRollsInCategoryGiveScore(asList(1, 2, 3, 4, 5), 2, new NumberCategory(2));
    }

    @Test
    void twoTwosInCategoryPair_Score4() {
        assertRollsInCategoryGiveScore(asList(1, 2, 3, 2, 5), 2+2, new PairCategory());
    }

    @Test
    void noPairInCategoryPair_Score0() {
        assertRollsInCategoryGiveScore(asList(1, 2, 3, 4, 5), 0, new PairCategory());
    }

    @Test
    void twoPairInCategoryTwoPair_ScoreSumOfDice() {
        assertRollsInCategoryGiveScore(asList(1, 1, 3, 3, 5), 1+1+3+3, new TwoPairCategory());
    }

    @Test
    void noPairInCategoryPair_Score0() {
        assertRollsInCategoryGiveScore(asList(1, 2, 3, 4, 5), 0, new PairCategory());
    }

    private AbstractIntegerAssert<?> assertRollsInCategoryGiveScore(List<Integer> rolls, int score, Category category) {
        return assertThat(yahtzee.score(rolls, category)).isEqualTo(score);
    }
}
