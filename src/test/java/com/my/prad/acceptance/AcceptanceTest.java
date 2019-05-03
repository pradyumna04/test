package com.my.prad.acceptance;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Acceptance Test
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:calc.feature")
public class AcceptanceTest {
}