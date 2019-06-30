package steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.RuntimeOptionsFactory;
import org.junit.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WikiSteps {

@Before
public void before(){
    cucumber.runtime.RuntimeOptionsFactory factory = new RuntimeOptionsFactory(Cucumber.class);

}
    @Given("^Open the Wiki page$")
    public void openTheWikiPage() throws InterruptedException {
        String url = "http://wikipedia.hu";
        open(url);
    }
    @Then("^Wait a little$")
    public void waitALittle(){
        sleep(5000);
    }
//    @Given("Open the Wiki page")
//    public void open_the_Wiki_page() {
//        String url = "http://wikipedia.hu";
//        open(url);
//        sleep(5000);
//    }
    @Then("^Failed$")
    public void failed(){
        $("#username").shouldHave(text("Hello, Johny!"));
        Assert.fail();
    }
}
