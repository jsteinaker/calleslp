package com.jsteinaker.calleslp;

public abstract class DiagonalesMenores extends Calle {

	public boolean chequearLimites(int altura)
	{
		if ((altura < 1) || (altura > 1099))
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public abstract Resultado calcular(int calle, int altura);

}
