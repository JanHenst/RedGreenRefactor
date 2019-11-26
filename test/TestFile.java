import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TestFile {

    Duplicator SUT;

    @Before
    public void setup() {
        SUT = new Duplicator();
        SUT.createFile();
    }

    @Test
    public void Duplicator_isOne_oneReturned() {
        int result = SUT.duplicateCounter(2);
        assertThat(result, is(4));
        System.out.println(result);
    }

    @After
    public void end() { SUT.deleteFile();}

    @Test
    public void testMultiplier_multiplyResult_resultReturned() {
        int result;

        Euro cash = new Euro(10);
        result = cash.multiply(5);
        System.out.println(result);
        assertEquals(result, 50);

    }

    @Test
    public void testMultiplierWith_multiplyTwice_resultReturned() {
        int result;

        Euro cash = new Euro(10);
        result = cash.multiplyAmountWith(3, 5);
        System.out.println(result);
        assertEquals(result, 150);

    }

}
