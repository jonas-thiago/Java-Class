public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(){

    }

    public Retangulo(double altura, double largura){
        this.altura= altura;
        this.largura = largura;
    }

    public void Area(){
        System.out.println(largura*altura);
    }
}
