package steps;
import org.junit.Assert;
import io.cucumber.java.en.*;
import pages.AmazonPage;

public class AmazonSteps {
    AmazonPage amazon = new AmazonPage();
    @Given ("^than a user i navigate to amazon$")
    public void navigateToAmazon(){   
        amazon.navigateToAmazon();
    }

    @And ("^i search for (.+)$")
    public void search(String product){
        amazon.enterSearchText(product);
        amazon.clicSearchButton();
    }

    @When ("^navigate to the second page$")
    public void clicSecondPage(){
        amazon.clicSecondPage();
    }

    @And ("^select the third item$")
    public void selectElement(){
        amazon.clicThirdProduct();
    }

    @Then ("^the user is able to add the item to the car$")
    public void addToCar(){
        amazon.clicAddCar();
        Assert.assertEquals("Agregado al carrito", amazon.checkAddCar());
    }

}
