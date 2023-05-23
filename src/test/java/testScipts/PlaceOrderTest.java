package testScipts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddItemPage;
import pages.DeleteItemPage;
import pages.PlaceOrderPage;

public class PlaceOrderTest extends TestBase{
	AddItemPage addItem;
	AddItemTest addItemTest;
	DeleteItemPage deleteItem;
	PlaceOrderPage placeOrder;
	
	@BeforeTest
	public void setup() {
		initialize();
	}
	
	@Test
	   public void login() throws InterruptedException {
			addItemTest = new AddItemTest();
			addItemTest.loginTest();
	}
	
	@Test(priority=1)
	   public void viewCartTest() throws InterruptedException {
		addItem = new AddItemPage();
		Thread.sleep(5000);
	  	addItem.cartLink();
	  	Thread.sleep(5000);
		addItemTest = new AddItemTest();
		addItemTest.viewCartTest();
	}
	
	//PlaceOrder
	@Test(priority=2)
		public void placeOrder() throws InterruptedException {
		  placeOrder = new PlaceOrderPage();
		  Thread.sleep(5000);
		  placeOrder.PlaceOrder();
		  Thread.sleep(5000);
		  placeOrder.purchaseName("Anji","India","Delhi","578998766","May","2023");
		  Thread.sleep(5000);
		  placeOrder.purchaseBtn();
		  Thread.sleep(5000);
		  placeOrder.okBtn();
		  
	}
	 @AfterTest
     public void tearDown() {
    	  driver.close();
    }
  
}
