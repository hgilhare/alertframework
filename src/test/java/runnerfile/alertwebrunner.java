package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/featurefile",glue= {"stepdefination","helper"},tags="@Reg",plugin="html:target/report/test1.html")
public class alertwebrunner {

}
