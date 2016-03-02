package co.edu.udea.compumovil.gr11.lab1ui_cm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{ // implements OnItemSelectedListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    EditText textNombre;
    TextView textVista;
    EditText textApellidos;
    AutoCompleteTextView textPais;
    EditText textTelefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        textNombre = (EditText) findViewById(R.id.editText);
        textVista = (TextView) findViewById(R.id.textView);
        textApellidos = (EditText) findViewById(R.id.editText2);
        textPais = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        textTelefono = (EditText) findViewById(R.id.editText3);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hobbies_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

    }


    public void mostrar(View v){
        String textoNombre = String.valueOf(textNombre.getText());
        String textoApellido = String.valueOf(textApellidos.getText());
        String textoPais = String.valueOf(textPais.getText());
        String textoTelefono = String.valueOf(textTelefono.getText());
        textVista.setText("Nombre completo: " + textoNombre + textoApellido + "\n" + "Pais: " + textoPais + "\n" + "Telefono: " + textoTelefono);

    }



    /*@Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(
                parent.getContext(), "El hobbie seleccionado es: " + parent.getItemIdAtPosition(pos).toString(),
                Toast.LENGTH_LONG).show();
        )
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }*/
}
