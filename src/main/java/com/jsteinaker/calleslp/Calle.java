package com.jsteinaker.calleslp;

public abstract class Calle {

	protected static boolean entreCalles(int calle, int menor, int mayor)
	{
		return calle >= menor && calle <=mayor;
	}
	
	public static final Calle tipoCalle(int calle) {
		if (entreCalles(calle, 1, 31)
				|| entreCalles(calle, 115, 120)
				|| entreCalles(calle, 132, 312))
		{
			return new NorteSur(calle);
		}
		else if (entreCalles(calle, 32, 99)
				|| entreCalles(calle, 600, 708))
		{
			return new EsteOeste(calle);
		}
		else if (entreCalles(calle, 502, 531))
		{
			return new TolosaEsteOeste(calle);
		}
		else
		{
			return new TolosaNorteSur(calle);
		}
	}

	public abstract boolean chequearLimites(int altura);

}
