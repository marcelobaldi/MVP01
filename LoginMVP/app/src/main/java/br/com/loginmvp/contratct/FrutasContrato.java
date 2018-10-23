package br.com.loginmvp.contratct;
import java.lang.reflect.Array;
import java.util.ArrayList;

public interface FrutasContrato {
  //  ArrayList<String> frutas = new ArrayList<String>();         //Declarar e Instanciar ArrayList

    interface View{
        void mostraDados(ArrayList<String> frutas);
    }

    interface Presenter{
        void getFrutas();       //Método GetFrutas;
    }

}


