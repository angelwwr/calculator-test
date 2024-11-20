import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {

    private Calc calc;

    @Before
    public void beforeEach() {
        calc = new Calc();
    }

    @Test
    public void add() {
        double EXPECTED = 8;
        double res = calc.add(3, 5);
        Assert.assertEquals(EXPECTED, res, 0.0001);
    }

    @Test
    public void sub() {
        double EXPECTED = 4;
        double res = calc.sub(7, 3);
        Assert.assertEquals(EXPECTED, res, 0.0001);
    }

}