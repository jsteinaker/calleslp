package com.jsteinaker.calleslp

public final class NorteSur extends Calle {

	public int chequearLimites(int altura) {
		if (altura < 1) || (altura > 8799)
		{
			return 1
		}
		else
		{
			return 0
		}
	}
}
