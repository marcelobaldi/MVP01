package br.com.loginmvp.view;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.loginmvp.R;
import br.com.loginmvp.contratct.FrutasContrato;
import br.com.loginmvp.presenter.FrutasPresenter;

public class FrutasActivity extends AppCompatActivity implements FrutasContrato.View {

    //Declarar Classes e Declarar Objetos
    FrutasPresenter presenter;
    ListView             listaObjeto;
    ArrayAdapter<String> adapter;

    @Override protected void onCreate(Bundle savedInstanceState) {super.onCreate( savedInstanceState );
        //Página Xml
        setContentView( R.layout.activity_frutas );

        //Instanciar Classes e Identificar Objetos
        presenter = new FrutasPresenter( this);
        listaObjeto = (ListView) findViewById( R.id.lista_frutas );

        //Carregar Frutas
        presenter.getFrutas();
    }

    //Método da Classe Pai (obrigatório pois é uma interface)
    @Override public void mostraDados(ArrayList<String> frutas) {
        adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, frutas );
        listaObjeto.setAdapter( adapter );
    }
}
