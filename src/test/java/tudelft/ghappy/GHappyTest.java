package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void twoCapitalGTogether () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxGGyy");
        Assertions.assertTrue(result);
    }

    @Test
    public void noGAtAll () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxmmzzyy");
        Assertions.assertTrue(result);
    }

    @Test
    public void onlyOneG () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("g");
        Assertions.assertFalse(result);
    }

    @Test
    public void onlyTwoG () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("gg");
        Assertions.assertTrue(result);
    }

    @Test
    public void onlyTwoGCapitalAfterLower () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("gG");
        Assertions.assertFalse(result);
    }

    @Test
    public void oneGInLongString () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxgyy");
        Assertions.assertFalse(result);
    }

    @Test
    public void twoGTogether () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxggyy");
        Assertions.assertTrue(result);
    }

    @Test
    public void threeGTogether () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxgggyy");
        Assertions.assertTrue(result);
    }

    @Test
    public void twoGroupOfGFirstHappyLastIsSingleG () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxggyyg");
        Assertions.assertFalse(result);
    }

    @Test
    public void twoGroupOfGFirstHappyLastIsDoubleG () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxggyygg");
        Assertions.assertTrue(result);
    }

    @Test
    public void twoGroupOfGFirstHappyLastIsTripleG () {
        GHappy gH = new GHappy();
        boolean result = gH.gHappy("xxggyyggg");
        Assertions.assertTrue(result);
    }
}
