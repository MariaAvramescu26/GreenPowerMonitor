package dnv_gl.com.tests;

import java.io.IOException;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import dnv_gl.com.pages.PageLogin;


public class LoginTests {
    WebDriver driver;
    PageLogin pageLogin;
    WebDriverWait wait;
    Random random;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws IOException{
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        random = new Random();
        this.driver.manage().window().maximize();
        pageLogin = PageFactory.initElements(driver, PageLogin.class);
        driver.get(PageLogin.PAGE_URL);
        wait = new WebDriverWait(driver,6000);
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void TC02_test_user_cannot_login_without_email_and_password() throws InterruptedException{
        pageLogin.clickLogIn();
        wait.until(ExpectedConditions.titleIs(PageLogin.PAGE_TITLE));
        Assert.assertEquals(PageLogin.SIGN_IN_ERROR_NO_USER.getText(), PageLogin.ERR_NO_USERNAME_PASSWORD);
    }

    @Test
    public void TC03_test_user_can_navigate_to_forgot_password_page() throws InterruptedException{
        pageLogin.clickForgotPW();
        wait.until(ExpectedConditions.titleIs(PageLogin.PAGE_TITLE_FORGOT_PW));
        Assert.assertEquals(driver.getTitle(), PageLogin.PAGE_TITLE_FORGOT_PW);
    }

    @Test
    public void TC04_test_user_can_navigate_to_register_now_page() throws InterruptedException{
        pageLogin.clickRegisterNW();
        wait.until(ExpectedConditions.titleIs(PageLogin.PAGE_TITLE_REGISTER));
        Assert.assertEquals(driver.getTitle(), PageLogin.PAGE_TITLE_REGISTER);
    }

    @Test
    public void TC05_user_can_not_sign_in_with_user_not_existent() throws InterruptedException{
        int randomPass = random.nextInt();
        wait.until(ExpectedConditions.titleIs(PageLogin.PAGE_TITLE));
        pageLogin.EMAIL_INPUT_TEXTFIELD.sendKeys("userNotExistent");
        pageLogin.clickLogIn();
        Assert.assertEquals(PageLogin.SIGN_IN_ERROR_NO_USER.getText(), PageLogin.ERR_ENTER_PASSWORD);
        pageLogin.PASSWORD_INPUT_TEXTFIELD.sendKeys(Integer.toString(randomPass));
        pageLogin.clickLogIn();
        Assert.assertEquals(PageLogin.SIGN_IN_ERROR_NO_USER.getText(), PageLogin.ERR_INCORRECT_USERNAME_OR_PASSWORD);
    }

    //this fails because of a bug => returns bad requests
    @Test
    public void TC06_user_can_successfully_sign_in() throws InterruptedException{
      //precondition -  user is already registered
        pageLogin.EMAIL_INPUT_TEXTFIELD.sendKeys("maria.avramescu123@gmail.com");
        pageLogin.PASSWORD_INPUT_TEXTFIELD.sendKeys(PageLogin.CORRECT_PASSWORD_FOR_SIGN_IN);
        pageLogin.clickLogIn();
        Assert.assertTrue( !driver.getTitle().equals(""));
    }}
