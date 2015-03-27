package com.jsteinaker.calleslp;

public class NorteSur extends Calle {

	//Constructor
	public NorteSur(int calle)
	{
	}

	public int chequearLimites(int altura) {
		if ((altura < 1) || (altura > 8799))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
