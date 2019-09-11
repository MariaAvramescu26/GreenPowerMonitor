package dnv_gl.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLogin {
	public static final String PAGE_URL = "https://fsext1.dnv.com/adfs/ls/?SAMLRequest=rVJBTsMwEPxK5HviJJDQWE2lUIRAKqKihQOXynU2raVkHbxOVX5PEqDApSckX7w7452Z9ZRkU7ei6Nwen%2bCtA3LesamRxNDIWWdRGEmaBMoGSDglVsXDQsRBKCQRWKcNMu%2f%2bJmebTKkIwvjCz6ow8S%2bTLPSzJAR%2fEk7SrSxlVamIeS9gqefkrH%2biJxJ1cI%2fkJLq%2bFEaZH%2fYnWUdXIo5EkgbRJL5I0%2bSVeTe9OI3Sjey9cy0JziuCo4uCEg%2bBMg2XZUW8Js68W2MVjL5yVsmaYBi27DXrA5wqS2ucUaa%2b1lhq3J33u%2f0Ekbhbr5f%2b8nG1Zl7xncHcIHUN2BXYg1bw%2fLT40Vibncag0coaMpUzWGuEUa4D3ivf1dtYtdaUgcETauxfx%2fNNVGy2koCPm%2bJEhp%2bCV19D2a%2bdtedNtF%2bO2Ww6oMW4ADuk1Uh3njpUdOlXI1QAOu3e2exfTU75L1Gzz9vf3zn7AA%3d%3d&RelayState=StateProperties%3deyJUSUQiOiIwZDM3MDQyMS0yOTc0LTQ0MTgtYWI0NC1jZWJkZDdjMjM4NzkifQ&SigAlg=http%3a%2f%2fwww.w3.org%2f2000%2f09%2fxmldsig%23rsa-sha1&Signature=f1J9Gr2jIWyEfQWchE%2b3rLhvnPgsN4Tn6j9OQEhVuEhUo8Zd0KpQOqm8%2fFP8ivcY4QL86dmBmtpt4vTc3Cwbj2XUwNnPq2eirLxLAJMEOwrjkJpo7fImR3ukIvXk6IH%2fAuK%2bt0NZpr%2bb9PqhAI1CNSrG0juRJhYIvEivpdO9QYs7MtSGgoh6RXpHagpWfSv4FVo3rbU4j%2bf5bLpMS4NYFlO1n%2fwxo2mlkGtLR5k98Onz5rTHTheMp8sF%2btHBRF1xE8mYxPX4idlIhFlqNfgIkRszh0fGoXjRgQi2kAOZP8ODubQl7IUUtWlbvOMV7%2bRKuc2s0aSXHXvlQVTmEYSiEA%3d%3d&RedirectToIdentityProvider=http%3a%2f%2ffsext1.dnv.com%2fadfs%2fservices%2ftrust";
	public static final String PAGE_TITLE = "Sign In";
	public static final String CORRECT_PASSWORD_FOR_SIGN_IN= "Password123!";
	public static final String ERR_NO_USERNAME_PASSWORD = "Enter your email address in the format \"user@domain\".";
	public static final String ERR_INCORRECT_USERNAME_OR_PASSWORD = "Incorrect email or password. Please try again.";
	public static final String ERR_ENTER_PASSWORD = "Enter your password.";
	public static @FindBy(id = "userNameInput") WebElement EMAIL_INPUT_TEXTFIELD;
	public static @FindBy(id = "passwordInput") WebElement PASSWORD_INPUT_TEXTFIELD;
	public static @FindBy(id = "submitButton") WebElement ELEM_LOG_IN;
	public static @FindBy(id = "errorText") WebElement SIGN_IN_ERROR_NO_USER;
	public @FindBy(css = "div.recaptcha-checkbox-border") WebElement REGISTER_I_AM_NOT_A_ROBOT;
	public static final String PAGE_TITLE_FORGOT_PW = "My services | Veracity by DNV GL - I forgot my password";
	public static final String PAGE_TITLE_REGISTER = "My services | Veracity by DNV GL - Register";
	public static @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div/div/div[3]/a") WebElement ELEM_FORGOT_MY_PW;
	public static @FindBy(id = "newUserProfile") WebElement ELEM_REGISTER_NW;



	WebDriver driver;


	public PageLogin (WebDriver driver) {
		this.driver = driver;
	}
	public void clickLogIn(){clickElements(ELEM_LOG_IN);
	}

	public void clickForgotPW(){clickElements(ELEM_FORGOT_MY_PW);
	}

	public void clickRegisterNW(){clickElements(ELEM_REGISTER_NW);
	}


	public void clickElements(WebElement element){

		element.click();

	}

}
