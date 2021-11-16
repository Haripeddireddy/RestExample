package TestRunner;

import org.junit.runner.Runwith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@Runwith(Cucumber.class)
@CucumberOptions(features="Features", glue={"StepDefinition"})

public class Runner
{
}