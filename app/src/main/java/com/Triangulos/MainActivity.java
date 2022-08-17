package com.Triangulos;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText lado1, lado2, lado3;
    TextView resultado;
    Button identificar;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lado1 = findViewById(R.id.lado1);
        lado2 = findViewById(R.id.lado2);
        lado3 = findViewById(R.id.lado3);
        resultado = findViewById(R.id.resultado);
        identificar = findViewById(R.id.boton);
        imagen = findViewById(R.id.imagen);
    }

    public void calculo(View view) {
        if (!lado1.getText().toString().isEmpty() && !lado2.getText().toString().isEmpty() && !lado3.getText().toString().isEmpty()){
            int ladoU = Integer.parseInt(lado1.getText().toString());
            int ladoD = Integer.parseInt(lado2.getText().toString());
            int ladoT = Integer.parseInt(lado3.getText().toString());

            if (ladoU==ladoD && ladoD==ladoT){
                String equilatero = ("Es un Equilátero");
                resultado.setText(equilatero);
                imagen.setImageResource(R.drawable.quilatero_);
            }
            else if (ladoU==ladoD && ladoU!=ladoT || ladoD==ladoT && ladoD!=ladoU || ladoT==ladoU || ladoT!=ladoD){
                String isoceles = ("Es un Isosceles");
                resultado.setText(isoceles);
                imagen.setImageResource(R.drawable.isosceles);
            }
            if (ladoU!=ladoD && ladoU!=ladoT && ladoD!=ladoT){
                String escaleno = ("Es un Escaléno");
                resultado.setText(escaleno);
                imagen.setImageResource(R.drawable.escaleno);
            }
        }
    }
}