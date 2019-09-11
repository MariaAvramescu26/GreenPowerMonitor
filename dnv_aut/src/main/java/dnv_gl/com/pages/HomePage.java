package dnv_gl.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;
    public static final String PAGE_URL = "https://www.dnvgl.com/";
    public static final String PAGE_TITLE = "DNVGL.com - Safer Smarter Greener - DNV GL";


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public static final String PAGE_TITLE_NEWS_MEDIA = "News and media - DNV GL";
    public static final String PAGE_TITLE_CAREER = "Careers in DNV GL - DNV GL";
    public static final String PAGE_TITLE_CONTACT_DNV = "Contact DNV GL - DNV GL";
    public static final String PAGE_TITLE_OFFICE_LOCATOR = "Find our locations worldwide - DNV GL";
    public static final String PAGE_TITLE_MEDIA_CONTACT = "Press contacts - DNV GL";
    public static final String PAGE_TITLE_VERACITY = "Veracity by DNV GL";
    public static @FindBy(xpath = "/html/body/section/header/section/a") WebElement ELEM_SIGN_IN;
    public static @FindBy(xpath = "/html/body/section/footer/section[1]/div/div/div[2]/section/ol/li[1]/a") WebElement ELEM_ABOUT;
    public static @FindBy(xpath = "/html/body/section/footer/section[1]/div/div/div[2]/section/ol/li[2]/a") WebElement ELEM_newsevent;
    public static @FindBy(xpath = "/html/body/section/footer/section[1]/div/div/div[2]/section/ol/li[3]/a") WebElement ELEM_CAREER;
    public static @FindBy(xpath = "/html/body/section/footer/section[1]/div/div/div[3]/section/ol/li[1]/a") WebElement ELEM_CONTACTDNV;
    public static @FindBy(xpath = "/html/body/section/footer/section[1]/div/div/div[3]/section/ol/li[2]/a") WebElement ELEM_OFFICELOCATOR;
    public static @FindBy(xpath = "/html/body/section/footer/section[1]/div/div/div[3]/section/ol/li[3]/a") WebElement ELEM_MEDIACONTACT;
    public static @FindBy(xpath = "/html/body/section/footer/section[1]/div/div/div[3]/section/ol/li[4]/a") WebElement ELEM_VERACITY;


    public void clickNewsAndEventButton(){clickElements(ELEM_newsevent);
    }
    public void clickCareerButton(){clickElements(ELEM_CAREER);
    }

    public void clickcontactDNVGLButton(){clickElements(ELEM_CONTACTDNV);
    }
    public void clickFindOurOfficesButton(){clickElements(ELEM_OFFICELOCATOR);
    }
    public void clickMediaContactButton(){clickElements(ELEM_MEDIACONTACT);
    }
    public void clickVeracityButton(){clickElements(ELEM_VERACITY);
    }

    public void clickElements(WebElement element){
        element.click();
    }

}
