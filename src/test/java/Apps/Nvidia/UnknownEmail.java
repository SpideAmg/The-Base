package Apps.Nvidia;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class UnknownEmail extends CommonAPI {
    @Test
    public void UkE() {
        click("#nv-login > svg");
        waitFor(3);
        type("#emailAddress", "kakaklallkkfkfk@gmail.com");
        waitFor(3);
        click("/html/body/nv-oauth-app/div[1]/div[2]/div/div/nv-oauth-app-v1/help/div/div/div[1]/a");
        waitFor(5);

    }


}