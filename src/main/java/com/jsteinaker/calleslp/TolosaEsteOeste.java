package com.jsteinaker.calleslp;

public final class TolosaEsteOeste extends Calle {

	//Constructor
	public TolosaEsteOeste(int calle)
	{
	}

	public boolean chequearLimites(int altura) {
		if ((altura < 1) || (altura > 15849))
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
		int esquina1, esquina2;
		if (altura < 300)
		{
			esquina1 = -1 * (altura / 50 - 5) + 115;
			if (esquina1 == 115)
			{
				esquina2 = 1;
			}
			else
			{
				esquina2 = esquina1 - 1;
			}
		}
		else if (altura < 1800)
		{
			esquina1 = altura / 50 - 5;
			esquina2 = esquina1 + 1;
		}
		else
		{
			esquina1 = altura / 50 - 5 + 100;
			esquina2 = esquina1 + 1;
		}

		return new Resultado(esquina1, esquina2);
	}
}
