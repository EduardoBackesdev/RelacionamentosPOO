package relacionamentos;

public class Carro {

    boolean LimpadorParabrisa = false;

    String abrirJanela (){
        return "janela aberta";
    };

    boolean LimpaParabrisa(boolean ativar){
        this.LimpadorParabrisa = ativar;
        return ativar;
    };



};
