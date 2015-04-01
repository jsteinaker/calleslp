package com.jsteinaker.calleslp;

public abstract class Calle {

	protected static boolean entreCalles(int calle, int menor, int mayor)
	{
		return calle >= menor && calle <=mayor;
	}
	
	public static final Calle tipoCalle(int calle, char checkbox)
	{
		if (checkbox == 'd')
		{
			switch (calle)
			{
				case 73:
				case 74:
							return new Diagonales7374(calle);
				case 75:
				case 76:
							return new Diagonales7576(calle);
				case 77:
				case 78:
							return new Diagonales7778(calle);
				case 79:
				case 80:
							return new Diagonales7980(calle);
				default:
							return null;
			}
		}
		else if (checkbox == 't')
		{
				if (entreCalles(calle, 502, 531))
				{
					return new TolosaEsteOeste(calle);
				}
				else if (entreCalles(calle, 1, 31))
				{
					return new TolosaNorteSur(calle);
				}
				else
				{
					return null;
				}
		}
		else
		{
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
				return null;
				}
		}
	}

	public abstract boolean chequearLimites(int altura);

	public abstract Resultado calcular(int calle, int altura);

}
