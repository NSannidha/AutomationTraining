package trainingSel.SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Hello Selenium!");
    //specify webdriver path
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\0029FE744\\eclipse-workspace\\SeleniumTraining\\Drivers\\chromedriver.exe");
    WebDriver wd = new ChromeDriver();
    wd.manage().window().maximize();
    Thread.sleep(2000);
    //Navigate to url
    //wd.get(null);
    wd.close();
  }
}
