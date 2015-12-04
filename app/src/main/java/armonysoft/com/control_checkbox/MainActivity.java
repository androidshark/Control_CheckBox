package armonysoft.com.control_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //se crean los objetos
    public TextView tv3;
    public EditText et1,et2;
    public CheckBox checkBox, checkBox2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //se inician los objetos
    TextView tv3 =(TextView)findViewById(R.id.tv3);
    EditText et1 =(EditText)findViewById(R.id.et1);
    EditText et2 =(EditText)findViewById(R.id.et2);
    CheckBox checkBox=(CheckBox)findViewById(R.id.checkBox);
    CheckBox checkBox2=(CheckBox)findViewById(R.id.checkBox2);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void operar(View view){

        //se obtiene el valor de los editText y se asigna a nro
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String resu = "";

        //se verifica cual esta marcado
        if(checkBox.isChecked()){
            int suma = nro1 + nro2;
            resu= "La suma es: " + suma;
        }

        if(checkBox2.isChecked()){
            int resta = nro1 - nro2;
            //en caso de que los dos checkbox esten seleccionados
            resu= resu + "La resta es: " + resta;
        }

        tv3.setText(resu);

    }



}
