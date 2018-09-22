package com.demo.types;

public class Car {
	private Engine engine;
	
	public Car(){
		System.out.println("Car is running");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	

}
