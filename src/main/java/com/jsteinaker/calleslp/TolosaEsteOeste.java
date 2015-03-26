package com.jsteinaker.calleslp

public final class TolosaEsteOeste extends EsteOeste {

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
