package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class PlaceOrderPage extends TestBase{
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
    WebElement placeOrderBtn;
	
	//purchase
	@FindBy(id="name")
    WebElement name;
	
	@FindBy(id="country")
    WebElement country;
	
	@FindBy(id="city")
    WebElement city;
	
	@FindBy(id="card")
    WebElement card;
	
	@FindBy(id="month")
    WebElement month;
	
	@FindBy(id="year")
    WebElement year;
	
	@FindBy(xpath="//button[contains(text(),'Purchase')]")
    WebElement purchaseBtn;
	
	@FindBy(xpath="//div[@class='sa-icon sa-custom']//following::h2")
    WebElement successText;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
    WebElement oKBtn;
	


	

     public  PlaceOrderPage() {
  	 PageFactory.initElements(driver, this);
}
     //PlaceOrder
     public void PlaceOrder() {
         placeOrderBtn.click();
     }
     //Purchase Item
     public void purchaseName(String pName,String pCountry,String pCity,String pCard,String pMonth,String pYear) {
         name.sendKeys(pName);
         country.sendKeys(pCountry);
         city.sendKeys(pCity);
         card.sendKeys(pCard);
         month.sendKeys(pMonth);
         year.sendKeys(pYear);
         
     }
     public void purchaseBtn() throws InterruptedException {
    	 purchaseBtn.click();
    	 Thread.sleep(5000);
    	 System.out.println(successText.getText());
    	 
     }
     
     public void okBtn() {
    	 oKBtn.click();
     }

}
