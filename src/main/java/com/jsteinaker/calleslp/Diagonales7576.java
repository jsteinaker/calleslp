package com.jsteinaker.calleslp;

public class Diagonales7576 extends Calle {

	//Constructor
	public Diagonales7576(int calle)
	{
	}

	public int chequearLimites(int altura)
	{
		return super.chequearLimites(altura);
	}

	public Resultado calcular(int calle, int altura)
	{
		int esquina1, esquina2;

		esquina1 = altura / 100 + 14;
		esquina2 = esquina1 + 1;

		return new Resultado(esquina1, esquina2);

	}

}
