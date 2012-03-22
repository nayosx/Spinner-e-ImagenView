package com.nayosx.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.Spinner;

public class Main extends Activity {
    /** Called when the activity is first created. */
	Spinner cambiar;//se crea el objeto spinner
	ImageView img;//tambien el imagenview
	
	/*
	 *Con el sigueinte arreglo se tomara el numero 
	 *entero que corresponde a cada una de las imagenes
	 *este se encuentra en gen/R.java
	 *esa clase no se toca para nada
	 *es generada por el mismo proyecto 
	 */
	int[] imagenes = {R.drawable.img01, 
			R.drawable.img02,
			R.drawable.img03, 
			R.drawable.img04, 
			R.drawable.img05, 
			R.drawable.img06};
   
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initialize();
    }
	
	/*
	 * El siguente metod es usado para crear los objetos en concretos
	 * asi como tambien los eventos que hara el spinner
	 */
    private void initialize()
    {
    	img = (ImageView) findViewById(R.id.imageView1); //busca el imagenview del main.xml
    	cambiar = (Spinner) findViewById(R.id.getIma); //busca el spinner del main.xml
    	cambiar.setOnItemSelectedListener(new OnItemSelectedListener(){ 
    		//OnItemSelectedListener() se ejecuta al hacer clic en el spinner

			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//por medio de arg2 se obtiene un indice del array_anime.xml
				//y de esa forma lo pasa a img, para recuperar la imagen esperada
				img.setImageResource(imagenes[arg2]);
			}

			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
    		
    	});
    	
    }
}