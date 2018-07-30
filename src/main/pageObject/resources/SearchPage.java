package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Page Object class for Search page
 * 
 * @author Prakruthi Nagaraj
 */

public class SearchPage {

  private WebDriver driver = null;

  @FindBy(id = "lst-ib")
  private WebElement searchBox;

  @FindBy(id = "mKlEF")
  private WebElement searchButton;

  public void setSearch(String searchData) {
    searchBox.sendKeys(searchData);
  }

  public boolean isSearchDisplayed() {
    searchBox.isDisplayed();
    return true;
  }

  public void clickSearchBtn() {
    searchButton.click();
  }

  public SearchPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

}
