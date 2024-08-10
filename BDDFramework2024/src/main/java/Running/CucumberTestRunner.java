package Running;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(tags="",features= {"src/test/resources/Features/fb_login.feature"}, 
glue= {"stepDefinitions"},
plugin= {"pretty","html:target/htmlreport.html"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests  {

}
