package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        localizarComponentes();
        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valorAlcool = Double.parseDouble(precoAlcool.getText().toString());
                Double valorGasolina = Double.parseDouble(precoGasolina.getText().toString());

                if(valorAlcool/valorGasolina>=0.7){
                    //Gasolina
                    textoResultado.setText("É melhor utilizar Gasolina!");
                }else{
                    textoResultado.setText("É melhor utilizar Álcool!");
                }

            }
        });

    }

    private void localizarComponentes(){
        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);
    }
}
