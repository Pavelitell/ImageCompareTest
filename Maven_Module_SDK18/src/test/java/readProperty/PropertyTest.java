package readProperty;

import org.junit.jupiter.api.Test;

import static readProperty.ConfigProvider.*;

public class PropertyTest {
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
    }
}
