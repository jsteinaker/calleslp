package com.jsteinaker.calleslp;

public abstract class DiagonalesPrincipales extends Calle {

	public abstract int chequearLimites(int altura);

	public Resultado calcular(int calle, int altura)
	{
		int esquina1, esquina2;

		if (altura < 600)
		{
			esquina1 = -1 * (altura / 100 - 5) + 115;
			if (esquina1 == 115)
			{
				esquina2 = 1;
			}
			else
			{
				esquina2 = esquina1 - 1;
			}
		}
		else if (altura < 3600)
		{
			esquina1 = altura / 100 - 5;
			esquina2 = esquina1 + 1;
		}
		else
		{
			esquina1 = altura / 100 - 5 + 100;
			esquina2 = esquina1 + 1;
		}

		return new Resultado(esquina1, esquina2);

	}

}
