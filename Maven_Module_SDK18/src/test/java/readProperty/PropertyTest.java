package readProperty;

import org.junit.jupiter.api.Test;
import pages.Complete;

import static readProperty.ConfigProvider.*;

public class PropertyTest {
    Complete complete = new Complete();
    @Test
    public void testProperty(){
        System.out.println(USER_1_NAME);
        System.out.println (USER_1_PASS);
        System.out.println(USER_2_NAME);
        System.out.println (USER_2_PASS);
        System.out.println(USER_3_NAME);
        System.out.println (USER_3_PASS);
        System.out.println(USER_4_NAME);
        System.out.println (USER_4_PASS);
        System.out.println(USER_5_NAME);
        System.out.println (USER_5_PASS);
        System.out.println(FIRSTNAME);
        System.out.println(LASTNAME);
        System.out.println(ZIP);
    }
}
