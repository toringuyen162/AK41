package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    /**
     * TODO: 3. Fill in username with tosmith
     * tag: input
     * attributes:
     * +type=text
     * name=username
     * id=username
     * text:N/A
     */
    @Test
    void successfullyWithValidCredentials(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        /**
         * todo: 4. Fill in the passowrd with SuperSecretPassword!
         *
         */
    }
}
