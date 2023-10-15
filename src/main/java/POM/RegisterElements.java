package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterElements {
    static WebDriver driver;
    public RegisterElements(WebDriver driver){ RegisterElements.driver=driver;}
    By firstName=By.xpath("//div[@id='form-first_name']/input");
    By lastName=By.xpath("//input[@id=\"last_name\"]");
    By eMail=By.xpath("//input[@data-q=\"email\"]");
    By phone=By.xpath("//input[@name=\"phone\"]");
    By message=By.xpath("//textarea[@class=\"form-control\"]");
    By checkBox=By.xpath("//input[@type=\"checkbox\"]");
    By captcha=By.xpath("//div[@class='recaptcha-checkbox-border']");
    By submit=By.xpath("(//button[@type='submit'])[1]");

    public void UserInput1(String First, String Last, String Email)throws InterruptedException{
       Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(3000);
        driver.switchTo().frame("inline-xQyVCIFgqlFo7HJjeLPA");
        driver.findElement(firstName).click();
        driver.findElement(firstName).sendKeys(First);
        driver.findElement(lastName).click();
        driver.findElement(lastName).sendKeys(Last);
        driver.findElement(eMail).click();
        driver.findElement(eMail).sendKeys(Email);

    }
    public void UserInput2(String Phone, String Text) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(phone).click();
        driver.findElement(phone).sendKeys(Phone);
        driver.findElement(message).click();
        driver.findElement(message).sendKeys(Text);
    }
    public void CheckBox1() throws InterruptedException{
        driver.findElement(checkBox).click();
        Thread.sleep(2000);
    }
    public void Captcha() throws InterruptedException{
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(captcha)).click();
       // driver.findElement(captcha).click();
        Thread.sleep(10000);
    }
    public void Submit() throws InterruptedException{
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
       // driver.switchTo().frame("inline-xQyVCIFgqlFo7HJjeLPA");
       // driver.switchTo().frame(0);
        driver.findElement(submit).click();
        Thread.sleep(10000);
    }
    public void Close(){
        driver.close();
    }
}
