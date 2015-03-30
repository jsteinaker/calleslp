package com.jsteinaker.calleslp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
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

		calleIngresada = Calle.tipoCalle(numerocalle, checkbox);

	}
}
