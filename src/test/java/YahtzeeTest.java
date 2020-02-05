import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class YahtzeeTest {

    @Test
    void oneOneInCategoryOnes_Score1() {
        Yahtzee yahtzee = new Yahtzee();
        assertThat(yahtzee.score(asList(1, 2, 3, 4, 5))).isEqualTo(1);
    }
}
