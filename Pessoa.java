public class Pessoa {
    private String nome;
    private double altura;
    private int idade;
    private double peso;

    public Pessoa(){

    }

    public Pessoa(String nome, double altura, int idade, double peso){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
    }

    public void andar(){
        System.out.println("Está andando...");
    }
    
    public void cantar(){
        System.out.println("Está cantando...");
    }
}
