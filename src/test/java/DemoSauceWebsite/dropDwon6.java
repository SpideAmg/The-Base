package DemoSauceWebsite;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class dropDwon6 extends CommonAPI {


    @Test
    public void dropdown() {
        type("#user-name", "standard_user");
        type("#password", "secret_sauce");
        click("#login-button");
        selectFromDropdown("#header_container > div.header_secondary_container > div.right_component > span > select", "Name (A to Z)");

    }
}