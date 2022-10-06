package com.runner.adactin;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Adactin.feature", glue="com.stepdfn.adactin")
public class TestRunner {

}
