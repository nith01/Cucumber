package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStepDefinition {

    WebDriver driver;
    @Given("^User is on login Page1$")
    public void user_is_on_login_page1() {
        System.setProperty("webdriver.chrome.driver",".\\resources\\driver\\chromedriver.exe" );
        driver=new ChromeDriver();
        driver.get("https://freecrm.com/");

    }

    @When("title of login page is FreeCRM")
    public void title_of_login_page_is_free_crm() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("#1 Free CRM customer relationship management software cloud",title);

    }

    @Then("User click on login button")
    public void user_click_on_login_button() {
       driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
    }

    @Then("User enters login Page2")
    public void user_enters_login_page2() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM",title);
    }

    @Then("User enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nitha01sa@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password123");

         }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
    driver.findElement(By.xpath("//div[@class = 'ui fluid large blue submit button']")).click();
    }

    @Then("User is on homepage")
    public void user_is_on_homepage() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM",title);
    }

}
