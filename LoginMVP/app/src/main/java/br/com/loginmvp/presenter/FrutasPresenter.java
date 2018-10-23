package br.com.loginmvp.presenter;

import br.com.loginmvp.contratct.FrutasContrato;
import br.com.loginmvp.model.FrutasModel;

public class FrutasPresenter implements FrutasContrato.Presenter {

    FrutasModel frutasModel = new FrutasModel();


    //Chamar Método da ClasseFrutasPresenter;
    private FrutasContrato.View FrutasContratoView;

    //Construtor Desta Classe, Exigindo o Método View da Classe FrutasContrato;
    public FrutasPresenter(FrutasContrato.View frutasContratoView) {
        FrutasContratoView = frutasContratoView;
    }

    //Alt + Insert + Implement Methods
    @Override public void getFrutas() {
    //    ArrayList<String> frutas = frutasModel.getFrutas();

    }
}
