package MyProjects.SeleniumQuestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import resources.ResultPage;
import resources.SearchPage;

public class ImageTest {

  /**
   * This methods launches "http://image.google.com", searches for "hills" and clicks on the 5th
   * image in the result page
   * 
   * @author Prakruthi Nagaraj
   */

  @Test
  public void imageSearch() {
    System.setProperty("webdriver.chrome.driver", "/Users/pnagaraj/rdcFramework/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://image.google.com");
    SearchPage sp = new SearchPage(driver);
    ResultPage rp = new ResultPage(driver);
    sp.isSearchDisplayed();
    sp.setSearch("hills");
    sp.clickSearchBtn();
    rp.isImageDisplayed(5);
    rp.clickNthImage(5);
    driver.quit();
  }
}
