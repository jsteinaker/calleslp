package com.jsteinaker.calleslp;

public class Diagonales7374 extends DiagonalesPrincipales {

	//Constructor
	public Diagonales7374(int calle)
	{
	}

	public boolean chequearLimites(int altura)
	{
		if ((altura < 1) || (altura > 31699))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public Resultado calcular(int calle, int altura)
	{
		return super.calcular(calle, altura);
	}

}


