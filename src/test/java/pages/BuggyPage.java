package pages;

public class BuggyPage extends BasePage {
    
    private String registerButton = "//a[contains(text(),'Register')]";
    private String loginTextBox = "//input[@id='username']";
    private String firstNameTextBox = "//input[@id='firstName']";
    private String lastNameTextBox = "//input[@id='lastName']";
    private String passwordTextBox = "//input[@id='password']";
    private String confirmPasswordTextBox = "//input[@id='confirmPassword']";
    private String registerButtonForm = "//button[contains(text(),'Register')]";
    private String validateRegister = "//div[contains(text(),'Registration is successful')]";


    public BuggyPage (){
        super(driver);
    }

    public void navigateToBuggy (){
        navigateTo("https://buggy.justtestit.org/");
    }

    public void clickButtonRegister(){
        cliclElement(registerButton);
    }

    public void fillRegisterForm (String nombre, String apellido, String password){
        write(loginTextBox, generateUsername());
        write(firstNameTextBox, nombre);
        write(lastNameTextBox, apellido);
        write(passwordTextBox, password);
        write(confirmPasswordTextBox, password);
    }

    public void sendForm (){
        cliclElement(registerButtonForm);
    }

    public String checkRegisterUser (){
        return textFromElement(validateRegister);
    }

}