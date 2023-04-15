package com.stepdefi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.Base_class;

import io.cucumber.java.en.*;

public class Stepdefi extends Base_class{
	@Given("user launch url")
	public void user_launch_url() {
		url_Launch("https://www.catch.com.au/");

	}

	@When("user select category from dropdown")
	public void user_select_category_from_dropdown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropDown = driver.findElement(By.xpath("//span[text()='Shop All Categories']"));
		dropDown.click();
		WebElement liquor = driver.findElement(By.xpath("//div[text()='Grocery & Liquor']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(liquor).build().perform();

	   
	}

	@When("user select the brand and product")
	public void user_select_the_brand_and_product() throws InterruptedException {
		WebElement beer = driver.findElement(By.xpath("//a[text()='Beer']"));
		beer.click();
		Thread.sleep(2000);
		WebElement brand = driver.findElement(By.xpath("//span[text()='Brand']"));
		brand.click();
		driver.findElement(By.xpath("//div[text()='Budweiser']")).click();
		WebElement budweiser = driver.findElement(By.xpath("//a[text()='Budweiser Lager Beer 330mL Case of 24']"));
		budweiser.click();
	   
	}

	@Given("user select the product to addtocart")
	public void user_select_the_product_to_addtocart() {
		WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
		String actual = "Budweiser Lager Beer 330mL Case of 24";
		String expected = "Budweiser Lager Beer 330mL Case of 24";
		if (actual == expected) {
			System.out.println(actual);
			addToCart.click();
		}
	}

	@Given("user select gotocart")
	public void user_select_gotocart() {
		WebElement goToCart = driver.findElement(By.xpath("//div[@class='css-1dqee8g']"));
		goToCart.click();

	   
	}

}
