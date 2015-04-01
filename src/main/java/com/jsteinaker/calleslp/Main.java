package com.jsteinaker.calleslp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Main extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	/** Llamada cuando se presiona el botón Calcular */
	public void calcular(View view)
	{	
		char checkbox;
		Calle calleIngresada;
		Resultado resultado;

		// Asociamos el TextView, lo necesitaremos para mostrar resultados o errores.
		TextView textView = (TextView) findViewById(R.id.txt_resultado);

		// Obtenemos calle
		EditText editText = (EditText) findViewById(R.id.edt_calle);
		int numerocalle = Integer.parseInt(editText.getText().toString());

		// Obtenemos altura
		editText = (EditText) findViewById(R.id.edt_altura);
		int alturacalle = Integer.parseInt(editText.getText().toString());

		// Obtenemos estado Diagonal/Tolosa
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rbtn_tipo_direccion);
		int idchequeado = radioGroup.getCheckedRadioButtonId();

		if (idchequeado == R.id.rbtn_diagonal)
		{
			checkbox = 'd';
		}
		else if (idchequeado == R.id.rbtn_tolosa)
		{
			checkbox = 't';
		}
		else
		{
			checkbox = '0';
		}

		// Al derivador, que crea un objeto de distinta clase de acuerdo al tipo de calle
		calleIngresada = Calle.tipoCalle(numerocalle, checkbox);
		
		if (calleIngresada == null)
		{
			textView.setText("La calle ingresada no existe. Por favor, verifique los datos e intente nuevamente.");
		}
		else if (calleIngresada.chequearLimites(alturacalle))
		{
			resultado = calleIngresada.calcular(numerocalle, alturacalle);

			// Excepciones para las calles 51, 52 y 53, que se comportan de manera distinta.
			if ((resultado.getEsquina1() == -51) || (resultado.getEsquina1() == -53))
			{
				textView.setText("La calle " + numerocalle + " sólo existe entre las calles 1 y 31 (numeración entre 300 y 1799).");
			}
			else if (resultado.getEsquina1() == -52)
			{
				textView.setText("La calle 52 no existe entre las calles 1 y 27 (numeración entre 300 y 1599).");
			}
			else
			{
				textView.setText(numerocalle + " N°" + alturacalle + " queda entre " + resultado.getEsquina1() + " y " + resultado.getEsquina2());	
			}
		}
		else
		{
			textView.setText("La altura no existe en la calle especificada. Por favor, cheque los datos e intente nuevamente.");	
		}

	}

}
