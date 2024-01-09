package locators;

import org.openqa.selenium.*;

public class FormLocators {

    private WebDriver driver;
    private String FIRST_NAME_ID = "firstName";
    private String LAST_NAME_ID = "lastName";
    private String USER_EMAIL_ID = "userEmail";
    private String PRACTICE_FORM_XPATH = "//span[text()='Practice Form']";

    private String PHONE_NUMBER_ID = "userNumber";

    public FormLocators(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPracticeForm() {
        return driver.findElement(By.xpath(PRACTICE_FORM_XPATH));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id(FIRST_NAME_ID));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id(LAST_NAME_ID));
    }

    public WebElement getUserEmail() {
        return driver.findElement(By.id(USER_EMAIL_ID));
    }

    public WebElement getPhoneNumber() {
        return driver.findElement(By.id(PHONE_NUMBER_ID));
    }
    public void closeBrowser() {
        driver.quit();
    }
}
