package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmrepo.Generatejvm;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources",glue="org.stepdefintion",monochrome=true,dryRun=false,tags="@feature7",plugin= {"html:target","junit:C:\\Users\\ADMIN\\eclipse-workspace\\HomeBaseuk\\xmlrport\\failed.xml","json:C:\\Users\\ADMIN\\eclipse-workspace\\HomeBaseuk\\jsonreport\\rep.json","rerun:C:\\Users\\ADMIN\\eclipse-workspace\\HomeBaseuk\\src\\test\\resources\\failed.txt"})

public class Testrun {
@AfterClass
public static void reportgeneration() {
	Generatejvm.report("C:\\Users\\ADMIN\\eclipse-workspace\\HomeBaseuk\\jsonreport\\rep.json");
}
	

}
