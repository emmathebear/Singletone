import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class MainTest {

    @Test
    public void testGetUserDefaultValues() {
        User user1 = User.istance();
        boolean nameIsDefault = (Objects.equals(user1.getName(), "Default"));
        boolean ageIsDefault = (Objects.equals(user1.getAge(), "100"));
        Assert.assertEquals(nameIsDefault, ageIsDefault);
    }

    @Test
    public void testGetUserAsSingleTone() {
        User user1 = User.istance();
        User user2 = User.istance();
        user2.setName("Mirò");
        user2.setAge("44");
        Assert.assertEquals(user2, user1);
    }
}