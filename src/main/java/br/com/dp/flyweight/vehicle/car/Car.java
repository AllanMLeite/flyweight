package br.com.dp.flyweight.vehicle.car;

import br.com.dp.flyweight.vehicle.ColorEnum;
import br.com.dp.flyweight.vehicle.Vehicle;

public class Car implements Vehicle {

	private ColorEnum color;
	
	public Car(ColorEnum color) {
		this.color = color;
	}

	@Override
	public void start() {
		System.out.println("starting");
	}

	@Override
	public void stop() {
		System.out.println("stopping");
	}

	@Override
	public ColorEnum getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
}
