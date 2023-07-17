package B1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B1ExcercisesTest {
    @Test
    void tc01() {
        Assert.assertEquals(B1Exercises.cal(new int[] {9,9,9,9}), new int[]{1, 0, 0, 0, 0});
    }

    @Test
    void tc02() {
        Assert.assertEquals(B1.B1Exercises.cal(new int[]{11, 9, 9, 9}), IllegalArgumentException);
    }
}
