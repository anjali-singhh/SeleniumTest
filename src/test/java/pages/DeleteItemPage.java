package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DeleteItemPage extends TestBase{
	
	 @FindAll(value =  { @FindBy(xpath="//tr[@class='success'] //child::td[2]")})
	    List<WebElement> cartItemName;

	 
	 @FindAll(value =  { @FindBy(xpath="//tr[@class='success'] //child::td[2]//following::a")})
	    List<WebElement> deleteIcon;
	 

	
	public  DeleteItemPage() {
	  	 PageFactory.initElements(driver, this);
	   }
	
	public void delete(String item) throws InterruptedException {
	
		System.out.println("No of items in the Cart = " +cartItemName.size());
    	Thread.sleep(5000);
    	for(int i=0;i<cartItemName.size();i++) {
    		String items= cartItemName.get(i).getText();
    		if(items.equalsIgnoreCase(item))
    		{ deleteIcon.get(i).click();
    		System.out.println("Cart after delete");
    		break; 
    		}
    		     
    		}
    	
    	
	}

}
