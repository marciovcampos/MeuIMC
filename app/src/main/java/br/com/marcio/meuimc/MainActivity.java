package br.com.marcio.meuimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalcularIMC(View view){
        TextView txtIMC = findViewById(R.id.txtImcId);
        TextView txtDescricaoIMC = findViewById(R.id.txtDescricaoImcId);

        EditText edtPeso = findViewById(R.id.edtPesoId);
        EditText edtAltura = findViewById(R.id.edtAlturaId);

        double peso = Double.valueOf(edtPeso.getText().toString());
        double altura = Double.parseDouble(edtAltura.getText().toString())/100;
        double imc = Math.round(peso/(altura*altura));
        txtIMC.setText(String.valueOf(imc));

        String descricao = informaClassificacaoIMC(imc);

        txtDescricaoIMC.setText(String.valueOf(descricao));

    }

    public String informaClassificacaoIMC(double imc){

        String descricao = "PESO NORMAL";

        return descricao;

    }
}
