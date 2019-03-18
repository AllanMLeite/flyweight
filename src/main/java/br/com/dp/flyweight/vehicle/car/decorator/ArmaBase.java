package br.com.dp.flyweight.vehicle.car.decorator;

public class ArmaBase implements Arma {

	@Override
	public void montar() {
		System.out.println("Essa é uma arma base");
	}

}