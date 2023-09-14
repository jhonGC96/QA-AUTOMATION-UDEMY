package steps;
import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given ("^i am on the Google search page$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
    }

    @When ("^i enter a search criteria$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("méxico");
    }

    @And ("^clic on the search button$")
    public void clicSearchButton(){
        google.clicGoogleSearch();
    }

    @Then ("^the results match the criteria$")
    public void validateResults(){
        Assert.assertEquals("México - Wikipedia, la enciclopedia libre", google.firstResult()); 
    }
}
