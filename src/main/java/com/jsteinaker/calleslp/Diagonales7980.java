package com.jsteinaker.calleslp;

public class Diagonales7980 extends DiagonalesPrincipales {

	//Constructor
	public Diagonales7980(int calle)
	{
	}

	public int chequearLimites(int altura)
	{
		if ((altura < 1) || (altura > 999))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public Resultado calcular(int calle, int altura)
	{
		return super.calcular(calle,altura);
	}

}
