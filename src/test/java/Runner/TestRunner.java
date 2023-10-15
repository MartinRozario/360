package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/001_RegisterPage.feature"},
        glue = {"StepDefs"},   monochrome = true,
        dryRun = false,
        tags = "@Reg",
        plugin = {"pretty","html:build/reports/360.html"})
@Test
class TestRunner extends AbstractTestNGCucumberTests{
}