package co.edu.udea.compumovil.gr11.lab1ui_cm;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    EditText textNombre;
    TextView textVista;
    EditText textApellidos;
    AutoCompleteTextView textPais;
    EditText textTelefono;
    RadioButton textFemenino;
    RadioButton textMasculino;
    EditText textEmail;
    EditText textDireccion;
    CheckBox textFavorito;
    Spinner textHobbies;
    DatePicker textFecha;
    Integer itemSeleccionado;


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
        textFemenino = (RadioButton) findViewById(R.id.radioButton);
        textMasculino = (RadioButton) findViewById(R.id.radioButton2);
        textEmail = (EditText) findViewById(R.id.editText5);
        textDireccion = (EditText) findViewById(R.id.editText4);
        textFecha = (DatePicker) findViewById(R.id.datePicker);
        textFavorito = (CheckBox) findViewById(R.id.checkBox);
        textHobbies = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hobbies_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

        String[] paises = getResources().getStringArray(R.array.countries_array);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        textPais.setAdapter(adapter2);

    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        itemSeleccionado = (Integer) parent.getItemAtPosition(pos);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void mostrar(View v){
        String textoNombre = String.valueOf(textNombre.getText());
        String textoApellido = String.valueOf(textApellidos.getText());
        String textoPais = String.valueOf(textPais.getText());
        String textoTelefono = String.valueOf(textTelefono.getText());
        String textoEmail = String.valueOf(textEmail.getText());
        String textoDireccion = String.valueOf(textDireccion.getText());
        String textoFecha = String.valueOf(textFecha.getMonth() + "/" + textFecha.getDayOfMonth() + "/" + textFecha.getYear());
        Object selectedItem = textHobbies.getSelectedItem();
        String textoHobbie = selectedItem.toString();
        String textoFavorito;

        if(textFavorito.isChecked()){
            textoFavorito = "Si";
        } else {
            textoFavorito = "No";
        }

        String textoSexo;
        if(textFemenino.isChecked()){
            textoSexo = "Femenino";
        } else if (textMasculino.isChecked()){
            textoSexo = "Masculino";
        } else {
            textoSexo = "Sin definir";
        }

        textVista.setText("Nombre completo: " + textoNombre + " " + textoApellido + "\n" + "Fecha de Nacimiento: "
                + textoFecha + "\n" + "Pais: " + textoPais + "\n" + "Telefono: " + textoTelefono + "\n" +
                "Sexo: " + textoSexo + "\n" + "Email: " + textoEmail + "\n" + "Dirección:" + textoDireccion +
                "\n" + "Hobbie: " + textoHobbie + "\n" + "Favorito: " + textoFavorito + "\n");

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
