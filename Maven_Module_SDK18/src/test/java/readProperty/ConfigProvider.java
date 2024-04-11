package readProperty;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {

    Config config = readConfig();

    static Config readConfig() {
        return  ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
    String FIRSTNAME = readConfig().getString("userParams.universalNameAndZip.firstName");
    String LASTNAME = readConfig().getString("userParams.universalNameAndZip.lastName");
    String ZIP = readConfig().getString("userParams.universalNameAndZip.zip");
    String USER_1_NAME = readConfig().getString("userParams.user1.name");
    String USER_1_PASS = readConfig().getString("userParams.user1.password");

    String USER_2_NAME = readConfig().getString("userParams.user2.name");
    String USER_2_PASS = readConfig().getString("userParams.user2.password");

    String USER_3_NAME = readConfig().getString("userParams.user3.name");
    String USER_3_PASS = readConfig().getString("userParams.user3.password");

    String USER_4_NAME = readConfig().getString("userParams.user4.name");
    String USER_4_PASS = readConfig().getString("userParams.user4.password");

    String USER_5_NAME = readConfig().getString("userParams.user5.name");
    String USER_5_PASS = readConfig().getString("userParams.user5.password");
}
