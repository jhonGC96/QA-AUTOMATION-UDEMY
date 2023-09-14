package steps;

import pages.BuggyPage;
import org.junit.Assert;
import io.cucumber.java.en.*;


public class BuggySteps {
    BuggyPage buggy = new BuggyPage();
    @Given ("^that the user navigate to buggycars$")
    public void navigateToBuggy (){
        buggy.navigateToBuggy();
    }

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
}
