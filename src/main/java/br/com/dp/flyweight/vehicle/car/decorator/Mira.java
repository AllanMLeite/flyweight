package br.com.dp.flyweight.vehicle.car.decorator;

public class Mira extends ArmaDecorator {

	public Mira(Arma arma) {
		super(arma);
	}

	@Override
	public void montar() {
		super.montar();
		System.out.println("Adicionando mira a arma");
	}

}