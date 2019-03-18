package br.com.dp.flyweight.vehicle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class VehicleFactoryTest {

	@Test
	public void shouldReturnVehicleFromCache() {
		Vehicle firstBlueVehicle = VehicleFactory.createVehicle(ColorEnum.BLUE);
		Vehicle secondBlueVehicle = VehicleFactory.createVehicle(ColorEnum.BLUE);
		assertEquals(firstBlueVehicle, secondBlueVehicle);
	}
	
	@Test
	public void shouldReturnVehicleFromCacheFilteringByColor() {
		Vehicle firstBlueVehicle = VehicleFactory.createVehicle(ColorEnum.BLUE);
		Vehicle firstRedVehicle = VehicleFactory.createVehicle(ColorEnum.RED);
		assertNotEquals(firstBlueVehicle, firstRedVehicle);
	}
}
