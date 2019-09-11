package dnv_gl.com.tests;
/**
 * This class is verifying that user is able to navigate to different pages from the home page
 */

import java.io.IOException;

import dnv_gl.com.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests {
	WebDriver driver;
	HomePage homePage;


	@BeforeMethod(alwaysRun = true)
	public void setUp() throws IOException{
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		homePage = PageFactory.initElements(driver, HomePage.class);
		driver.get(HomePage.PAGE_URL);
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void TC01_user_can_successfully_navigate_to_home_page(){
		Assert.assertEquals(driver.getTitle(), HomePage.PAGE_TITLE);
	}

	@Test
	public void TC02_user_can_successfully_navigate_to_news_and_events_page(){
		homePage.clickNewsAndEventButton();
		Assert.assertEquals(driver.getTitle(), HomePage.PAGE_TITLE_NEWS_MEDIA);
	}


	@Test
	public void TC03_user_can_successfully_navigate_to_carriers_page(){
		homePage.clickCareerButton();
		Assert.assertEquals(driver.getTitle(), HomePage.PAGE_TITLE_CAREER);
	}


	@Test
	public void TC04_user_can_successfully_navigate_to_contact_dnvgl_page(){
		homePage.clickcontactDNVGLButton();
		Assert.assertEquals(driver.getTitle(), HomePage.PAGE_TITLE_CONTACT_DNV);
	}


	@Test
	public void TC05_user_can_successfully_navigate_to_find_our_offices_page(){
		homePage.clickFindOurOfficesButton();
		Assert.assertEquals(driver.getTitle(), HomePage.PAGE_TITLE_OFFICE_LOCATOR);
	}


	@Test
	public void TC06_user_can_successfully_navigate_to_media_contact_page(){
		homePage.clickMediaContactButton();
		Assert.assertEquals(driver.getTitle(), HomePage.PAGE_TITLE_MEDIA_CONTACT);
	}


	@Test
	public void TC07_user_can_successfully_navigate_to_veracity_page(){
		homePage.clickVeracityButton();
		Assert.assertEquals(driver.getTitle(), HomePage.PAGE_TITLE_VERACITY);
	}


}
