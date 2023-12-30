package relacionamentos;

public class Motor {

    double velocidade = 0.0;

    public  Motor(double velocidade){
        this.velocidade = velocidade;
    };

    public String acelerar(){
        return "seu carro esta a:"+this.velocidade+"km por hora";
    }



}
