import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TestFile {

    Duplicator SUT;

    @Before
    public void setup() {
        SUT = new Duplicator();
    }

    @Test
    public void Duplicator_isOne_oneReturned() {
        int result = SUT.duplicateCounter(2);
        assertThat(result, is(4));
        System.out.println(result);
    }


}
