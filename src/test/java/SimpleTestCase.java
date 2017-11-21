import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.uncommons.reportng.ReportNGException;

public class SimpleTestCase {

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
    }
    @Test
    public void open(){
        System.out.println("open");
    }
    @Test
    public  void test01(){
        System.out.println("02");
    }

}
