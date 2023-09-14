package steps;
import org.junit.Assert;
import io.cucumber.java.en.*;
import pages.TablePage;

public class TableSteps {
    TablePage table = new TablePage();
    @Given ("^I navigate to the static table$")
    public void navigateToTable(){
        table.navigateToTable();
    }

    @Then ("^i can return the value i wanted$")
    public void returnValue(){
        String value = table.getValueFromTheTable(3, 2);
        Assert.assertEquals("r: 2, c: 1", value);
    }

    @Then ("^I can validate the table is displayed$")
    public void theTableIsThere(){
        Assert.assertTrue("El elemento no está siendo mostrado", table.cellStatus());
    }

}