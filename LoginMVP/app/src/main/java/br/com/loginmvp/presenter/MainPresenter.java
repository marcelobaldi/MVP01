package br.com.loginmvp.presenter;
import br.com.loginmvp.contratct.MainContrato;
import br.com.loginmvp.model.LoginModel;

public class MainPresenter implements MainContrato.Presenter {

    //Chamar e Instanciar a Classe Repositório Sessão
    LoginModel loginModel = new LoginModel();

    //Chamar o metodo view da classe maincontrato;
    MainContrato.View maincontratoview;

    //Construtor da Classe
    public MainPresenter(MainContrato.View maincontratoview) {
        this.maincontratoview = maincontratoview;
    }

    //Al + Insert + Implement Method
    @Override public void loginClicado(String nome, String senha) {
        //Se Nome Vazio
        if (nome.isEmpty()){
            maincontratoview.mostrarMensagem( "Nome Inválido" );
            return;  //sai do método
        }

        //Se Senha Vazia
        if (senha.isEmpty()){
            maincontratoview.mostrarMensagem( "Senha Inválida" );
            return; //sai do método
        }

        //Campos Preenchidos
        boolean loginComSucesso = loginModel.login( nome, senha );

        if (loginComSucesso) {
            maincontratoview.mostrarMensagem( "Login Efetuado" );
            maincontratoview.iniciaAtividadeFrutas();
        }else{
            maincontratoview.mostrarMensagem( "Falha no Login" );
        }

    }
}

//Return:           Sai do Método !!!!!!!!!!!!!!!!

//MainPresenter:    Herança do Método Presenter da Classe MainContrato;
//MainPresenter:    Chama o Método View da Classe MainContrato (declarar);
//MainPresenter:    Construtor com a Variável do Método View da Classe MainContrato;




//Implementar o Método Presenter, da Classe MainContrato;
//Fazer o Construtor (View). Não Entendi..............................................................

