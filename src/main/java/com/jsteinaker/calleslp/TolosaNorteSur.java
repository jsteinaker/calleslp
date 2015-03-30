package com.jsteinaker.calleslp;

public final class TolosaNorteSur extends Calle {

	//Constructor
	public TolosaNorteSur(int calle)
	{
	}

	public boolean chequearLimites(int altura) {
		if ((altura < 1) || (altura > 2999))
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
