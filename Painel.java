package relacionamentos;

public class Painel {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Motor motor = new Motor(10.15);
        String resposta = carro.abrirJanela();
        String velocidade = motor.acelerar();

        // ------------ == --------------

        System.out.println(resposta);
        System.out.println(velocidade);
        System.out.println(carro.LimpadorParabrisa);

        // ------------ == --------------

        boolean carroLimpa = carro.LimpaParabrisa(true);
        System.out.println(carroLimpa);







    }

}
