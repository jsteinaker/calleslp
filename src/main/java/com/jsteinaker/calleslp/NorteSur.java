package com.jsteinaker.calleslp;

public class NorteSur extends Calle {

	//Constructor
	public NorteSur(int calle)
	{
	}

	public int chequearLimites(int altura) {
		if ((altura < 1) || (altura > 8799))
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
		
		esquina1 = altura / 50 + 32;
		if (esquina1 > 51)
		{
			esquina1++;
			if (esquina1 == 99)
			{
				esquina2=600;
			}
			else if (esquina1 > 99)
			{
				esquina1 += 500;
				esquina2 = esquina1 + 1;
			}
			else
			{
				esquina2 = esquina1 + 1;
			}
		}
		else if (esquina1 == 51)
		{
			esquina2 = 53;
		}
		else
		{
			esquina2 = esquina1 + 1;
		}

		return new Resultado(esquina1, esquina2);
	}

}
