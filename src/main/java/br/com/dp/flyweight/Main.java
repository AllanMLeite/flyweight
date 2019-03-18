package br.com.dp.flyweight;

import br.com.dp.flyweight.vehicle.ColorEnum;
import br.com.dp.flyweight.vehicle.VehicleFactory;

public class Main {

	public static void main(String[] args) {
		System.out.println("vehicle returned: " + VehicleFactory.createVehicle(ColorEnum.BLUE));
		System.out.println("vehicle returned: " + VehicleFactory.createVehicle(ColorEnum.BLUE));
		System.out.println("vehicle returned: " + VehicleFactory.createVehicle(ColorEnum.RED));
		System.out.println("vehicle returned: " + VehicleFactory.createVehicle(ColorEnum.RED));
	}
}
