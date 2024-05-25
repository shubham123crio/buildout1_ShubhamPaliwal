package buildout1_shubhampaliwal;

import org.openqa.selenium.WebElement;

public class wrapperClass {

public static void wrapperClick(WebElement element) throws InterruptedException{
element.click();
Thread.sleep(2000);
}
public static void wrapperSendKeys(WebElement element, String text) throws InterruptedException{
element.sendKeys(text);
Thread.sleep(2000);
}
   
}   

