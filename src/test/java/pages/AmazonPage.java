package pages;

import java.util.NoSuchElementException;


public class AmazonPage extends BasePage {
    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String thirdProduct = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]";
    private String carButton = "//input[@id='add-to-cart-button']";
    private String carValidation = "//span[contains(text(),'Agregado al carrito')]";

    public AmazonPage() {
        super(driver);
    }

    public void navigateToAmazon() {
        try {
            navigateTo("https://www.amazon.com/");
        } catch (NoSuchElementException e) {
            System.out.println("The page couln´t be found");
            e.printStackTrace();
        }
    }

    public void enterSearchText(String textToWrite) {
        try {
            write(searchBox, textToWrite);
        } catch (NoSuchElementException e) {
            System.out.println("The searchBox couln´t be found");
            e.printStackTrace();
        }
    }

    public void clicSearchButton() {
        try {
            cliclElement(searchButton);
        } catch (NoSuchElementException e) {
            System.out.println("The searchButton couln´t be found");
            e.printStackTrace();
        }
    }

    public void clicSecondPage() {
        try {
            goToLinkText("2");
        } catch (NoSuchElementException e) {
            System.out.println("The secondPage button couln´t be found");
            e.printStackTrace();
        }
    }

    public void clicThirdProduct() {
        cliclElement(thirdProduct);
    }

    public void clicAddCar(){
        cliclElement(carButton);
    }

    public String checkAddCar(){
        return textFromElement(carValidation);
    }

}
