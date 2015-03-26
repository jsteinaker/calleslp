package com.jsteinaker.calleslp

public final class TolosaNorteSur extends NorteSur {

	public int chequearLimites(int altura) {
		if (altura < 1) || (altura > 2999)
		{
			return 1
		}
		else
		{
			return 0
		}
	}

	public Resultado calcular(int calle, int altura)
	{
		int esquina1, esquina2;
		if (altura < 100)
		{
			esquina1 = 32;
			esquina2 = 531;
		}
		else
		{
			esquina1 = 531 - altura / 100;
			esquina2 = esquina1 + 1;
		}

		return new Resultado(esquina1, esquina2);
	}

}
