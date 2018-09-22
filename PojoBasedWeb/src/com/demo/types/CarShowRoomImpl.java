package com.demo.types;

public class CarShowRoomImpl implements CarShowRoom {

	@Override
	public Car buyCar(Engine engine) {
		Car car=null;
		car = new Car();
		car.setEngine(engine);
		return car;
	}
	
}
