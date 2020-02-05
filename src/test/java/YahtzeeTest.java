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
        assertRollsInCategoryGiveScore(asList(1, 2, 3, 4, 5), 1);
    }

    @Test
    void twoOnesInCategoryOnes_Score2() {
        assertRollsInCategoryGiveScore(asList(1, 1, 3, 4, 5), 2);
    }

    private AbstractIntegerAssert<?> assertRollsInCategoryGiveScore(List<Integer> rolls, int score) {
        return assertThat(yahtzee.score(rolls)).isEqualTo(score);
    }
}
