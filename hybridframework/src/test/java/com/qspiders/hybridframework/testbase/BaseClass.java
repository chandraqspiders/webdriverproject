package com.qspiders.hybridframework.testbase;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClass {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launch app");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("login");	 
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("logout");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Quit");
	}

}
