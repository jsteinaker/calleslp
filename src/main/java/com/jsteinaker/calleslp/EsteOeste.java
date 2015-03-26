package com.jsteinaker.calleslp

public final class EsteOeste extends Calle {

	public int chequearLimites(int altura) {
		if (altura < 1) || (altura > 15849)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
