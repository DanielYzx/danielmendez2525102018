package utec.edu.sv.proyintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etval1,etval2;
    Button btSuma,btResta,btMulti,btDiv;
    TextView tresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etval1=findViewById(R.id.edtValorr1);
        etval2=findViewById(R.id.edtValorr2);
        btSuma=findViewById(R.id.btnSuma);
        btResta=findViewById(R.id.btnRestar);
        btMulti=findViewById(R.id.btnMul);
        btDiv=findViewById(R.id.btnDiv);
        tresultado=findViewById(R.id.txvResultado);
    }
    // void              .... metodos sn retorno
    // int, string, etec .... metodos con retorno
    public void Suma (View s)
    {
        double dato1,dato2,resultado;

        dato1=Double.parseDouble(etval1.getText().toString());
        dato2=Double.parseDouble(etval2.getText().toString());
        resultado=dato1+dato2;
        tresultado.setText("El resultado es :"+String.valueOf(resultado));

    }
    public void Resta (View r)
    {
        double dato1,dato2,resultado;

        dato1=Double.parseDouble(etval1.getText().toString());
        dato2=Double.parseDouble(etval2.getText().toString());
        resultado=dato1-dato2;
        tresultado.setText("El resultado es :"+String.valueOf(resultado));

    }
    public void Multiplicar (View m)
    {
        double dato1,dato2,resultado;

        dato1=Double.parseDouble(etval1.getText().toString());
        dato2=Double.parseDouble(etval2.getText().toString());
        resultado=dato1*dato2;
        tresultado.setText("El resultado es :"+String.valueOf(resultado));

    }
    public void Dividir (View d)
    {
        double dato1,dato2,resultado;

        dato1=Double.parseDouble(etval1.getText().toString());
        dato2=Double.parseDouble(etval2.getText().toString());
        resultado=dato1/dato2;
        tresultado.setText("El resultado es :"+String.valueOf(resultado));

    }
}