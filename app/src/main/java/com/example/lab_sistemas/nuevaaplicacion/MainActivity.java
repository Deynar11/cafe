package com.example.lab_sistemas.nuevaaplicacion;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvPrecioUnitario;
    private EditText etNombre;
    private TextView tvContador;
    private TextView tvResNombre;
    private TextView tvResCantidad;
    private TextView tvResPrecio;
    private int cantidad;
    private double resultado;
    private double precio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad = 1;
        resultado = 0;
        precio = 3;
        tvPrecioUnitario = (TextView) findViewById(R.id.tvPrecio);
        etNombre = (EditText) findViewById(R.id.etNombre);
        tvContador = (TextView) findViewById(R.id.tvCantidad);
        tvResNombre = (TextView) findViewById(R.id.tvResNombre);
        tvResCantidad = (TextView) findViewById(R.id.tvResCantidad);
        tvResPrecio = (TextView) findViewById(R.id.tvResPrecio);

        tvContador.setText(cantidad+"");
        tvPrecioUnitario.setText("Precio Unitario: Bs."+precio);


    }
    public void menos (View v){
        if(cantidad>1){
            cantidad--;
        tvContador.setText(cantidad+"");
        }
    }
    public void mas (View v){
        cantidad++;
        tvContador.setText(cantidad+"");
    }
    public void borrar (View v){
        etNombre.setText("");
        tvContador.setText("1");
        tvResNombre.setText("");
        tvResPrecio.setText("");
        tvResCantidad.setText("");
    }
    public void calcular (View v){
        resultado = cantidad * precio;
        tvResPrecio.setText(resultado+"");
        tvResCantidad.setText(cantidad+"cafe(s)");
        tvResNombre.setText(etNombre.getText().toString());

    }

}
