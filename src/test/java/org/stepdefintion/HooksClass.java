package org.stepdefintion;

import org.BaseandPojo.Baseclass;
import org.junit.Before;

public class HooksClass extends Baseclass {

	@Before
	public void precondition1() {
		
		System.out.println("the test is done");
	}

}
