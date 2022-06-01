package Apps.Abdessalam.Asus;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class TufGaming extends CommonAPI {
    @Test
    public void Tuf(){
        click("#cookie-policy-info > div > div.cookie-btn-box > div.btn-asus.btn-ok.btn-read-ck");
        hoverOver("#headerLayerOne > div > div.HeaderDesktop__topRightMenu__1mYR1.HeaderDesktop__themeWhite__1bpoN > div:nth-child(2) > div > span");
        waitFor(2);
        click("#headerLayerOne > div > div.HeaderDesktop__topRightMenu__1mYR1.HeaderDesktop__themeWhite__1bpoN > div:nth-child(2) > div > div > a:nth-child(2)");

    }
}
