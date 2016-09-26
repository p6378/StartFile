package mt.startfile;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void ControlStart_v1() throws Exception {
        Start_v1 r = new Start_v1();

        assertTrue( Math.abs(100.0-r.smToInch(254)) < 0.00001 );
    }


}