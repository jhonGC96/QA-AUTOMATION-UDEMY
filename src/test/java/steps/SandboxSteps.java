package steps;
import io.cucumber.java.en.*;
import pages.SandboxPage;

public class SandboxSteps {
    SandboxPage sandbox = new SandboxPage();
    @Given ("^i navigate to the sandbox page")
    public void navigateToCalculator(){
        sandbox.navigateToSandbox();
    }

    @And ("^select a value from the dropdown")
    public void selectFromDropdown(){
        sandbox.selectCategory("4");
    }
}