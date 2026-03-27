public class Main {
    public static void main(String[] args) {
        Carro uno = new Carro("cla-75a7", 789798798,4,100);
        if(!uno.frear(50)){
            uno.acelerar(30);
        }

        Pessoa jonas = new Pessoa("Jonas", 1.68, 35, 61.0);

        jonas.andar();
        jonas.cantar();

        Retangulo retangulo = new Retangulo(1.78,1.88);

        retangulo.Area();

        Computador meuPC = new Computador("Ryzen 7", "16GB","SSD 512 GB");

        meuPC.jogar();
        meuPC.ligarPC();
        meuPC.jogar();
    }

    
}
