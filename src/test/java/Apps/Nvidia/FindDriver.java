package Apps.Nvidia;

import Base.CommonAPI;
import org.testng.annotations.Test;

public class FindDriver extends CommonAPI {
    @Test
    public void FDriver(){
        click("#navigation4a908f52_962b_433f_b959_b07db0bc60e4 > div.nav-header.desktop-nav > div > div.nv-container.nv-menu > ul.nv-menu-list.right > li:nth-child(2) > a");
        selectFromDropdown("#selProductSeriesType","GeForce");
        selectFromDropdown("#selProductSeries","GeForce 8 Series");
        selectFromDropdown("#selProductFamily","GeForce 8800 Ultra");
        selectFromDropdown("#selOperatingSystem","Windows 10 64-bit");
        selectFromDropdown("#ddlDownloadTypeCrdGrd","Game Ready Driver (GRD)");
        selectFromDropdown("#ddlLanguage","English (US)");
        click("#imgSearch");
        waitFor(5);
    }
}
