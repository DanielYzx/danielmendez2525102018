package utec.edu.sv.ejer2guia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnombre, etprecio;

    Button btCalcaular;

    TextView tresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombre=findViewById(R.id.edtNombre);
        etprecio=findViewById(R.id.edtPrecio);
        btCalcaular=findViewById(R.id.btnCalcular);
        tresultado=findViewById(R.id.txvResultado);

    }

    public void IVA(View i)
     {
         double precio1,resultado;
         double iva;
         String name="";
         iva=1.134;
         precio1=Double.parseDouble(etprecio.getText().toString());
         resultado=precio1*iva;
         tresultado.setText("El precio del producto con iva es:"+String.valueOf(resultado));
     }
}