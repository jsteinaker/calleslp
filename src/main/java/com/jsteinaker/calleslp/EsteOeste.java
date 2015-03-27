package com.jsteinaker.calleslp;

public class EsteOeste extends Calle {

	//Constructor
	public EsteOeste(int calle)
	{
	}

	public int chequearLimites(int altura) {
		if ((altura < 1) || (altura > 15849))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
