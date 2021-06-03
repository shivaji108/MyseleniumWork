package com.demotest;

import org.testng.annotations.*;

public class Automation_demo {
	
	//@Test(groups=("S"))
	public void demo() {
		System.out.println("Hello");
	}
	//@Test(groups=("S"))
	public void demo1() {
		System.out.println("Hello1");
	}
	@Test
	public void demo2() {
		System.out.println("Hello2");
	}
	//@Test(priority=2)
	public void prior_test() {
		System.out.println("order1");
	}
	//@Test(priority=1)
	public void prior_test1() {
		System.out.println("order2");
	}
	@Test(enabled=false)
	public void prior_test2() {
		System.out.println("order3");
	}
	@BeforeMethod
	public void bmtest() {
		System.out.println("Helloooo");
	}
	@AfterMethod
	public void amtest() {
		System.out.println("hpyending");
	}
	@BeforeClass
	public void bctest() {
		System.out.println("Start-testing");
	}
	@AfterClass
	public void actest() {
		System.out.println("End-testing");
	}

}
