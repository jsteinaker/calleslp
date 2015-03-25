package com.jsteinaker.calleslp

public abstract class Calle {

	public static final Calle tipoCalle(int calle) {
		if (betweenAnd(calle, 1, 31)
				|| betweenAnd(calle, 115, 120)
				|| betweenAnd(calle, 132, 312))
		{
			return new NorteSur(calle);
		}
		else if (betweenAnd(calle, 32, 99)
				|| betweenAnd(calle, 600, 708))
		{
			return new EsteOeste(calle);
		}
		else if (betweenAnd(calle, 502, 531))
		{
			return new TolosaEsteOeste(calle);
		}
	}
}
