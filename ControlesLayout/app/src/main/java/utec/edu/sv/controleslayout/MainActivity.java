package utec.edu.sv.controleslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spPais;
    EditText etNombre, etApellido, etInfo;
    RadioButton rbtFem, rbtMas, rbtOtr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //EditText
        etNombre=findViewById(R.id.edtNombre);
        etApellido=findViewById(R.id.edtApellido);
        etInfo=findViewById(R.id.editTextTextMultiLine);
        //Spinner
        spPais=findViewById(R.id.spnPais);
        //Radiobuttons
        rbtFem=findViewById(R.id.rbtFemenino);
        rbtMas=findViewById(R.id.rbtMasculino);
        rbtOtr=findViewById(R.id.rbtOtros);


        /* forma 1
        spPais.setSelection(0,false);
        String []opciones={"Seleccione un pais","Guatemala","El Salvador","Honduras","Nicaragua","Costa Rica","Panama"};
        ArrayAdapter<String> adaptador=
                new ArrayAdapter<>(this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opciones);

        spPais.setAdapter(adaptador);

         */
        ArrayAdapter<String>  adaptador= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item){
          public View getView(int posicion, View contenido, ViewGroup parent){
              View vista=super.getView(posicion, contenido, parent);
              if(posicion==getCount()){
                  ((TextView)vista.findViewById(android.R.id.text1)).setText("");
                  ((TextView)vista.findViewById(android.R.id.text1)).setHint(getItem(getCount()));
              }
              return vista;
          }

          public int getCount(){
            return super.getCount()-1;
          }
        };

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adaptador.add("Guatemala");
        adaptador.add("El Salvador");
        adaptador.add("Honduras");
        adaptador.add("Nicaragua");
        adaptador.add("Costa Rica");
        adaptador.add("Panama");
        adaptador.add("Seleccione un pais");//este es el elemento a quitar del spinner
        spPais.setAdapter(adaptador);
        spPais.setSelection(adaptador.getCount());

    }
    public void Almacenar(View v){
        String datos="";
        String seleccion= spPais.getSelectedItem().toString();
        //get traer
        //set enviar
        String nombre=etNombre.getText().toString();
        String apellido=etApellido.getText().toString();
        String genero="";
        String info;


        if (rbtMas.isChecked()==false && rbtFem.isChecked()==false && rbtOtr.isChecked()==false)
        {
            //generar mensaje
            Toast mensaje= Toast.makeText(this,"Seleccione un genero",Toast.LENGTH_SHORT);
            mensaje.show();
        }
        else {
            if (rbtMas.isChecked() == true) {
                genero = "Masculino";
            } else if (rbtFem.isChecked() == true) {
                genero = "Femenino";
            } else {
                genero = "otros";
            }
        }


        if(seleccion.equals("Seleccione un pais")){
            datos="No selecciono ningun pais";
            //etInfo.append(datos);
        }
        else if(seleccion.equals("Guatemala")) {
                datos = "Guatemala";
               // etInfo.append(datos);
            }
        else if(seleccion.equals("El Salvador")) {
            datos = "El Salvador";
           // etInfo.append(datos);
        }
        else if(seleccion.equals("Honduras")) {
            datos = "Honduras";
            //etInfo.append(datos);
        }
        else if(seleccion.equals("Nicaragua")) {
            datos = "Nicaragua";
            //etInfo.append(datos);
        }
        else if(seleccion.equals("Costa Rica")) {
            datos = "Costa Rica";
           // etInfo.append(datos);
        }
        else if(seleccion.equals("Panama")) {
            datos = "Panama";
           // etInfo.append(datos);
        }

        info="Los datos ingresados son los sigientes:\n"+
                "Nombre:"+nombre+"\n"+
                "Apellido:"+apellido+"\n"+
                "Genero:"+genero+"\n"+
                "Pais:"+datos+"\n";

        etInfo.append(info);
    }
}