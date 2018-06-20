package com.sqliteteste;

import android.provider.ContactsContract;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sqliteteste.database.dao.PessoaDAO;
import com.sqliteteste.database.model.PessoaModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PessoaDAO io_dao;
    private EditText edtNome;
    private EditText edtCpf;
    private EditText edtEndereco;
    private EditText edtCep;
    private Button btnSalvar;
    private Button btnConsultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        io_dao = new PessoaDAO(this);

        edtNome = (EditText)findViewById(R.id.nome);
        edtCpf = (EditText)findViewById(R.id.cpf);
        edtEndereco = (EditText)findViewById(R.id.endereco);
        edtCep = (EditText)findViewById(R.id.cep);

        btnSalvar = (Button)findViewById(R.id.bt_salvar);
        btnConsultar = (Button)findViewById(R.id.bt_consultar);
    }
    public void BotaoSalvar(View view){
        io_dao.Insert(
                edtNome.getText().toString(),
                edtCpf.getText().toString(),
                edtEndereco.getText().toString(),
                edtCep.getText().toString());

                edtNome.setText("");
                edtCpf.setText("");
                edtEndereco.setText("");
                edtCep.setText("");



    }
    public void BotaoConsultar(View view){
        List<PessoaModel> listaPessoa = io_dao.Select();

        for (PessoaModel p : listaPessoa) {
            edtNome.setText(p.getNome());
        }

    }
}
