package DemoWebsite;

import Base.CommonAPI;

public class HomePageTest extends CommonAPI {

//    @Test
//    public void HoverOverDressAndClickOnCasualDress() {
//
//        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
//        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
//        click("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
//
//    }
//
//    @Test
//    public void HoverOverDressAndClickOnEveningDress() {
//
//        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
//        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
//        click("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a");
//
//    }
//    @Test
//    public void HoverOverDressAndClickOnSummerDress() {
//
//        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
//        hoverOver("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
//        click("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a");
//
//    }

//
//        @Test
//        public void HomePage() {
//
//        }
//
//
//        @Test
//        public void SigningUpUsingNewEmail () {
//            click("#header > div.nav > div > div > nav > div.header_user_info > a");
//            type("#email_create", "pnt@gmail.com");
//            click("#SubmitCreate > span");
//            waitFor(2);
//            String CreateAnAccount = getPageTitle();
//            Assert.assertEquals(CreateAnAccount, "Login - My Store");
//
//        }
//
//        @Test
//        public void SigningUpUsingAnExistingEmail () {
//            click("#header > div.nav > div > div > nav > div.header_user_info > a");
//            type("#email_create", "test@gmail.com");
//
//            click("#SubmitCreate > span");
//            waitFor(2);
//            String EmailAlreadyExist = driver.findElement(By.cssSelector("#create_account_error > ol > li")).getText();
//            Assert.assertEquals(EmailAlreadyExist, "An account using this email address has already been registered. Please enter a valid password or request a new one.");
//
//
//        }
//
//        @Test
//        public void SigninUsingWrongEmailAndPass () {
//
//            click("#header > div.nav > div > div > nav > div.header_user_info > a");
//            type("#email", "hhhh@gmail.com");
//            type("#passwd", "hhhhh");
//            click("#SubmitLogin > span");
//
//            waitFor(2);
//            String WrongEmailAndPass = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
//            waitFor(2);
//            Assert.assertEquals(WrongEmailAndPass, "Authentication failed.");
//
//        }
//    @Test
//    public void SpectialsFunctionDropDownMenuandSorting(){
//
//        //lowest price first
//        click(" #block_various_links_footer > ul > li:nth-child(1) > a");
//        selectFromDropdown("#selectProductSort","Price: Lowest first");
//
//
//
//    }
//
//    @Test
//    public void TShirtSection() {
//        String TshirtPage = getPageTitle();
//        click("#block_top_menu > ul > li:nth-child(3) > a");
//        Assert.assertEquals(TshirtPage,"T-shirts - My Store");
//        type("#selectProductSort","In stock");
//    }
//
//    @Test
//    public void AddToCart() {
//
//        click("#block_top_menu > ul > li:nth-child(3) > a");
//        // click("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
//        hoverOver("#center_column > ul > li > div > div.right-block > span > span");
//        click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
//        waitFor(2);
//        String AddedToCartSuccessfully = driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")).getText();
//        Assert.assertEquals(AddedToCartSuccessfully,"Product successfully added to your shopping cart");
//
//    }
//
//    @Test
//    public void ShoppingCartSummary() {
//
//        click("#block_top_menu > ul > li:nth-child(3) > a");
//        // click("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
//        hoverOver("#center_column > ul > li > div > div.right-block > span > span");
//        click("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
//        waitFor(4);
//        click("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
//        String shoppingcartsummary = driver.findElement(By.cssSelector("#cart_title")).getText();
//        Assert.assertEquals(shoppingcartsummary,"SHOPPING-CART SUMMARY\n" +
//                "Your shopping cart contains: 1 Product");
//    }
//
//
//
//    @Test
//    public void searchBarFunction(){
//
//        type("#search_query_top","Dress");
//        click("#searchbox > button");
//
//    }
//    @Test
//    public void NegativesearchBarFunctionTest(){
//
//        String text = "aaaaa";
//        type("#search_query_top", text);
//        click("#searchbox > button");
//        waitFor(5);
//        String NoresultsFound = driver.findElement(By.cssSelector("#center_column > p")).getText();
//        Assert.assertEquals(NoresultsFound,"No results were found for your search "+"\""+text+"\"");
//
//
//
//    }
//

//    @Test

//    public void SocialMedia()
//    {
//        //facebook
//        click("#social_block > ul > li.facebook > a");
//        //twitter
//        click("#social_block > ul > li.twitter > a");
//        //youtube
//        click("#social_block > ul > li.youtube > a");
//        //google+
//        click("#social_block > ul > li.google-plus > a");
//    }


//
//    }


}