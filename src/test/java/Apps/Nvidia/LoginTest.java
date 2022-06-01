package Apps.Nvidia;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {

    @Test

    public void LogIn(){

        click("#nv-login > svg");
        waitFor(3);
        type("#emailAddress","amganas18@gmail.com");
        waitFor(3);
        click("#loginNextButton > span.v2");
        waitFor(3);
        type("#signinPassword","Nvidia2022");

    }
}
