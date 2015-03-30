package com.jsteinaker.calleslp;

public class Diagonales7980 extends DiagonalesPrincipales {

	//Constructor
	public Diagonales7980(int calle)
	{
	}

	public boolean chequearLimites(int altura)
	{
		if ((altura < 1) || (altura > 999))
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
		return super.calcular(calle,altura);
	}

}
