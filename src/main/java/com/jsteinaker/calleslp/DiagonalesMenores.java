package com.jsteinaker.calleslp;

public abstract class DiagonalesMenores extends Calle {

	public int chequearLimites(int altura)
	{
		if ((altura < 1) || (altura > 1099))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public abstract Resultado calcular(int calle, int altura);

}
