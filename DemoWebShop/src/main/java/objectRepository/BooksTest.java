package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksTest {

	@FindBy(linkText = "BOOKS")
	private WebElement BookLink;
	
	@FindBy(id = "products-orderby")
	private WebElement dropdown;
	
	@FindBy(xpath = "//input[contains(@class='button-2 product-box-add-to']")
	private WebElement addtocart;
	
	@FindBy(className = "cart-label")
	private WebElement shoppingcart;
	
	
	
	public BooksTest(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}



	public WebElement getBookLink() {
		return BookLink;
	}



	public WebElement getDropdown() {
		return dropdown;
	}



	public WebElement getAddtocart() {
		return addtocart;
	}



	public WebElement getShoppingcart() {
		return shoppingcart;
	}
	
	
}

