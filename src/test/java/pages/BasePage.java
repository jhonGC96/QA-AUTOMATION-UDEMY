package pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.datafaker.Faker;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;
    Faker faker = new Faker();

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // To generate a fake name
    public String generateUsername() {
        String nombre = faker.name().firstName();
        System.out.println(nombre);
        return nombre;
    }

    // To naviate to any URL
    public static void navigateTo(String url) {
        driver.get(url);
    }

    // To clic in a link
    public void goToLinkText(String linkText) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText))).click();
        } catch (Exception e) {
            System.out.println("No se pudo dar click en el link");
            e.printStackTrace();
        }
    }

    public static void closeBrowser() {
        driver.quit();
    }

    // To find any webelement
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    // To clic in any webelement
    public void cliclElement(String locator) {
        try {
            Find(locator).click();
        } catch (Exception e) {
            System.out.println("No se pudo dar clic en el elemento: " + locator);
            e.printStackTrace();
        }
    }

    // To write something in a texbox
    public void write(String locator, String textToWrite) {
        try {
            Find(locator).clear();
            Find(locator).sendKeys(textToWrite);
        } catch (Exception e) {
            System.out.println("No se pudo ingresar el texto en el webElement: " + locator);
            e.printStackTrace();
        }
    }

    // To select a value from a dropdown
    public void selectFromDropdownByValue(String locator, String valueToSelect) {
        try {
            Select dropdown = new Select(Find(locator));
            dropdown.selectByValue(valueToSelect);
        } catch (Exception e) {
            System.out.println("No se pudo seleccionar el elemento del dropdown by value");
            e.printStackTrace();
        }
    }

    public void selectFromDropdownByIndex(String locator, Integer valueToSelect) {
        try {
            Select dropdown = new Select(Find(locator));
            dropdown.selectByIndex(valueToSelect);
        } catch (Exception e) {
            System.out.println("No se pudo seleccionar el elemento del dropdown by index");
            e.printStackTrace();
        }

    }

    public void selectFromDropdownByText(String locator, String valueToSelect) {
        try {
            Select dropdown = new Select(Find(locator));
            dropdown.selectByVisibleText(valueToSelect);
        } catch (Exception e) {
            System.out.println("No se pudo seleccionar el elemento del dropdown by text");
            e.printStackTrace();
        }

    }

    public void overElement(String locator) {
        try {
            action.moveToElement(Find(locator));
        } catch (Exception e) {
            System.out.println("Error al mover el elemento");
            e.printStackTrace();
        }

    }

    public void doubleClick(String locator) {
        try {
            action.doubleClick(Find(locator));
        } catch (Exception e) {
            System.out.println("No fue posible dar doble clic en el elemento");
            e.printStackTrace();
        }

    }

    public void rightClick(String locator) {
        try {
            action.contextClick(Find(locator));
        } catch (Exception e) {
            System.out.println("No fue posible dar clic derecho en el elemento");
            e.printStackTrace();
        }

    }

    public String getValueFromTheTable(String locator, int row, int column) {
        String cellINeed = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";
        return Find(cellINeed).getText();
    }

    public void setValueOnTable(String locator, int row, int column, String stringToSend) {
        try {
            String cellToFill = locator + "/table/tbody/tr[" + row + "]/td[" + column + "]";
            Find(cellToFill).sendKeys(stringToSend);
        } catch (Exception e) {
            System.out.println("Error al setear el valor en la tabla");
            e.printStackTrace();
        }

    }

    public void switchtoiFrame(String iFrameIndex) {
        try {
            driver.switchTo().frame(iFrameIndex);
        } catch (Exception e) {
            System.out.println("Error en función switchtoiFrame");
            e.printStackTrace();
        }
        
    }

    public void switchToParentFrame() {
        try {
            driver.switchTo().parentFrame();
        } catch (Exception e) {
            System.out.println("Error en función switchToParentFrame");
            e.printStackTrace();
        }
        
    }

    public void dismissAlert() {
        try {
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }

    // To return a text to validate
    public String textFromElement(String locator) {
        return Find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator) {
        return Find(locator).isDisplayed();
    }

    public boolean elementIsEnable(String locator) {
        return Find(locator).isEnabled();
    }

    public boolean elementIsSelected(String locator) {
        return Find(locator).isSelected();
    }

    public List<WebElement> bringMeAllElements(String locator) {
        return driver.findElements(By.className(locator));
    }

}