public class Cachorro {
    private String nome;
    private String raca;
    private double peso;
    private int idade;

    public Cachorro(){

    }

    public Cachorro(String nome, String raca, double peso, int idade) {
        this.nome= nome;
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    public void comer(){
        System.out.println(nome + "está comendo");
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }
}
