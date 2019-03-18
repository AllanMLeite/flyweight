package br.com.dp.flyweight.vehicle;

import java.util.EnumMap;
import java.util.Map;

import br.com.dp.flyweight.vehicle.car.Car;

public class VehicleFactory {
	
	private VehicleFactory() {
		// prevents instantiation
	}

	private static Map<ColorEnum, Vehicle> vehiclesCache = new EnumMap<>(ColorEnum.class);

	public static Vehicle createVehicle(ColorEnum color) {
		long startTimeLocalNS = System.nanoTime();
		Vehicle vei = vehiclesCache.computeIfAbsent(color, newColor -> {
			System.out.println("creating new veicle for color: " + color);
			return new Car(newColor);
		});
		long endTimeLocalNS = System.nanoTime();
		System.out.println("total duration time: "+ (endTimeLocalNS - startTimeLocalNS));
		return vei;
	}
}
