import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testGetUser() {
        User user = Main.getUser();
        User userDefault = new User();
        Assert.assertEquals(userDefault, user);
    }
}