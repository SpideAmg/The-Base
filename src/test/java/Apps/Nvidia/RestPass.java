package Apps.Nvidia;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RestPass extends CommonAPI {
    WebDriver id;
    @Test
    public void ResetPass(){
        click("#nv-login > svg");
        waitFor(3);
        click("#help_login");

        id.findElement(By.className("btn background-dark-grey")).click();
        type("#input_email","amganas18@gmail.com");

    }
}
