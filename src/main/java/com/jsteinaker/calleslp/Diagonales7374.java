package com.jsteinaker.calleslp;

public class Diagonales7374 extends DiagonalesPrincipales {

	//Constructor
	public Diagonales7374(int calle)
	{
	}

	public int chequearLimites(int altura)
	{
		if ((altura < 1) || (altura > 31699))
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
		return super.calcular(calle, altura);
	}

}


