package Apps.Nvidia;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProductAva extends CommonAPI {
    WebDriver get;
    @Test
    public void ProdoctAv(){
        //click("#navigation4a908f52_962b_433f_b959_b07db0bc60e4 > div.nav-header.desktop-nav > div > div.nv-container.nv-menu > ul.nv-menu-list.right > li:nth-child(1) > a");
       get.findElement(By.cssSelector("#navigationec89e004_90e2_4b3d_8508_04819a53d281 > " +
               "div.nav-header.desktop-nav > div > div.nv-container.nv-menu > ul.nv-menu-list.right > li:nth-child(1)")).click();
               waitFor(3);
    }
}
