package Apps.Nvidia;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class RestPass extends CommonAPI {
    @Test
    public void ResetPass(){
        click("#nv-login > svg");
        waitFor(3);
        click("#help_login");
        click("#reset_password");
        type("#input_email","amganas18@gmail.com");
    }
}
