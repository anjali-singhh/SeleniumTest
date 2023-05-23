package testScipts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddItemPage;
import pages.DeleteItemPage;

public class DeleteItemTest extends TestBase{
	AddItemPage addItem;
	AddItemTest addItemTest;
	DeleteItemPage deleteItem;
	
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
    public void deleteItem() throws InterruptedException {
		addItem = new AddItemPage();
		Thread.sleep(5000);
	  	addItem.cartLink();
	  	Thread.sleep(5000);
	    deleteItem = new DeleteItemPage(); 
	    deleteItem.delete("Samsung galaxy s7");
	    
  }
	
	@Test(priority=2)
	public void viewCartTest() throws InterruptedException {
		 addItemTest = new AddItemTest();
		 addItemTest.viewCartTest();
	 }
	@AfterTest
    public void tearDown() {
    	  driver.close();
      }
}
