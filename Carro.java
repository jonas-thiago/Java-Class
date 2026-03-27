public class Carro {
    private String placa;
    private int numChassi;
    private int qtnPortas;
    private int velocidade;

    public Carro(){

    }

    public Carro(String p, int numChassi, int qtnPortas, int velocidade){
        placa = p; // pode usar renomeando as variaveis mais por padrão usar o this
        this.numChassi = numChassi;
        this.qtnPortas = qtnPortas;
        this.velocidade = velocidade;
    }

    public void acelerar(int incremento){
        if (incremento >0){
            this.velocidade += incremento;
            System.out.println("Acelerando...." + this.velocidade + "km/h");
        }
    }

    public boolean frear(int decremento){
        if (this.velocidade > 0) {
            this.velocidade -= decremento;
            if(velocidade < 0) this.velocidade = 0;
            System.out.println("Freando..." + this.velocidade + "km/h");
            return true;
        }
        System.out.println("O carro já está parado");
        return false;
    
    }

    public void display() {
        if (this.velocidade > 0){
            
            System.out.println("Velocidade atual" + this.velocidade + "km/h");
        } else {
            System.out.println("O veículo está parado!!!!");
        } 
    }
}
