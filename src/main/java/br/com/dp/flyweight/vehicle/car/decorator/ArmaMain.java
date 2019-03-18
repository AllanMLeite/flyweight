package br.com.dp.flyweight.vehicle.car.decorator;

import org.hamcrest.core.IsInstanceOf;

public class ArmaMain {

	public static void main(String[] args) {
		Arma armaCompleta = new Silenciador( new Mira( new ArmaBase() ) );
		armaCompleta.montar();
		
		System.out.println(armaCompleta instanceof ArmaBase);

		/* Monta uma arma sem acessórios */
		Arma armaB = new ArmaBase();
		armaB.montar();

		/* Monta uma arma com silenciador */
		Arma armaComSilenciador = new Silenciador( armaB );
		armaComSilenciador.montar();

		/* Monta uma arma com mira */
		Arma armaComMira = new Mira( armaB );
		armaComMira.montar();
	}
}
