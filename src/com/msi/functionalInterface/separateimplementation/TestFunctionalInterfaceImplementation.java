package com.msi.functionalInterface.separateimplementation;

public class TestFunctionalInterfaceImplementation implements TestFunctionalInterface{

	@Override
	public void printSomething() {
		System.out.println("Printing something from abstract method implementation");
	}

}
