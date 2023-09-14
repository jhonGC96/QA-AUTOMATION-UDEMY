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
    private String loginTextboxToLogin = "//input [@name='login']";
    private String passTextboxToLogin = "//input [@name='password']";
    private String loginButton = "//button[contains(text(),'Login')]";
    private String adressTextbox = "//textarea[@id='address']";
    private String phoneTextbox = "//input[@id='phone']";
    private String hobbyDropdown ="//select[@id='hobby']";
    private String saveButton = "//button[contains(text(),'Save')]";
    private String updateSuccessAlert = "//body/my-app[1]/div[1]/main[1]/my-profile[1]/div[1]/form[1]/div[1]/div[1]/div[2]";
    private String logoutButton = "//a[contains(text(),'Logout')]";

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

    public void fillFormLogin (String user, String pass){
        write(loginTextboxToLogin,  user);
        write(passTextboxToLogin, pass);
    }

    public void clicLoginButton (){
        cliclElement(loginButton);
    }

    public void clicProfileButton (){
        goToLinkText("Profile");
    }

    public void fillFieldsToUpdate (String name, String lastname, String adress, String phone, String hobby){
        write(firstNameTextBox, name);
        write(lastNameTextBox, lastname);
        write(adressTextbox, adress);
        write(phoneTextbox, phone);
        selectFromDropdownByText(hobbyDropdown, hobby);
    }

    public void clicSaveButton (){
        cliclElement(saveButton);
    }

    public String validateTheUpdate(){
         return textFromElement(updateSuccessAlert);
    }

    public void clickLogout (){
        cliclElement(logoutButton);
    }

}