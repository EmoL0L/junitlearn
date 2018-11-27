package com.emolol.learn.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
	TestAssertions.class ,TestAttributes.class
})

public class TestSuite {

}
