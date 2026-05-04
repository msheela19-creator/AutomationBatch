package Books;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.Baseclass;
import objectRepository.BooksTest;
import objectRepository.HomePage;

public class dws_Tc_01 extends Baseclass {
	
	@Test(priority=1)
	public void clickOnBooksLink () throws IOException {
		
	HomePage hp = new HomePage(driver);
	hp.getBooksLink().click();
	
	
    BooksTest bp = new BooksTest(driver);
    bp.getShoppingcart().click();
    
    wutil.selectDropdown(futil.getDataFromProperty("lowTOHigh"),bp.getShoppingcart());
    
    Object pro = wutil.multi(driver,"//div[@class='product-item']");
    double lowest=0.0;
    for(WebElement op:pro) {
    	Object price = wutil.single(driver,"//span[@class='priceactual-price']").getText().trim();
    	Double.parseDouble((String) price);
    	if(lowest<=pri) {
    		lowest = pri;
    		bp.getAddtocart().click();
    	}
    	
    }
    
    @Test(priority=2)
    public void shoppingcart() {
    	HomePage hp = new HomePage(driver);
    	hp.getGiftCardsLink().click();
    	
    	opt=wutil.multi(driver,"//td@class='product-picture']/..//input[@type='checkbox']");
    	for(WebElement options:opt) {
    		options.click();
    	}
    	ShoppingCart scr = new ShoppingCart(driver);
    	wutil.selectDropdown(futil.getDataFromProperty("country"),scr.getCountrySelection());
    	
    	wutil.selectDropdown(futil.getDataFromProperty("state"),scr.getStateSelection());
    	scr.getZipcode(.sendKeys("zipcodee"));
    	scr.getEstimationShipping().click();
    	scr.getiAgreeCheckbox().click();
    	scr.getCheckout().click();
    }
    
    @Test(priority=3)
    public void checkout() {
    	CheckoutPage cp = new CheckoutPage(driver);
    	cp.getBillingAddressContinue.click();
    	cp.getShippingAddresscheckbox.click();
    	cp.getShippingAddressContinue().click();
    	cp.getPaymentMethodContinue().click();
    	cp.getPaymentinformationContinue().click();
    	cp.getConfirmOrderconfirmButton().click();
    }
    
    @Test(priority = 4){
    	public void orderDetails() {
    		OrderDetailsPage op = new OrderDetailsPage(driver);
    		op.getOrderDetails().click();
    		
    		WebElement order = wutil.single(driver, "//h3[text()='Information']");
    		wutil.scrollToElement(driver, order);
    		Thread.sleep(2000);
    		wutil.getPhoto(driver);
    	}
    }
    
    
	

	}
	
	

}
