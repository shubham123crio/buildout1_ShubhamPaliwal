package buildout1_shubhampaliwal;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleForm {
    
WebDriver driver;

String url= "https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform";

@FindBy(xpath="//div[@class= 'Xb9hP']/div[text()= 'Your answer']/preceding-sibling::input")
  WebElement nameTxtbox;
@FindBy(xpath="//div[@class= 'Pc9Gce Wic03c']/textarea")
  WebElement practiceAutTxtbox;
@FindBy(xpath="//span[text()= '6 - 10']/ancestor::div[@class='bzfPab wFGF8']/div")
  WebElement expRadioBtn;
@FindBy(xpath="//div[@role='checkbox']")
 List <WebElement> skillChkBox;
@FindBy(xpath="//div[@aria-label= 'Springboot']")
  WebElement skillSprintBoot;
@FindBy(xpath="//span[text()='Choose']")
  WebElement titleDrpDwn;
@FindBy(xpath="//div[@data-value='Mr' and @role='option']")
  WebElement titleSelect;
@FindBy(xpath="//input[@type='date']")
  WebElement dateField;
@FindBy(xpath="//input[@aria-label='Hour']")
  WebElement timeHourField;
@FindBy(xpath="//input[@aria-label='Minute']")
  WebElement timeMinuteField;
@FindBy(xpath="//div[@aria-label='AM or PM']/div/div[2]")
  WebElement timeDropDwn;
@FindBy(xpath="//span[text()='AM']")
  WebElement timeinAM;
@FindBy(xpath="//span[text()='PM']")
  WebElement timeinPM;
@FindBy(xpath="//span[text()='Submit']")
  WebElement submitBtn;

public GoogleForm(WebDriver driverX){
this.driver= driverX;
PageFactory.initElements(driver, this);
}

public void loadUrl() throws InterruptedException{
if(driver.getCurrentUrl() != url)
driver.get(url);
Thread.sleep(3000);
}

public void name() throws InterruptedException{
wrapperClass.wrapperSendKeys(nameTxtbox, "Shubham Paliwal");
}

public void yPractiseAutomation() throws InterruptedException{
	long currentTimestamp = System.currentTimeMillis();
	String epoch= Long.toString(currentTimestamp);
String text= "I want to be the best QA Engineer! "+epoch;
wrapperClass.wrapperSendKeys(practiceAutTxtbox, text);
}

public void experience() throws InterruptedException{
wrapperClass.wrapperClick(expRadioBtn);
}

public void skills() throws InterruptedException{
for(WebElement skill: skillChkBox){
    wrapperClass.wrapperClick(skill);
}
wrapperClass.wrapperClick(skillSprintBoot);
}

public void salutationTitle() throws InterruptedException{
wrapperClass.wrapperClick(titleDrpDwn);
wrapperClass.wrapperClick(titleSelect);
}

public void date7daysAgo() throws InterruptedException{
Calendar cal = Calendar.getInstance();
cal.add(Calendar.DATE, -7);
SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
String formatted = format1.format(cal.getTime());  
wrapperClass.wrapperSendKeys(dateField, formatted);
}

public void currentTimeNow() throws InterruptedException{
    Calendar cal = Calendar.getInstance();
    int hour= cal.get(Calendar.HOUR_OF_DAY);
    int minute= cal.get(Calendar.MINUTE);
    wrapperClass.wrapperSendKeys(timeHourField, String.valueOf(hour));
    wrapperClass.wrapperSendKeys(timeMinuteField, String.valueOf(minute));
    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    // WebElement dropdwn= wait.until(ExpectedConditions.visibilityOf(timeDropDwn));
    // wrapperClass.wrapperClick(dropdwn);
    // if(hour>12)
    // wrapperClass.wrapperClick(timeinPM);
    // else
    // wrapperClass.wrapperClick(timeinAM);
}

public void submit() throws InterruptedException{
wrapperClass.wrapperClick(submitBtn);
}

}
