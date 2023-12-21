package automationjava.automationjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.browserstack.com");
//	
	Practice pr = new Practice();	
	
//	int[] arr= {6,4,801,0,9,-3,70,-100,66,32};
//	int[] arr1= {5,4,3,2,1,0};
//	
//	pr.findMin(arr);
//	pr.findMax(arr);
//	pr.reverse(arr1);
//	System.out.println();
//	pr.sort(arr);
//	pr.secondLargest(arr);
	String str = "           bua             T          ";
	String strl="           one two three four five six    .  ";
	pr.find_num_words(strl);
	
	}
}
