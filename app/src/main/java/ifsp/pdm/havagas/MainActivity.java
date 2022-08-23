package ifsp.pdm.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import ifsp.pdm.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;
    private Formulario formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());
        formulario = new Formulario();

        amb.limparBt.setOnClickListener(view -> {
            amb.nomeEt.setText("");
            amb.emailEt.setText("");
            amb.receberEmail.setChecked(false);
            amb.telefoneEt.setText("");
            amb.celularOpCb.setChecked(false);
            amb.celularEt.setVisibility(View.GONE);
            amb.celularEt.setText("");
            if (!amb.telefoneComercialRd.isChecked()){
                amb.telefoneComercialRd.setChecked(true);
            }
            amb.formacaoSp.setSelection(0);
            amb.telefoneComercialRd.setChecked(true);
            amb.anoFormatura.setText("");
            amb.anoConclusao.setText("");
            amb.instituicao.setText("");
            amb.tituloMonografia.setText("");
            amb.orientadorMonografia.setText("");
            amb.anoFormatura.setVisibility(View.GONE);
            amb.anoConclusao.setVisibility(View.GONE);
            amb.instituicao.setVisibility(View.GONE);
            amb.tituloMonografia.setVisibility(View.GONE);
            amb.orientadorMonografia.setVisibility(View.GONE);
            amb.vagasInteresse.setText("");
            formulario = null;
        });

        amb.salvarBt.setOnClickListener(view -> {
            formulario.setNome(amb.nomeEt.getText().toString());
            formulario.setEmail(amb.emailEt.getText().toString());
            formulario.setReceberEmailOp(amb.receberEmail.isChecked() ? "Sim" : "Nao");
            formulario.setTelefone(amb.telefoneEt.getText().toString());
            formulario.setTelefoneComercialResidencial(amb.telefoneComercialRd.isChecked() ? getString(R.string.telefoneComercial) : getString(R.string.telefoneComercial));
            formulario.setCelular(amb.celularEt.getText().toString());
            formulario.setFormação(amb.formacaoSp.getSelectedItem().toString());
            formulario.setVagasInteresse(amb.vagasInteresse.getText().toString());
            formulario.setAnoFormacao(amb.anoFormatura.getText().toString());
            formulario.setAnoConclusao(amb.anoConclusao.getText().toString());
            formulario.setInstituicaoFormacao(amb.instituicao.getText().toString());
            formulario.setTituloMonografiaFormacao(amb.tituloMonografia.getText().toString());
            formulario.setOrientadorMonografiaFormacao(amb.orientadorMonografia.getText().toString());

            Toast.makeText(this, formulario.toString(), Toast.LENGTH_SHORT).show();
        });

        amb.formacaoSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0 || position == 1){
                    amb.anoFormatura.setVisibility(View.VISIBLE);
                } else {
                    amb.anoFormatura.setVisibility(View.GONE);
                }
                if (position == 2 || position == 3){
                    amb.anoConclusao.setVisibility(View.VISIBLE);
                    amb.instituicao.setVisibility(View.VISIBLE);
                } else {
                    amb.anoConclusao.setVisibility(View.GONE);
                    amb.instituicao.setVisibility(View.GONE);
                }
                if (position == 4 || position == 5 ){
                    amb.anoConclusao.setVisibility(View.VISIBLE);
                    amb.instituicao.setVisibility(View.VISIBLE);
                    amb.tituloMonografia.setVisibility(View.VISIBLE);
                    amb.orientadorMonografia.setVisibility(View.VISIBLE);
                } else {
                    amb.tituloMonografia.setVisibility(View.GONE);
                    amb.orientadorMonografia.setVisibility(View.GONE);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        amb.celularOpCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (amb.celularOpCb.isChecked()){
                    amb.celularEt.setVisibility(View.VISIBLE);
                } else {
                    amb.celularEt.setVisibility(View.GONE);
                }
            }
        });

    }
}