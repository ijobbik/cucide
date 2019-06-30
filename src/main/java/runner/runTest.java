package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@Cucumber.Options(
//        format = {"pretty", "html:target/Destination"} )

//https://testingneeds.wordpress.com/2015/09/15/junit-runner-with-cucumberoptions/
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",
        glue = "steps",
        plugin = {"pretty"
        ,"junit:Folder_Name/cucumber.xml"})
public class runTest {

}
