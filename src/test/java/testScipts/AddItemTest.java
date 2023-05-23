package testScipts;

import org.testng.annotations.Test;

import base.TestBase;

import pages.AddItemPage;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;


    public class AddItemTest extends TestBase{
	AddItemPage addItem;
 
	@BeforeTest
	public void setup() {
		initialize();
	}
	
	 //login
	
	@Test
	public void loginTest() throws InterruptedException  {
		
	  addItem = new AddItemPage();
  	  addItem.loginIcon(); 
  	  Thread.sleep(5000);
  	  addItem.loginuser("anjali_singh","May@2023");
  	  Thread.sleep(5000);
  	  addItem.loginBtn();
	       
    }
	
	 //Add Item into Cart
	@Test(priority=2)
    public void addItemTest() throws InterruptedException {
  	   
  	  addItem = new AddItemPage();
  	  Thread.sleep(1000);
  	  addItem.addItems("Samsung galaxy s7");
  	  addItem.addToCart();
  	  addItem.homePage();
  	  Thread.sleep(1000);
  	  addItem.addItems("Iphone 6 32gb");
  	  addItem.addToCart();
  	  Thread.sleep(5000);
  	  addItem.cartLink();
  	   
   }
	
   @Test(priority=3)
   public void viewCartTest() throws InterruptedException {
	  addItem = new AddItemPage();
	  Thread.sleep(5000);
	  addItem.viewCart();
  }
  @AfterTest
  public void tearDown() {
     driver.close();
  }


}
