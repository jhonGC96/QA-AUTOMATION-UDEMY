package pages;

public class SandboxPage extends BasePage {
    private String categoryDropdown = "//select[@id='selectOperationDropdown']";
    public SandboxPage (){
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("https://testsheepnz.github.io/BasicCalculator.html");
    }

    public void selectCategory(String category){
        //selectFromDropdownByIndex(categoryDropdown, category);
        //selectFromDropdownByText(categoryDropdown, category);
        selectFromDropdownByValue(categoryDropdown, category);
    }
}
