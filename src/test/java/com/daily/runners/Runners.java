package com.daily.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        monochrome = true, //makes the console output more readable

        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",

        },

        features = "src/test/resources/feature",
        glue = {"com.gfc.stepDefinitions"},
        tags = "",
        dryRun =false


)
public class Runners {



}











/*
Runner class is used to run the feature files
@RunWith : makes this class runnable
@CucumberOptions :
    1. features : path of the features' folder
    2. glue : path of the step definitions folder

    @smoke_test --> bunu birden fazla Scenarionun ustune yazabiliriz,
    sadece yazdigimiz scenario lar run yapar.
    tabi run class ta tags kismina da yazmamiz lazim
 */
/*
Review:
------------------------------------------------
tags   => tags allow us to run specific test cases (scenario, scenario outline, feature)
        kind of filteration
dryRun =>  true, false
           to check and generate the missing step definitions in framework
           We can run our test without browser and check the missing step definitions
           it is faster
Background =>   This is like @Before method
                for repeated pre conditions
                We put the Background after Feature keyword
                It runs before every Screanio
parameterization => reusability of step definition
                    dynamic step definition
                    prevent repetitions
                    by using double quotes "..."
 */