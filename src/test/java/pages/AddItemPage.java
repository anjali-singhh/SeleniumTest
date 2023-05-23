package pages;




import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AddItemPage extends TestBase{

	Actions actions = new Actions(driver);
	//Pagefactory
	//Login 
	
    @FindBy(id="login2")
    WebElement loginLink;
    
    @FindBy(id="loginusername")
    WebElement username;
    
    @FindBy(id="loginpassword")
    WebElement pwd;
    
    @FindBy(xpath="//button[contains(text(),'Log in')]")
    WebElement loginBtn;
    
    //AddItem
    
    @FindAll(value =  { @FindBy(xpath="//h4[@class='card-title']")})
    List<WebElement> productItems;
    
   
    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	WebElement addBtn;
    
    @FindBy(xpath = "//a[contains(text(),'Home')]")
   	WebElement homeIcon;
    
  //View Cart
    @FindBy(xpath = "//a[contains(text(),'Cart')]")
	WebElement cartIcon;
    
    @FindAll(value =  { @FindBy(xpath="//tr[@class='success']")})
    List<WebElement> cartItems;
    
    
    
    public AddItemPage() {
 	
      PageFactory.initElements(driver, this);
    }
    
  //Login
    public void loginIcon() {
    	loginLink.click();
    }
    public void loginuser(String userName,String userPwd) {
		
		username.sendKeys(userName);
		pwd.sendKeys(userPwd);
    }
    public void loginBtn() {
		loginBtn.click();
    }
    //AddItem
    public void addItems(String item) {
		for(int i=0;i<productItems.size();i++) {
    		String items= productItems.get(i).getText();
    		if(items.equalsIgnoreCase(item))
    		{ productItems.get(i).click();
    		break; 
    		}
    		     
    }
    }
    
   
   
    public void addToCart() throws InterruptedException {
	   addBtn.click();
	   Thread.sleep(5000);
	   driver.switchTo().alert().accept();
	  
	}
    
    public void homePage() {
 	   homeIcon.click();
 	  
 	}
    
    public void cartLink() {
    	cartIcon.click();
    }
    public void viewCart() throws InterruptedException {
    	
    	
    	System.out.println("No of items in the Cart = " +cartItems.size());
    	Thread.sleep(5000);
    	System.out.println("Items in cart :");
    	for(int i=0;i<cartItems.size();i++) {
    		String items= cartItems.get(i).getText();
    		System.out.println(items);
    		
    		}
    }
    
}
