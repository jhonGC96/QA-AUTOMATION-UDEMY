package steps;

import pages.BuggyPage;
import org.junit.Assert;
import io.cucumber.java.en.*;


public class BuggySteps {
    BuggyPage buggy = new BuggyPage();

    //Background

    @Given ("^that the user navigate to buggycars$")
    public void navigateToBuggy (){
        buggy.navigateToBuggy();
    }

    //Scenario: As a user i try to register in buggycars
    //Steps

    @And ("^the user clicks to the register button$")
    public void clickButtonRegister(){
        buggy.clickButtonRegister();
    }

    @When ("^the user fills out the form with the login, name (.+), lastname (.+), y contraseña (.+)")
    public void fillForm(String nombre, String apellido, String password){
        buggy.fillRegisterForm(nombre, apellido, password);
    }

    @And ("^i send the form with the register button$")
    public void sendForm(){
        buggy.sendForm();
    }

    @Then ("^i can show the message 'Registration is successful'$")
    public void checkRegisterUser(){
        Assert.assertEquals("Registration is successful", buggy.checkRegisterUser());
    }

    // Scenario Outline: As a user i want to update the user profile
    //Steps

    @And ("^the user fills the login form with username (.+) and password (.+)$") 
    public void fillFormLogin(String user, String pass){
        buggy.fillFormLogin(user, pass);
    }

    @And ("^the user clicks in login button$")
    public void clicLoginButton(){
        buggy.clicLoginButton();
    }

    @When ("^the user clicks in profile button$")
    public void clicProfileButton(){
        buggy.clicProfileButton();
    }
    
    @And ("^the user puts the new name (.+), lastname (.+), adress (.+), phone (.+), and hobby (.+)$")
    public void updateFields(String name, String lastname, String adress, String phone, String hobby){
        buggy.fillFieldsToUpdate(name, lastname, adress, phone, hobby);
    }

    @And ("^the user clicks in the Save button$")
    public void clicSaveButton(){
        buggy.clicSaveButton();
    }

    @Then ("^The user can see the message 'The profile has been saved successful'$")
    public void validateTheUpdate(){
        Assert.assertEquals("The profile has been saved successful", buggy.validateTheUpdate());
        buggy.clickLogout();
    }
    
}
