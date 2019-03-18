package br.com.dp.flyweight.vehicle.car.decorator;

public class Silenciador extends ArmaDecorator {

	public Silenciador(Arma arma) {
		super(arma);
	}

	@Override
	public void montar() {
		super.montar();
		System.out.println("Adicionando silenciador a arma");
	}

}