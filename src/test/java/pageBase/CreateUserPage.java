package pageBase;

import utils.BasicConfiguration;
import org.openqa.selenium.WebDriver;

public class CreateUserPage extends BasicConfiguration {

    public CreateUserPage(WebDriver driver) {
        super(driver);
    }

    CreateUserObjects pageObjects = new CreateUserObjects(driver);

    public CreateUserPage clickForm() {
        pageObjects.getMenuForm().click();
        waitTo(1);
        return this;
    }

    public CreateUserPage clickCreateUserForm() {
        pageObjects.getMenuCreateUserForm().click();
        waitTo(1);
        return this;
    }

    public CreateUserPage insertName(String username) {
        pageObjects.getInputUsername().sendKeys(username);
        waitTo(1);
        return this;
    }

    public CreateUserPage insertLastName(String lastName) {
        pageObjects.getInputLastName().sendKeys(lastName);
        waitTo(1);
        return this;
    }

    public CreateUserPage insertUserEmail(String email) {
        pageObjects.getInputUserEmail().sendKeys(email);
        waitTo(1);
        return this;
    }

    public CreateUserPage insertAddress(String address) {
        pageObjects.getInputUserAddress().sendKeys(address);
        waitTo(1);
        return this;
    }

    public CreateUserPage insertUniversity(String university) {
        pageBase.getInputUserUniversity().sendKeys(university);
        waitTo(1);
        return this;
    }

    public CreateUserPage insertUserProfile(String profile) {
        pageBase.getInputUserProfile().sendKeys(profile);
        waitTo(1);
        return this;
    }

    public CreateUserPage insertUserGender(String gender) {
        pageBase.getInputUserGender().sendKeys(gender);
        waitTo(1);
        return this;
    }

    public CreateUserPage insertInputUserAge(String age) {
        pageBase.getInputUserAge().sendKeys(age);
        waitTo(1);
        return this;
    }

    public CreateUserPage clickButtonCommit() {
        pageBase.getButtonCommit().click();
        waitTo(1);
        return this;
    }
}
