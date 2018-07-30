package resources;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object class for Result page
 * 
 * @author Prakruthi Nagaraj
 */

public class ResultPage {

  private WebDriver driver = null;

  @FindBy(css = "img[alt='Image result for hills']")
  private List<WebElement> images;

  public void clickNthImage(int n) {
    images.get(n).click();
  }

  public boolean isImageDisplayed(int n) {
    images.get(n).isDisplayed();
    return true;
  }

  public ResultPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
}
